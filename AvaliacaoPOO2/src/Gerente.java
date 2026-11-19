public class Gerente extends Colaborador{
    private double bonusGestao = 0.20;

    public Gerente(String nome, String cpf, double salarioBase, String dataAdmissao, String categoria, boolean ferias,
            int anosCompletos) {
        super(nome, cpf, salarioBase, dataAdmissao, categoria, ferias, anosCompletos);
    }

    @Override
    public double calcularAdicionalCargo() {
        return getSalarioBase() * bonusGestao;
    }

    @Override
    public double getPercentualAdicionalCargo() {
        return bonusGestao;
    }

    @Override
    public String getDescricaoAdicionalCargo() {
        return "adicional de gestão";
    }

    public double getBonusGestao() {
        return bonusGestao;
    }

}
