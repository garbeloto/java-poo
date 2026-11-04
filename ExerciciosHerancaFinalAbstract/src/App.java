public class App {
    public static void main(String[] args) throws Exception {
        // Exercicio 02:
        Transacao pagBoleto = new BoletoBancario(1001, 150.00, "1111111111111111111");
        Transacao pagCartao = new CartaoCredito(1002, 200.00, 5);

        pagBoleto.processarTransacao();
        pagCartao.processarTransacao();

        Transacao pagCartaoInvalido = new CartaoCredito(1003, 50.00, 15);
        pagCartaoInvalido.processarTransacao();


        
        // Exercicio 01:
        /*
         * Desenvolvedor desenvolvedor = new Desenvolvedor("rafaela", 2342, 4000, true);
         * 
         * GerenteProjetos gerenteProjetos = new GerenteProjetos("Maria", 3422, 3000,
         * 3);
         * 
         * System.out.println("---Holerite Funcionario Desenvolvedor---");
         * desenvolvedor.exibirHolerite();
         * System.out.println();
         * System.out.println("---Holerite Funcionario Gerente de Projetos---");
         * gerenteProjetos.exibirHolerite();
         */
    }
}
