package empregados_polimorfismo;

public class EmpregadoAssalariadoComissionado extends EmpregadoAssalariado{
    private double comissao;

    public EmpregadoAssalariadoComissionado(double salario, double comissao) {
        super(salario);
        this.comissao = comissao;
    }

    @Override
    public double calculaSalario() {
        //return getSalario() + getSalario() * comissao;
        return super.calculaSalario() + super.calculaSalario() * comissao;
    }
}
