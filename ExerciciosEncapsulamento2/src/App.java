public class App {
    public static void main(String[] args) throws Exception {
        //Exercício 01:
        /* Ingresso ingresso = new Ingresso("The Eras Tour", "Pista", 60);

        System.out.println("----------Informações do Ingresso----------");
        System.out.println("Ingresso Evento: " + ingresso.getNomeEvento());
        System.out.println("Tipo: " + ingresso.getTipo());
        System.out.println("Preço: " + ingresso.getPreco());
        System.out.println("Preço final com taxa: " + ingresso.getPrecoFinal());

        ingresso.setPreco(40);
        ingresso.setTipo("Camarote");

        ingresso.setPreco(230);

        System.out.println("----------Informações do Ingresso Atualizadas----------");
        System.out.println("Ingresso Evento: " + ingresso.getNomeEvento());
        System.out.println("Tipo: " + ingresso.getTipo());
        System.out.println("Preço: " + ingresso.getPreco());
        System.out.println("Preço final com taxa: " + ingresso.getPrecoFinal()); */

        
        //Exercício 02:

        /* Funcionario funcionario3 = new Funcionario("Sophia", "Engenheira de Software", 2000);

        funcionario3.consultarFuncionario();
        System.out.println("Faixa salarial: " + funcionario3.getFaixaSalarial());

        System.out.println("===============Dados do Funcionario com salario atualizado=================");
        
        funcionario3.setSalario(10000);

        funcionario3.consultarFuncionario();
        System.out.println("Faixa salarial: " + funcionario3.getFaixaSalarial());
 */
        //Exercício 03:
        /* Pedido pedido = new Pedido(121, 30);

        pedido.setStatus("preparando");
        pedido.getResumo(); */


        Produto produto = new Produto("Notebook", 5000, 15);


        System.out.println(produto.getPrecoFinal());
        System.out.println(produto.isEmPromocao());
    }
}
