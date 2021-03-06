package empregados_polimorfismo;

public class EmpregadoHorista extends Empregado {
    private double valorHora;
    private double horasTrabalhadas;

    public EmpregadoHorista(double valorHora, double horasTrabalhadas) {
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calculaSalario() {
        return valorHora * horasTrabalhadas;
    }
}
