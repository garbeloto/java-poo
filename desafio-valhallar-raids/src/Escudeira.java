public class Escudeira extends GuerreiroNordico {
    //Variavel mudada para private
    private int durabilidadeEscudo;
   
    //Construtor herando variaveis da classe mãe via 'super'
    public Escudeira(int durabilidadeEscudo) {
        this.durabilidadeEscudo = durabilidadeEscudo;
    }


    public Escudeira(String nome, int vida, int poderBase, int durabilidadeEscudo) {
        super(nome, vida, poderBase);
        this.durabilidadeEscudo = durabilidadeEscudo;
    }

    public int calcularDanoGolpe() {
        // TODO: Lógica de dano implementada
        if (this.durabilidadeEscudo > 0) {
            this.durabilidadeEscudo --;
            return super.getPoderBase() + 8;
        } else{
            return super.getPoderBase();
        }
    }


}

