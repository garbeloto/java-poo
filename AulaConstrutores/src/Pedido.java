public class Pedido {
    int numero;
    int mesa;
    Prato prato;

    public Pedido(int numero, int mesa, Prato prato) {
        this.numero = numero;
        this.mesa = mesa;
        this.prato = prato;
    }

    public Pedido() {

    }

    public void exibirInformacoes( ){
        System.out.println("Número pedido: "  + numero);
        System.out.println("Mesa: " + mesa);

        System.out.println("Prato: ");
        prato.exibirInformacoes();
    }
}
