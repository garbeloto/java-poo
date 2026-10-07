public class Cerveja {
    String nome;
    String estilo;
    double teorAlcoolico;
    double preco;
    MestreCervejeiro mestreResponsavel;

    public Cerveja() {

    }

    public Cerveja(String nome, String estilo, double teorAlcoolico, double preco, MestreCervejeiro mestreResponsavel) {
        this.nome = nome;
        this.estilo = estilo;
        this.teorAlcoolico = teorAlcoolico;
        this.preco = preco;
        this.mestreResponsavel = mestreResponsavel;
    }

    public void exibirInformacoes(){
        System.out.println("Cerveja: " + nome);
        System.out.println("Estilo: " + estilo);
        System.out.println("Teor Alcoolico: " + teorAlcoolico);
        System.out.println("Preço: " + preco);

        mestreResponsavel.exibirInformacoes();
    }

    public void classificarTeorAlcoolico(){
        if (teorAlcoolico < 5) {
            System.out.println("Teor alcoolico: Teor baixo.");
        } else if (teorAlcoolico >= 5 && teorAlcoolico <= 8) {
            System.out.println("Teor alcoolico: Teor moderado.");
        } else if (teorAlcoolico > 8) {
            System.out.println("Teor alcoolico: Teor alto");
        } else {
            System.out.println("Teor inválido");
        }
    }
    
}
