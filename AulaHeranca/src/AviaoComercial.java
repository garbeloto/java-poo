public class AviaoComercial extends Aeronave{
    private int capacidadePassageiros;
    private int quantidadeComissarios;

    public AviaoComercial(String fabricante, String modelo, int anoFabricacao, int capacidadePassageiros,
            int quantidadeComissarios) {
        super(fabricante, modelo, anoFabricacao);
        this.capacidadePassageiros = capacidadePassageiros;
        this.quantidadeComissarios = quantidadeComissarios;
    }

    public void exibirDadosComerciais(){
        exibirDados();
        System.out.println("Capacidade Passageiros: " + capacidadePassageiros);
        System.out.println("Quantidade Comissarios: " + quantidadeComissarios);
    }
}