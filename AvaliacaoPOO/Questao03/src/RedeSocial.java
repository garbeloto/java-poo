import java.util.ArrayList;

public class RedeSocial {
    String nome;
    ArrayList<Usuario> usuarios;
    ArrayList<Postagem> postagens;

    public RedeSocial(String nome) {
        this.nome = nome;
        this.usuarios = new ArrayList<>();
        this.postagens = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void adicionarPostagem(Postagem postagem){
        postagens.add(postagem);
    }

    public void listarUsuarios(){
        for (Usuario u : usuarios) {
            u.exibirInformacoes();
            System.out.println("-----------");
            System.out.println(" ");
        }
    }

    public void listarPostagens(){
        for (Postagem p : postagens) {
            p.exibirInformacoes();
            System.out.println("-----------");
            System.out.println(" ");
        }
    }
}
