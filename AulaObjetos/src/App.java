public class App {
    public static void main(String[] args) throws Exception {
        Livros livros = new Livros();

        livros.autor = "Clara Alves";
        livros.autor = "Conectadas";
        livros.ano = 2020;
        livros.paginasLidas = 100;

        livros.ler(10);
        livros.voltarPagina(4);

        System.out.println("Páginas lidas: " + livros.consultarPagina());
        


        /* ContaBancaria conta = new ContaBancaria();

        conta.titular = "rafaela";
        conta.numero = 5509;
        conta.saldo = 100;

        conta.depositar(1100);
        conta.sacar(300);
        
        System.out.println("Saldo: " + conta.consultarSaldo()); */
        
    }
}
