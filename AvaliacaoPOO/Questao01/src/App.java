import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        MestreCervejeiro mestre1 = new MestreCervejeiro("João", "Preparador", 8);
        MestreCervejeiro mestre2 = new MestreCervejeiro("Maria", "Misturador", 10);
        MestreCervejeiro mestre3 = new MestreCervejeiro("Roberto", "Embalador", 3);

        Cerveja cerveja1 = new Cerveja("Spaten", "Puro Malte", 6.06, 6.90, mestre1);
        Cerveja cerveja2 = new Cerveja("Sol", "Puro Malte", 7, 6.90, mestre2);
        Cerveja cerveja3 = new Cerveja("Skol", "Zero Alcool", 0.06, 6.50, mestre2);
        Cerveja cerveja4 = new Cerveja("Itaipava", "Puro Malte", 3.06, 6.90, mestre3);
        Cerveja cerveja5 = new Cerveja("Brahma", "Puro Malte", 9.06, 6.90, mestre3);

        ArrayList<ClasseLote> lote = new ArrayList<>();

        lote.add(new ClasseLote("111111BA", cerveja1, 400));
        lote.add(new ClasseLote("111143BA", cerveja2, 900));
        lote.add(new ClasseLote("111234BA", cerveja3, 300));
        lote.add(new ClasseLote("111345BA", cerveja4, 3000));
        lote.add(new ClasseLote("111999BA", cerveja5, 1000));

        System.out.println("===========INFORMAÇÕES LOTES==========");
        for (ClasseLote l : lote) {
            l.exibirInformacoes();
            l.verificarProducao();
            System.out.println("Valor Produção: " + l.calcularValorProducao());
            System.out.println("--------------");
            System.out.println(" ");
        }

        System.out.println("===========LOTES COM PRODUÇÃO MAIOR QUE R$20.000,00==========");
        for (ClasseLote  l : lote) {
            if (l.calcularValorProducao() > 20000) {
                l.exibirInformacoes();
                System.out.println("Valor Produção: " + l.calcularValorProducao());
                System.out.println("--------------");
            System.out.println(" ");
            }
        }
    }
}
