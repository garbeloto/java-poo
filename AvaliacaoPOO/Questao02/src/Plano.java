public class Plano {
    String nome;
    double precoMensal;
    int limiteTelas;

    public Plano() {

    }

    public Plano(String nome, double precoMensal, int limiteTelas) {
        this.nome = nome;
        this.precoMensal = precoMensal;
        this.limiteTelas = limiteTelas;
    }

    public void exibirInformacoes(){
        System.out.println("Plano: " + nome);
        System.out.println("Preço Mensal: " + precoMensal);
        System.out.println("Limite de Telas: " + limiteTelas);
    }
}
