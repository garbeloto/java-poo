public class Jogador {
    String nome;
    String posicao;
    int numero;
    int idade;


    public Jogador(String nome, String posicao, int numero, int idade) {
        this.nome = nome;
        this.posicao = posicao;
        this.numero = numero;
        this.idade = idade;
    }


    public Jogador(String nome, String posicao) {
        this.nome = nome;
        this.posicao = posicao;
        this.numero = 0;
        this.idade = 0;
    }

    public void exibirInformacoesJogador(){
        System.out.println("Nome: " + nome);
        System.out.println("Posição: " + posicao);
        System.out.println("Número da Camisa: " + numero);
        System.out.println("idade: " + idade);
    }

    public int alterarNumeroJogador(int novoNumero){
        return numero = novoNumero;
    }

    public int alterarIdadeJogador(int novaIdade){
        return idade = novaIdade;
    }

    

    
}
