public class Carro extends Veiculo{
    private int qtd_portas;

    public Carro(String marca, String modelo, int ano, int qtd_portas) {
        super(marca, modelo, ano);
        this.qtd_portas = qtd_portas;
    }

    @Override
    public void emitirSom() {
        System.out.println("Buzina de carro!!");
    }

    @Override
    public double calcularImposto() {
        return 1200.00;
    }
}
