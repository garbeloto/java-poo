import java.util.List;

public class Funcionario {
    private String nome;
    private double salario;
    private Endereco endereco;
    //private List<Endereco> endereco; funcionario recebendo mais de um endereco

    public Funcionario(String nome, double salario, Endereco endereco) {
        this.nome = nome;
        this.salario = salario;
        this.endereco = endereco;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);

        System.out.println("Endereco: ");
        endereco.exibirEndereco();
    }

}
