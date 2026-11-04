//Classe abstract impedindo criação de guerreiros sem clã
public abstract class GuerreiroNordico {
    //Variaveis alteradas para private
    private String nome;
    private int vida;
    private int poderBase;
   
    public GuerreiroNordico() {
    }

    public GuerreiroNordico(String nome, int vida, int poderBase) {
        this.nome = nome;
        this.vida = vida;
        this.poderBase = poderBase;
    }

    //calculo de dano modificado para abstract
    public abstract int calcularDanoGolpe();

    //Fluxo de ataque como final para não ocorrer mudanças
    public final void executarTurnoAtaque(GuerreiroNordico alvo) {
        System.out.println("\n[RITUAL DE ODIN] " + this.nome + " avança contra " + alvo.nome + "!");
        int dano = calcularDanoGolpe();
        alvo.vida = alvo.vida - dano;
        if (alvo.vida < 0) {
            alvo.vida = 0;
        }
        System.out.println("-> Dano desferido: " + dano + " | Vida restante de " + alvo.nome + ": " + alvo.vida);
    }


    public int getPoderBase() {
        return poderBase;
    }

}
