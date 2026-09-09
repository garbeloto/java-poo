public class App {
    public static void main(String[] args) throws Exception {
        //Exercício 4:
        Jogador jogador1 = new Jogador("Angelina", "Meio-Campista", 8, 25);
        Jogador jogador2 = new Jogador("Kerolin", "Atacante");

        System.out.println("Informações das jogadoras: ");
        jogador1.exibirInformacoesJogador();
        jogador2.exibirInformacoesJogador();

        jogador1.alterarNumeroJogador(9);
        jogador1.alterarIdadeJogador(26);

        jogador2.alterarNumeroJogador(10);
        jogador2.alterarIdadeJogador(26);
        
        System.out.println("---------------------------");
        System.out.println("Informações das jogadoras após alterações: ");
        jogador1.exibirInformacoesJogador();
        jogador2.exibirInformacoesJogador();

        

        //Exercício 3:
        /* Jogo jogo1 = new Jogo("The Last Of Us", "Ação-Aventura/Terror de Sobrevivência");
        Jogo jogo2 = new Jogo("Shadow Of The Tomb Raider", "Ação-Aventura", 2018, 219.90);

        jogo1.exibirInformacoesJogo();
        jogo2.exibirInformacoesJogo();
        jogo2.aplicarDescontoJogo(15); */


        //Exercício 2:
        /* Aviao aviao1 = new Aviao("BC300", "GOL", 320, 2024);
        Aviao aviao2 = new Aviao("AS4000", "LATAM");

        aviao1.exibirInformacoesAviao();
        aviao2.exibirInformacoesAviao(); */


        //Exercício 1:
        /* Smartphone smartphone1 = new Smartphone("Samsung", "Galaxy S26 Ultra", 256, 7000);

        Smartphone smartphone2 = new Smartphone("Apple", "Iphone 17 Pro Max");

        smartphone1.exibirInformacoesSmartphone();
        smartphone2.exibirInformacoesSmartphone(); */
    }
}
