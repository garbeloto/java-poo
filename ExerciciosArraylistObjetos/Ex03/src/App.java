import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        //8 convidados:
        Convidado convidado1 = new Convidado("Maria", 18, true);
        Convidado convidado2 = new Convidado("Ana", 18, true);
        Convidado convidado3 = new Convidado("Pedro", 17, true);
        Convidado convidado4 = new Convidado("João", 16, false);
        Convidado convidado5 = new Convidado("Giovana", 19, false);
        Convidado convidado6 = new Convidado("Carlos", 19, true);
        Convidado convidado7 = new Convidado("Vitória", 17, true);
        Convidado convidado8 = new Convidado("Enzo", 17, false);


        Festa festa = new Festa("Festa de Aniversário da Maria", "Casa da Maria", convidado1);

        ArrayList<Convidado> convidado = new ArrayList<>();

        convidado.add(convidado1);
        convidado.add(convidado2);
        convidado.add(convidado3);
        convidado.add(convidado4);
        convidado.add(convidado5);
        convidado.add(convidado6);
        convidado.add(convidado7);
        convidado.add(convidado8);

        System.out.println("========CONVIDADOS========");
        for (Convidado c : convidado) {
            c.exibirInformacoes();
            c.verificaEntrada(c);
            System.out.println("----------------");
            System.out.println(" ");
        }

        System.out.println("========CONVIDADOS VIP========");
        for (Convidado c : convidado) {
            if (c.vip = true) {
                c.exibirInformacoes();
                c.verificaEntrada(c);
                System.out.println("----------------");
                System.out.println(" ");
            }
        }
        
        System.out.println("========CONVIDADOS MAIORES DE IDADE========");
        for (Convidado c : convidado) {
            if (c.idade >= 18) {
                c.exibirInformacoes();
                System.out.println("----------------");
                System.out.println(" ");
            }
        }
    }
}
