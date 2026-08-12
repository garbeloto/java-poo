import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList <String> nomes = new ArrayList<>(); //cria lista

        nomes.add("João"); //itens da lista
        nomes.add("Maria");
        nomes.add("Pedro");

        System.out.println(nomes.get(1));
       
        nomes.add("José");

        System.out.println(nomes.size());

        nomes.set(2, "Samuel"); //edita com o set

        nomes.remove(1);

        for (int i = 0; i < nomes.size(); i++) { //percorre a lista
            System.out.println(nomes.get(i));
        }

    }
}
