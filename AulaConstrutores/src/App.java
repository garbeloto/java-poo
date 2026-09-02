public class App {
    public static void main(String[] args) throws Exception {
        Quarto quarto01 = new Quarto(01, "Apartamento", 80, false);
        Quarto quarto02 = new Quarto(02, "Suite");

        quarto01.exibirInformacoes();
        quarto02.exibirInformacoes();


        /* Jogo jogo = new Jogo("Sonic", "Aventura");
        Jogo jogo1 = new Jogo();
        Jogo jogo2 = new Jogo("Fifa", "Esporte", 2007, 150);

        jogo.exibirInformacoes();
        jogo.aplicarDesconto(35);
        jogo.consultaPreco(); */

    }
}
