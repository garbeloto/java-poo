import java.util.ArrayList;

public class GerenciaPlaylist {
    public static void main(String[] args) {
        ArrayList<String> playList = new ArrayList<>();

        adicionarMusica(playList, "Out Of The Woods");
        adicionarMusica(playList, "my way");
        adicionarMusica(playList, "Sometimes");
        adicionarMusica(playList, "stupid song");

        listarMusicas(playList);

        removerMusica(playList, 1);

        listarMusicas(playList);

        System.out.println("Quantidade Músicas: " + quantidadeMusicas(playList));
    }


    public static void adicionarMusica(ArrayList<String> Lista, String musica){
        Lista.add(musica);
    }
    
    public static void listarMusicas(ArrayList<String> musicas){
        for (int i = 0; i < musicas.size(); i++) {
            System.out.println("- " + musicas.get(i));
        }
    }

    public static void removerMusica(ArrayList<String> musicas, int posicao){
        musicas.remove(posicao);
    }

    public static int quantidadeMusicas(ArrayList<String> musicas){
        return musicas.size();
    }
}
