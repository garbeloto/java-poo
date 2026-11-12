public class App {
    public static void main(String[] args) throws Exception {
        Endereco endereco = new Endereco("Rua getulio vargas", 120, "Tubarão");

        Funcionario joao = new Funcionario("Joao", 5000, endereco);

        joao.exibirDados();
    }
}
