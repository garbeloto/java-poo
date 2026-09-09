public class Filme {
    String titulo;
    String genero;
    int duracao;
    double nota;
    
    public Filme(String titulo, String genero, int duracao, double nota) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.nota = nota;
    }

    public Filme() {

    }

    public void exibirInformacoes(){
        System.out.println("Título: " + titulo);
        System.out.println("Gênero: "  + genero);
        System.out.println("Duração: " + duracao);
        System.out.println("Nota: " + nota);
    }
}
