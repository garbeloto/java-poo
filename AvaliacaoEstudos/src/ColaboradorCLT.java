public class ColaboradorCLT extends Colaborador{
    private String cargo;
    private double bonusCargo;
    
    public ColaboradorCLT(String nome, int matricula, double salarioContrato, String cargo, double bonusCargo) {
        super(nome, matricula, salarioContrato);
        this.cargo = cargo;
        this.bonusCargo = bonusCargo;
    }

    @Override
    public double proventoBruto() {
        return getSalarioContrato() + bonusCargo;
    }

    public String getCargo() {
        return cargo;
    }

    public double getBonusCargo() {
        return bonusCargo;
    }

    
}
