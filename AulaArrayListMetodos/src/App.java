import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nomes = new ArrayList<>();

        adicionaNome(nomes, "João");
        adicionaNome(nomes, "Maria");
        adicionaNome(nomes, "José");

        listaNomes(nomes);
    }

    public static void adicionaNome(ArrayList<String> nomes, String nome){
        nomes.add(nome);
    }

    public static void listaNomes(ArrayList<String> nomes){
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Nome: " + nomes.get(i));
        }
    }
}
