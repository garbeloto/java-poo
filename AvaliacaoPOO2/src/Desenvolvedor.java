public class Desenvolvedor extends Colaborador{
    private double adicionalTecnico = 0.10;

    public Desenvolvedor(String nome, String cpf, double salarioBase, String dataAdmissao, String categoria,
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
}
