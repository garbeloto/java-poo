public class Comentario {
    String texto;
    Usuario autor;

    public Comentario(String texto, Usuario autor) {
        this.texto = texto;
        this.autor = autor;
    }

    public void exibirInformacoes(){
        System.out.println("Texto: " + texto);
        autor.exibirInformacoes();
        
    }
}
