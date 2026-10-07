import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Plataforma plataforma = new Plataforma("Apple Max");

        Conteudo conteudo1 = new Conteudo("Silo", "Ficção", 1000, 14);
        Conteudo conteudo2 = new Conteudo("Widows Bay", "Terror", 320, 16);
        Conteudo conteudo3 = new Conteudo("Ruptura", "Drama", 600, 14);
        Conteudo conteudo4 = new Conteudo("Dickinson", "Drama", 620, 16);
        Conteudo conteudo5 = new Conteudo("Hacks", "Comédia", 1340, 16);
        Conteudo conteudo6 = new Conteudo("All Her Fault", "Minisérie", 400, 14);

        plataforma.adicionarConteudo(conteudo1);
        plataforma.adicionarConteudo(conteudo2);
        plataforma.adicionarConteudo(conteudo3);
        plataforma.adicionarConteudo(conteudo4);
        plataforma.adicionarConteudo(conteudo5);
        plataforma.adicionarConteudo(conteudo6);
        

        Plano plano1 = new Plano("Plano Basico com anuncios", 10.90, 1);
        Plano plano2 = new Plano("Plano Premium sem anuncios", 29.90, 2);
        Plano plano3 = new Plano("Plano Familia sem anuncios", 44.90, 5);

        ArrayList<Usuario> usuario = new ArrayList<>();

        usuario.add(new Usuario("Gabriela", 7, plano1));
        usuario.add(new Usuario("Rafaela", 20, plano1));
        usuario.add(new Usuario("Alexandra", 46, plano2));
        usuario.add(new Usuario("Edilon", 48, plano3));

        plataforma.listarConteudos();

        String listarConteudosPorGenero = "Ficção";
        System.out.println("========listar conteudo por " + listarConteudosPorGenero +" ========");
        plataforma.listarConteudosPorGenero(listarConteudosPorGenero);

        System.out.println("=========Usuarios======");
        for (Usuario u : usuario) {
            u.exibirInformacoes();
            conteudo1.verificarClassificacao(u.idade);
            System.out.println("--------------");
            System.out.println(" ");
        }

        System.out.println("=========Usuarios que possuem plano com mais de uma tela======");
        for (Usuario u : usuario) {
            if (u.plano == plano2 || u.plano == plano3) {
                u.exibirInformacoes();
                System.out.println("--------------");
                System.out.println(" ");
            } else {
                System.out.println("Usuario Invalido");
            }
        }

    }
}
