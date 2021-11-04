package empregados_polimorfismo;

public class EmpregadoAssalariado extends Empregado {
    private double salario;
    @Override
    public double calculaSalario() {
        return salario;
    }

    public EmpregadoAssalariado(double salario) {
        this.salario = salario;
    }
}
