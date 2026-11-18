public final class Estagiario extends Funcionario{
    private double auxilioTransporte;

    public Estagiario(String nome, String cpf, double salarioBase, double auxilioTransporte) {
        super(nome, cpf, salarioBase);
        this.auxilioTransporte = auxilioTransporte;
    }

    @Override
    public double calcularSalarioLiquido() {
        return getSalarioBase() + auxilioTransporte;
    }

    
}
