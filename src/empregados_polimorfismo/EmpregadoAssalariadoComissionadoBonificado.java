package empregados_polimorfismo;

public class EmpregadoAssalariadoComissionadoBonificado extends EmpregadoAssalariadoComissionado{
    public double bonus;

    public EmpregadoAssalariadoComissionadoBonificado(double salario, double comissao, double bonus) {
        super(salario, comissao);
        this.bonus = bonus;
    }

    @Override
    public double calculaSalario() {
        //return getSalario() + getSalario() * getComissao() + bonus;
        return super.calculaSalario() + bonus;
    }
}
