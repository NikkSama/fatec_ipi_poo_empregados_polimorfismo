package empregado_sem_polimorfismo;

public class Empregado {
    private int tipo;
    private double salario;
    private double comissao;
    private double bonus;
    private double horasTrabalhadas;
    private double valorHora;
    private int numeroDeTarefas;
    private double valorTarefa;

    public Empregado(int tipo) {
        this.tipo = tipo;
    }

    public int getNumeroDeTarefas() {
        return numeroDeTarefas;
    }

    public void setNumeroDeTarefas(int numeroDeTarefas) {
        this.numeroDeTarefas = numeroDeTarefas;
    }

    public double getValorTarefa() {
        return valorTarefa;
    }

    public void setValorTarefa(double valorTarefa) {
        this.valorTarefa = valorTarefa;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getTipo() {
        return tipo;
    }

    public double getSalario() {
        return salario;
    }

    public double getComissao() {
        return comissao;
    }

    public double getBonus() {
        return bonus;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }




}
