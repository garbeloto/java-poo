public class Evento {
    private String nome;
    private String data;
    private double valorIngresso;
    private int capacidadeMaxima;
    private int inscritos;

    public Evento(String nome, String data, double valorIngresso, int capacidadeMaxima, int inscritos) {
        this.nome = nome;
        this.data = data;
        this.valorIngresso = valorIngresso;
        this.capacidadeMaxima = capacidadeMaxima;
        this.inscritos = inscritos;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            System.out.println("O nome não pode ser vazio.");
        } else {
            this.nome = nome;
        }
    }

    public void setData(String data) {
         if (data == null || data.isBlank()) {
            System.out.println("A data não pode ser vazio.");
        } else {
            this.data = data;
        }
    }

    public void setValorIngresso(double valorIngresso) {
         if (valorIngresso < 0) {
            System.out.println("O valor do ingresso não pode ser negativo.");
        } else {
            this.valorIngresso = valorIngresso;
        }
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        if (capacidadeMaxima >= 0) {
            System.out.println("A capacidade máxima deve ser maior que zero.");
        } else {
            this.capacidadeMaxima = capacidadeMaxima;
        }
    }

    public void setInscritos(int inscritos) {
        if (inscritos < 0) {
            System.out.println("A quantidade de não pode ser negativa.");
        }
        if (inscritos > capacidadeMaxima) {
            System.out.println("A quantidade de não pode ser maior que a capacidade máxima.");
        } else {
            this.inscritos = inscritos;
        }
    }



    

}
