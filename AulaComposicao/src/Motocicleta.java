public class Motocicleta extends Veiculo{
    private String cilindrada;

    public Motocicleta(String marca, String modelo, String placa, int ano, String cilindrada) {
        super(marca, modelo, placa, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cilindrada: " + cilindrada);
    }
}
