public class GerenteProjetos extends Funcionario{
    private int projetoEntregue;

    public GerenteProjetos(String nome, int matricula, double salarioBase, int projetoEntregue) {
        super(nome, matricula, salarioBase);
        this.projetoEntregue = projetoEntregue;
    }

    @Override
    public double calculaBonusSalario() {
        return (getSalarioBase() * 0.20) + (projetoEntregue * 500.00);
    }
}
