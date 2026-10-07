import java.util.ArrayList;

public class Plataforma {
    String nome;
    ArrayList<Conteudo> catalogo;

    public Plataforma() {
    }

    

    public Plataforma(String nome) {
        this.nome = nome;
        this.catalogo = new ArrayList<>();
    }



    public void adicionarConteudo(Conteudo conteudo){
        catalogo.add(conteudo);

    }

    public void listarConteudos(){
    System.out.println("=======CONTEUDOS========");
        for (Conteudo conteudo : catalogo) {
            conteudo.exibirInformacoes();
            System.out.println("--------------");
            System.out.println(" ");
        }
    }

    public void listarConteudosPorGenero(String genero) {
        for (Conteudo conteudo : catalogo) {
            if (conteudo.genero.equalsIgnoreCase(genero)) {
                conteudo.exibirInformacoes();
                 System.out.println("--------------");
                System.out.println(" ");
            }
           
        }
    }
}
