public class Usuario {
    String nome;
    int idade;
    String cidade;

    public Usuario(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public void exibirInformacoes(){
        System.out.println("Usuario: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
    }
}
