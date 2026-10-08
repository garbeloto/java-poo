public class Pedido {
    private int numero;
    private double valor;
    private String status;

    public Pedido(int numero, double valor) {
        this.numero = numero;
        this.valor = valor;
        this.status = "ABERTO";
    }

    public void setValor(double valor) {
        if (valor > this.valor) {
            this.valor = valor;
        } else {
            System.out.println("Não é possível alterar o valor do pedido");
        }
    }

    public void setStatus(String status) {
        if (this.status.equalsIgnoreCase("ABERTO") &&
            status.equalsIgnoreCase("PREPARANDO")) {
            this.status = status.toUpperCase();

        } else if (this.status.equalsIgnoreCase("PREPARANDO") &&
            status.equalsIgnoreCase("PRONTO")) {
            this.status = status.toUpperCase();

        } else if (this.status.equalsIgnoreCase("PRONTO") &&
            status.equalsIgnoreCase("ENTREGUE")) {
            this.status = status.toUpperCase();

        } else {
            System.out.println("Alteração de status inválida");
        }
    }

    public boolean podeCancelar(){
        return this.status.equalsIgnoreCase("ABERTO") ||
                this.status.equalsIgnoreCase("PREPARANDO");
    }

    /* public void podeCancelar(){
        if (status.equalsIgnoreCase("ABERTO") ||
            status.equalsIgnoreCase("PREPARANDO")) {
            System.out.println("Pedido cancelado!");
        } else {
            System.out.println("Não foi possível cancelar o pedido.");
        }
    } */

    public void getResumo(){
        System.out.println("Pedido N°" + numero + " - R$" + valor + " - " + status );
    }

    public String getStatus() {
        return status;
    }

    public int getNumero() {
        return numero;
    }

    public double getValor() {
        return valor;
    }
}
