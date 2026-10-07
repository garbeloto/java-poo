public class ClasseLote {
    String numero;
    Cerveja cerveja;
    int quantidadeGarrafas;

    public ClasseLote() {

    }
    public ClasseLote(String numero, Cerveja cerveja, int quantidadeGarrafas) {
        this.numero = numero;
        this.cerveja = cerveja;
        this.quantidadeGarrafas = quantidadeGarrafas;
    }

    public void exibirInformacoes(){
        System.out.println("Número lote: " + numero);
        cerveja.exibirInformacoes();
        cerveja.classificarTeorAlcoolico();
        System.out.println("Quantidade: " + quantidadeGarrafas);
    }

    public double calcularValorProducao(){
        return cerveja.preco * quantidadeGarrafas;
    }

    public void verificarProducao(){
        if (quantidadeGarrafas < 100) {
            System.out.println("Lote pequeno.");
        } else if (quantidadeGarrafas >= 100 && quantidadeGarrafas <= 500) {
            System.out.println("Lote médio.");
        } else if (quantidadeGarrafas > 500) {
            System.out.println("Loete grande.");
        } else { 
            System.out.println("Lote inválido.");
        }
    }
}
