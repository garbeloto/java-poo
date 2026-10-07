public class Ingresso {
    private String nomeEvento;
    private String tipo;
    private double preco;
    
    public Ingresso(String nomeEvento, String tipo, double preco) {
        this.nomeEvento = nomeEvento;
        setTipo(tipo);
        this.preco = preco;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public double getPreco() {
        return preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equalsIgnoreCase("Pista") ||
            tipo.equalsIgnoreCase("Vip") ||
            tipo.equalsIgnoreCase("Camarote")) {
            this.tipo = tipo;
        } else {
            System.out.println("Ingresso inválido");
        }
    }

    public void setPreco(double preco) {
        double minimo = 0;
        if (tipo.equalsIgnoreCase("Pista")) {
            minimo = 50;
        } else if (tipo.equalsIgnoreCase("Vip")) {
            minimo = 100;
        } else if (tipo.equalsIgnoreCase("Camarote")) {
            minimo = 200;
        }

        if (preco >= minimo) {
            this.preco = preco;
        } else { 
            System.out.println("Valor abaixo do mínimo!");
        }

        this.preco = preco;

    }

    public double getPrecoFinal(){
        if (tipo.equalsIgnoreCase("Pista")) {
            return preco * 1.10;
        } else if (tipo.equalsIgnoreCase("VIP")) {
            return preco * 1.05;
        } else {
            return preco * 1.02;
        }
    }

}
