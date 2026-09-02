public class Quarto {
    int numero;
    String tipo;
    double valorDiaria;
    boolean disponivel;

    public Quarto(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public Quarto(int numero, String tipo, double valorDiaria, boolean disponivel) {
        this.numero = numero;
        this.tipo = tipo;
        this.valorDiaria = valorDiaria;
        this.disponivel = disponivel;
    }

    public Quarto(int numero, String tipo, boolean disponivel) {
        this.numero = numero;
        this.tipo = tipo;
        this.valorDiaria = 0;
        this.disponivel = true;
    }

    public void exibirInformacoes(){
        System.out.println("Número: " + numero);
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor Diária: " + valorDiaria);
        System.out.println("Disponível: " + disponivel);
    }
    
    
}
