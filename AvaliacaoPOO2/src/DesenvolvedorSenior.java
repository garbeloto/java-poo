public class DesenvolvedorSenior extends Colaborador{
    private double adicionalTecnico = 0.10;
    private double bonusSenior = 0.15;

    public DesenvolvedorSenior(String nome, String cpf, double salarioBase, String dataAdmissao, String categoria,
            boolean ferias, int anosCompletos) {
        super(nome, cpf, salarioBase, dataAdmissao, categoria, ferias, anosCompletos);
    }

    @Override
    public double calcularAdicionalCargo() {
        return getSalarioBase() * adicionalTecnico;
    }

    @Override
    public double getPercentualAdicionalCargo() {
        return adicionalTecnico;
    }

    @Override
    public String getDescricaoAdicionalCargo() {
        return "adicional técnico";
    }

    @Override
    public double calcularAdicionalComplementar() {
        return getSalarioBase() * bonusSenior;
    }

    @Override
    public double getPercentualAdicionalComplementar() {
        return bonusSenior;
    }

    @Override
    public String getDescricaoAdicionalComplementar() {
        return "adicional de senioridade";
    }

    public double getAdicionalTecnico() {
        return adicionalTecnico;
    }

    public double getBonusSenior() {
        return bonusSenior;
    }

}
