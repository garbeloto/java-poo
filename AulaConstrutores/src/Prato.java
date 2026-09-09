public class Prato {
    String nome;
    String descricao;
    Double preco;


    public Prato(String nome, String descricao, Double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Prato() {

    }

    public void exibirInformacoes(){ 
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao) ;
        System.out.println("Preço: " + preco);
    }
}
