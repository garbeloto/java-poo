public class App {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta("Maria");

        conta.depositar(1000);
        conta.depositar(500);
        conta.sacar(300);
        conta.sacar(2000);
        System.out.println("Saldo: "+ conta.getSaldo());

    }
}
