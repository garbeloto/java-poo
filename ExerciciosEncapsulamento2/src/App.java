public class App {
    public static void main(String[] args) throws Exception {
        //Exercício 01:
        Ingresso ingresso = new Ingresso("The Eras Tour", "Pista", 60);

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
        System.out.println("Preço final com taxa: " + ingresso.getPrecoFinal());

        
        //Exercício 02:
        /* Funcionario funcionario1 = new Funcionario("Rafaela", 
        "desenvolvedora", 1980);

        Funcionario funcionario2 = new Funcionario("Gabriela", 
        "Analista de Sistemas", 2500);

        Funcionario funcionario3 = new Funcionario("Sophia", "Engenheira de Software", 7000);

        funcionario3.consultarFuncionario();
        funcionario3.getFaixaSalarial();

        System.out.println("===============Dados do Funcionario com salario atualizado=================");
        
        funcionario3.alterarSalario(10000);

        funcionario3.consultarFuncionario();
        funcionario3.getFaixaSalarial(); */

        //Exercício 03:
    }
}
