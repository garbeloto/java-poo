public class Gerente extends Funcionario2 {

    public Gerente(String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() * 1.20;
    }

    
    
}
