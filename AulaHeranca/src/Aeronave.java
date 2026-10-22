public class Aeronave {
    private String fabricante;
    private String modelo;
    private int anoFabricacao;

    public Aeronave(String fabricante, String modelo, int anoFabricacao) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public void exibirDados(){
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
    }
    
}
