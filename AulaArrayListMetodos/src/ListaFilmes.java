import java.util.ArrayList;

public class ListaFilmes {
    public static void main(String[] args) {
        ArrayList<String> filmes = new ArrayList<>();

        adicionarFilme(filmes, "obsession");
        adicionarFilme(filmes, "imagine me and you");
        adicionarFilme(filmes, "summerland");

        listarFilmes(filmes);

        alterarFilme(filmes, 2, "but i am a cheerleader");

        System.out.println(" ");

        listarFilmes(filmes);

        removerFilme(filmes,0);

        System.out.println(" ");

        listarFilmes(filmes);

        System.out.println("Quantidade de filmes: " + quantidadeFilme(filmes));
    }

    public static void adicionarFilme(ArrayList<String> filmes, String filme){
        filmes.add(filme);
    }

    public static void listarFilmes(ArrayList<String> filmes){
        for (int i = 0; i < filmes.size(); i++) {
            System.out.println("Filme: " + filmes.get(i));
        }
    }

    public static void alterarFilme(ArrayList<String> filmes, int posicaoAlterar, String novoFilme){
        filmes.set(posicaoAlterar, novoFilme);
    }

    public static void removerFilme(ArrayList<String> filmes, int posicaoRemover){
        filmes.remove(posicaoRemover);
    }

    public static int quantidadeFilme(ArrayList<String> filmes){
        return filmes.size();
    }

}
