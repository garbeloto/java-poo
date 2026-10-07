import java.util.ArrayList;

public class Postagem {
    String texto;
    Usuario autor;
    int curtidas;
    ArrayList<Comentario> comentarios;

    public Postagem(String texto, Usuario autor, int curtidas) {
        this.texto = texto;
        this.autor = autor;
        this.curtidas = curtidas;
        this.comentarios = new ArrayList<>();
    }

    public void  adicionarComentario(Comentario comentario){
        comentarios.add(comentario);
    }

    public void  exibirInformacoes(){
        System.out.println("Texto: " + texto);
        autor.exibirInformacoes();
        System.out.println("Quantidade comentarios: " + calcularQuantidadeComentario(comentarios));
        System.out.println("Curtidas: " + curtidas);
        

    }

    public int calcularQuantidadeComentario(ArrayList<Comentario> comentarios){
        int quantidade = 0;
        for (Comentario c : comentarios) {
            quantidade++;
        }
        return quantidade;
    }

    public void classificarPopularidade(){
        if (curtidas < 10) {
            System.out.println( "Pouco popular");
        } else if (curtidas >= 10 && curtidas <= 50) {
            System.out.println( "Popular");
        } else if (curtidas > 50) {
            System.out.println("Muito popular");
        }
    }
}
