public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente("rafaela", "11111111111", "26/04/2006", 1231314);
        Veiculo veiculo = new Veiculo("Fiat", "Uno", "ABC123", 2009);

        Locacao locacao = new Locacao(cliente, veiculo, "20/10/2026", "25/10/2026", 500);

        locacao.exibirDados();

        /* Endereco endereco = new Endereco("Rua getulio vargas", 120, "Tubarão");

        Funcionario joao = new Funcionario("Joao", 5000, endereco);

        joao.exibirDados(); */
    }
}
