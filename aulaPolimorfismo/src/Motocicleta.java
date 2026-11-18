public class Motocicleta extends Veiculo{
    private int cilindrada;

    public Motocicleta(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public void emitirSom() {
        System.out.println("Buzina de moto!!");
    }

    @Override
    public double calcularImposto() {
        return 450.00;
    }
}
