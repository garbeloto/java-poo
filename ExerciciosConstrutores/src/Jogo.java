public class Jogo {
    String titulo;
    String genero;
    int ano;
    double preco;

    public Jogo(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.ano = 0;
        this.preco = 0;
    }


    public Jogo(String titulo, String genero, int ano, double preco) {
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
        this.preco = preco;
    }

    public void exibirInformacoesJogo(){
        System.out.println("Título: " + titulo);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: " + preco);
    }

    public void aplicarDescontoJogo(int percentual){
        preco = preco - (preco * percentual/100);
    }

}
