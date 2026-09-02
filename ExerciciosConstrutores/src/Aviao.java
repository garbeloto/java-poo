public class Aviao {
    String modelo;
    String companhia;
    int capacidade;
    int ano;

    public Aviao(String modelo, String companhia, int capacidade, int ano) {
        this.modelo = modelo;
        this.companhia = companhia;
        this.capacidade = capacidade;
        this.ano = ano;
    }

    public Aviao(String modelo, String companhia) {
        this.modelo = modelo;
        this.companhia = companhia;
        this.capacidade = 0;
        this.ano = 2026;
    }

    public void exibirInformacoesAviao(){
        System.out.println("Marca: " + modelo);
        System.out.println("Modelo: " + companhia);
        System.out.println("Armazenamento (GB): " + capacidade);
        System.out.println("Preço: " + ano);
    }


    
    
    
}
