public class Usuario {
    String nome;
    int idade;
    Plano plano;

    public Usuario() {

    }

    public Usuario(String nome, int idade, Plano plano) {
        this.nome = nome;
        this.idade = idade;
        this.plano = plano;
    }

    public void exibirInformacoes(){
        System.out.println("Usuário: " + nome);
        System.out.println("Idade: " + idade);
        plano.exibirInformacoes();
    }

    public void verificarPlano(){
        if (plano.limiteTelas == 1) {
            System.out.println("Plano individual");
        } else if (plano.limiteTelas == 2) {
            System.out.println("Plano compartilhado");
        } else if (plano.limiteTelas > 2) {
            System.out.println("Plano família");
        } else {
            System.out.println("Plano inválido!");
        }
    }
}
