public class App {
    public static void main(String[] args) throws Exception {
        Desenvolvedor desenvolvedor = new Desenvolvedor("rafaela", 2342, 4000, true);

        GerenteProjetos gerenteProjetos = new GerenteProjetos("Maria", 3422, 3000, 3);

        desenvolvedor.exibirHolerite();
        gerenteProjetos.exibirHolerite();
    }
}
