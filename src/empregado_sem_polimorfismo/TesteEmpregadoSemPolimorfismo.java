package empregado_sem_polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TesteEmpregadoSemPolimorfismo {
    public static void main(String[] args) {
        Random gerador = new Random();
        List<EmpregadoS> empregados;
        empregados = new ArrayList<>();
        //simula um acesso a uma base de dados
        //a estrutura usada nao nos preocupa
        for(int i = 0; i < 10; i++){
            int tipo = gerador.nextInt(5) + 1;
            EmpregadoS e = new EmpregadoS(tipo);
            switch(tipo){
                case 1:
                    e.setSalario(2000 + gerador.nextDouble() * 1200);
                    break;
                case 2:
                    e.setSalario(1800 + gerador.nextDouble() * 700);
                    e.setComissao(gerador.nextDouble() * 0.2);
                    break;
                case 3:
                    e.setSalario(1500 + gerador.nextDouble() * 500);
                    e.setComissao(gerador.nextDouble() * 0.15);
                    e.setBonus(500 + gerador.nextDouble() * 500);
                    break;
                case 4:
                    e.setValorHora(20 + gerador.nextDouble() * 50);
                    e.setHorasTrabalhadas(120 + gerador.nextDouble() * 40);
                    break;
                case 5:
                    e.setNumeroDeTarefas(50 + gerador.nextInt(21));
                    e.setValorTarefa(100 + gerador.nextDouble() * 30);
                    break;
            }
            empregados.add(e);
        }
        //estrutura de seleção que será preocupante
        for (int i = 0; i < empregados.size(); i++){
            double salarioFinal = 0;
            //ruim, não faça isso
            if(empregados.get(i).getTipo() == 1){
                salarioFinal = empregados.get(i).getSalario();
            }
            else if (empregados.get(i).getTipo() == 2){
                salarioFinal = empregados.get(i).getSalario() + empregados.get(i).
                        getSalario() * empregados.get(i).getComissao();
            }
            else if (empregados.get(i).getTipo() == 3){
                salarioFinal = empregados.get(i).getSalario() + empregados.
                        get(i).getSalario() * empregados.get(i).getComissao() + empregados.get(i).getBonus();

            }
            else if (empregados.get(i).getTipo() == 4){
                salarioFinal = empregados.get(i).getHorasTrabalhadas() * empregados.get(i).getValorHora();
            }
            else if (empregados.get(i).getTipo() == 5 ) {
                salarioFinal = empregados.get(i).getNumeroDeTarefas() * empregados.get(i).getValorTarefa();
            }
            System.out.printf("EmpregadoS %d: %.2f\n", i + 1, salarioFinal);
        }
    }
}
