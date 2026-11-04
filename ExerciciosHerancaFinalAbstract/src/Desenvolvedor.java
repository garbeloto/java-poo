public class Desenvolvedor extends Funcionario {

    private boolean certificacaoTecnica;

    public Desenvolvedor(String nome, int matricula, double salarioBase, boolean certificacaoTecnica) {
        super(nome, matricula, salarioBase);
        this.certificacaoTecnica = certificacaoTecnica;
    }

    @Override
    public double calculaBonusSalario() {
        if (certificacaoTecnica == true) {
            return (getSalarioBase() * 1.15) + 1500.00;
        } else {
            return getSalarioBase() * 1.15;
        }
    }


}
