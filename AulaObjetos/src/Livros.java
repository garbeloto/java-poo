public class Livros {
    String titulo;
    String autor;
    int ano;
    int paginasLidas;


    public void ler(int paginas){
        paginasLidas = paginasLidas + paginas;
    }

    public void voltarPagina(int paginas){
        paginasLidas = paginasLidas - paginas;
    }

    public int consultarPagina(){
        return paginasLidas;
    }


    
}
