public class Operacao {
    private int id;
    private double valorInicial;
    
    public Operacao(int id, double valorInicial) {
        this.id = id;
        setValorInicial(valorInicial);
    }

    public void setValorInicial(double valorInicial) {
        if (valorInicial < 0) {
            System.out.println("o valor inicial não pode ser negativo");
        } else {
            this.valorInicial = valorInicial;
        }
    }

    public void exibirDadosOperacao(){
        System.out.println("id: " + id);
        System.out.println("valor inicial: " + valorInicial);
    }

    public int getId() {
        return id;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    
}
