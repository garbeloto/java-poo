public class Carro extends Veiculo{
    private int qts_portas;

    public Carro(String marca, String modelo, String placa, int ano, int qts_portas) {
        super(marca, modelo, placa, ano);
        this.qts_portas = qts_portas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Quantidade de portas: " + qts_portas);
    }
}
