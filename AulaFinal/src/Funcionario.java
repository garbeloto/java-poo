public class Funcionario {
    private String nome;
    private double salario;
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public final double calculaSalario(){
        return salario * 0.80;
    }
    
}
