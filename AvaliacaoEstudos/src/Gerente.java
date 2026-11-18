public class Gerente extends Funcionario{

    private double bonusGestao;

    public Gerente(String nome, String cpf, double salarioBase, double bonusGestao) {
        super(nome, cpf, salarioBase);
        this.bonusGestao = bonusGestao;
    }

    @Override 
    public double calcularSalarioLiquido(){
        double bruto = getSalarioBase() + bonusGestao;
        return bruto * 0.89;
    }



    
    
}
