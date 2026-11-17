public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private int ano;

    public Veiculo(String marca, String modelo, String placa, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    
    public void exibirDados(){
        System.out.println("Marca Veiculo: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Placa: "+ placa);
        System.out.println("Ano: "+ ano);
    }

    
}
