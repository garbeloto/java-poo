import java.util.ArrayList;

public class Convidado {
    String nome;
    int idade;
    boolean vip;

    public Convidado() {

    }

    public Convidado(String nome, int idade, boolean vip) {
        this.nome = nome;
        this.idade = idade;
        this.vip = vip;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Vip? " + vip);
    }

    public void verificaEntrada(Convidado convidado){
        if (convidado.idade >= 18) {
            System.out.println("Entrada permitida!");
        } else if (convidado.idade < 18 && convidado.vip == true) {
            System.out.println("Entrada permitida!");
        } else {
            System.out.println("Entrada negada!");
        }
    }

    public void aplicarBeneficio(Convidado convidado){
        if (convidado.vip == true) {
            System.out.println("Benefício liberado!");
        } else {
            System.out.println("Sem benefício!");
        }
    }

    public int contarConvidadosVip(ArrayList<Convidado> convidados){
        int quantidade = 0;
        for (Convidado c : convidados) {
            if (c.vip) {
                quantidade++;
            }
        }
        return quantidade;
    }
}
