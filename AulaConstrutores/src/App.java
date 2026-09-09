import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Filme> filmes = new ArrayList<>();

        filmes.add(new  Filme("Bottoms", "Comédia", 94, 8.4));
        filmes.add(new Filme("Imagine Me And You", "Drama", 110, 9.3));
        filmes.add(new  Filme("O Som da Morte", "Suspense", 130, 7.2));
        filmes.add(new  Filme("My Fisrt Summer", "Drama", 90, 9.0));
        filmes.add(new  Filme("Supergirl", "Ação/Aventura", 100, 8.2));

        System.out.println("---Todos os filmes---");

        for (Filme filme : filmes) {
            filme.exibirInformacoes();
            System.out.println("-----------------------------");
        }

        System.out.println("---Filmes com nota maior ou igual a 8---");
        for (Filme filme : filmes) {           
                if (filme.nota >= 8) {
                    System.out.println(filme.titulo + " | Nota: " + filme.nota);
                }
        }

        /* Aviao aviao1 = new Aviao("Boin 737", "LATAM");
        Aviao aviao2 = new Aviao("Airbus A320", "GOL");

        ArrayList<Aviao> frota = new ArrayList<>();

        frota.add(aviao1);
        frota.add(aviao2);

        for (Aviao aviao : frota) {
            System.out.println(aviao.modelo);
        } */

        /* Prato prato = new Prato("Filé com fritas", "Filé de carne com batatas fritas", 49.90);

        Pedido pedido = new Pedido(103, 8, prato);
        pedido.exibirInformacoes(); */




    }
}
