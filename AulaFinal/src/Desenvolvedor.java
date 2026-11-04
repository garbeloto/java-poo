public class Desenvolvedor extends Funcionario2 {

    public Desenvolvedor(String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() * 1.10;
    }
    
    
}
