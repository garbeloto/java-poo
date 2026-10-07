

public class Conteudo {
    String titulo;
    String genero;
    int duracao;
    int classificacaoIndicativa;

    public Conteudo() {

    }

    public Conteudo(String titulo, String genero, int duracao, int classificacaoIndicativa) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public void exibirInformacoes(){
        System.out.println("Título: " + titulo);
        System.out.println("Genero: " + genero);
        System.out.println("duracao: " + duracao);
        System.out.println("Classificação Indicativa: " + classificacaoIndicativa);
    }

    public void verificarClassificacao(int idadeUsuario){
        if (idadeUsuario >= classificacaoIndicativa) {
            System.out.println("Conteúdo liberado");
        } else {
            System.out.println("Conteúdo bloqueado");
        }
    }

    public void verificarClassificacao() {
        throw new UnsupportedOperationException("Unimplemented method 'verificarClassificacao'");
    }


}
