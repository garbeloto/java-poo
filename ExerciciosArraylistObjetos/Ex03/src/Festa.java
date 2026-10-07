import java.util.ArrayList;

public class Festa {
    String nome;
    String local;
    Convidado convidadoResponsavel;

    public Festa() {

    }

    public Festa(String nome, String local, Convidado convidadoResponsavel) {
        this.nome = nome;
        this.local = local;
        this.convidadoResponsavel = convidadoResponsavel;
    }

    public void exibirInformacoes(){
        System.out.println("Festa: " + nome);
        System.out.println("Local: " + local);
        System.out.println("Responsável:");
        convidadoResponsavel.exibirInformacoes();

    }

    
}
