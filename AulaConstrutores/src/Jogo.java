public class Jogo {
    String titulo;
    String genero;
    int ano;
    double preco;

    public Jogo(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.ano = 2000;
        this.preco = 500;
    }

    public Jogo(){

    }

    public Jogo(String titulo, String genero, int ano, double preco) {
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
        this.preco = preco;
    }

    public void exibirInformacoes(){
        System.out.println("Título: " + titulo);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: " + preco);
    }

    public void aplicarDesconto(int percentual){
        preco = preco - (preco * percentual/100);
    }

    public void consultaPreco(){
        System.out.println("Preço: " + preco);
    }
}
