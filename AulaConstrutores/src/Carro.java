public class Carro {
    String marca;
    String modelo;
    int ano;
    String cor;

    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    
    public Carro() {
    }


    public void acelerar(){
        System.out.println("Acelerando...");
    }

    public void frear(){
        System.out.println("Freaaando...");
    }

    public void buzinar(){
        System.out.println("Biiiii...");
    }
}
