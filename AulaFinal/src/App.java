public class App {
    public static void main(String[] args) throws Exception {
        Gerente gerente = new Gerente("Rafa", "1111111111", 7000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Maria", "222222222", 6000);

        gerente.calcularSalarioFinal();
        desenvolvedor.calcularSalarioFinal();

        System.out.println("---Dados Gerente---");
        gerente.exibirDados();
        
        System.out.println();

        System.out.println("---Dados Desenvolvedor---");
        desenvolvedor.exibirDados();

        /* Estagiario estagiario = new Estagiario("Rafaela", 2000);
        Funcionario funcionario = new Funcionario("Maria", 4000);

        estagiario.calculaSalario();
        funcionario.calculaSalario(); */
    }
}
