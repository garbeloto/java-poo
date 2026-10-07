import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        RedeSocial redeSocial = new RedeSocial("Minha rede social");
        Usuario usuario1 = new Usuario("Rafaela", 20, "Tubarão");
        Usuario usuario2 = new Usuario("Gabriela", 13, "Tubarão");
        Usuario usuario3 = new Usuario("João", 30, "Imbituba");
        Usuario usuario4 = new Usuario("Maria", 50, "Jaguaruna");
        Usuario usuario5 = new Usuario("Roberto", 40, "Laguna");

        redeSocial.adicionarUsuario(usuario1);
        redeSocial.adicionarUsuario(usuario2);
        redeSocial.adicionarUsuario(usuario3);
        redeSocial.adicionarUsuario(usuario4);
        redeSocial.adicionarUsuario(usuario5);

        Postagem postagem1 = new Postagem(null, usuario1, 2);
        Postagem postagem2 = new Postagem("oii gente", usuario2, 12);
        Postagem postagem3 = new Postagem("bom dia", usuario3, 60);
        Postagem postagem4 = new Postagem("boa noite", usuario4, 20);
        Postagem postagem5 = new Postagem("boa tarde", usuario5, 20);
        Postagem postagem6 = new Postagem("olá", usuario1, 100);

        redeSocial.adicionarPostagem(postagem1);
        redeSocial.adicionarPostagem(postagem2);
        redeSocial.adicionarPostagem(postagem3);
        redeSocial.adicionarPostagem(postagem4);
        redeSocial.adicionarPostagem(postagem5);
        redeSocial.adicionarPostagem(postagem6);

        ArrayList<RedeSocial> redeSocialX = new ArrayList<>();
        System.out.println("=========TODOS USUARIOS==========");
        for (RedeSocial r: redeSocialX) {
            r.listarUsuarios();
            r.listarPostagens();
        }

        System.out.println("=========POSTS COM MAIS DE 50 CURTIDAS==========");
        for (RedeSocial r: redeSocialX) {
            
        }

        String cidadeFiltro = "Laguna";
        
        System.out.println("========== usuários da cidade: " + cidadeFiltro + " ==========");
        
        for (RedeSocial rs : redeSocialX) {
            for (Usuario usuario : rs.usuarios) {
                if (usuario.cidade.equals(cidadeFiltro)) {
                    usuario.exibirInformacoes();
                    System.out.println("------");
                }
            }
        }
    }
}
