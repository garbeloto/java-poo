public class Caminhao extends Veiculo{
    private int eixos;

    public Caminhao(String marca, String modelo, int ano, int eixos) {
        super(marca, modelo, ano);
        this.eixos = eixos;
    }

    @Override
    public void emitirSom() {
        System.out.println("Buzina de caminhão!!");
    }

    @Override
    public double calcularImposto() {
        return  4800.00;
    }
    
}
