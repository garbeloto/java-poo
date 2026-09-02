public class Smartphone {
    String marca;
    String modelo;
    int armazenamento;
    double preco;

    public Smartphone(String marca, String modelo, int armazenamento, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.preco = preco;
    }

    public Smartphone(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.armazenamento = 128;
        this.preco = 0;
    }

    public void exibirInformacoesSmartphone(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Armazenamento (GB): " + armazenamento);
        System.out.println("Preço: " + preco);
    }

    

    
}
