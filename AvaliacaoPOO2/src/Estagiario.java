public class Estagiario extends Colaborador {


    public Estagiario(String nome, String cpf, double salarioBase, String dataAdmissao, String categoria,
            boolean ferias, int anosCompletos) {
        super(nome, cpf, salarioBase, dataAdmissao, categoria, ferias, anosCompletos);
    }

    @Override
    public double calcularAdicionalCargo() {
        return 0.0;
    }

    @Override
    public double getPercentualAdicionalCargo() {
        return 0.0;
    }

    @Override
    public String getDescricaoAdicionalCargo() {
        return "adicional";
    }

    @Override
    protected String getDescricaoSalarioBase() {
        return "bolsa-auxílio";
    }

    @Override
    protected boolean recebeQuinquenio() {
        return false;
    }
}
