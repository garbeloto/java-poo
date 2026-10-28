public class AviaoCarga extends Aeronave{
    private double capacidadeCargaToneladas;
    private String tipoCarga;

    public AviaoCarga(String fabricante, String modelo, int anoFabricacao, double capacidadeCargaToneladas,
            String tipoCarga) {
        super(fabricante, modelo, anoFabricacao);
        this.capacidadeCargaToneladas = capacidadeCargaToneladas;
        this.tipoCarga = tipoCarga;
    }

    public double getCapacidadeCargaToneladas() {
        return capacidadeCargaToneladas;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void exibirDadosCarga(){
        super.exibirDados();
        System.out.println("Capacidade Carga Toneladas: " + capacidadeCargaToneladas);
        System.out.println("Tipo Carga: " + tipoCarga);
    }
}
