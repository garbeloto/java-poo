public class Fornecedor {
    String nome;
    String cidade;

    public Fornecedor() {
    }

    public Fornecedor(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public void exibirInformacoes(){
        System.out.println("Fornecedor: " + nome);
        System.out.println("Cidade: " + cidade);
    }
    
}
