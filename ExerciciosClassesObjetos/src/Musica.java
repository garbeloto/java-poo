public class Musica {
    String titulo;
    String artista;
    double duracao;
    int ano;

    public void exibirInformacao(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duração: " + duracao);
        System.out.println("Ano: " + ano);
    }

    public void alterarDuracao(double novaDuracao){
        duracao = novaDuracao;
    }
}
