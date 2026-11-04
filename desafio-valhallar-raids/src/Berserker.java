//Classe final impedindo criação posterior
public final class Berserker extends GuerreiroNordico {
    //Variavel mudada para private
    private int furia;
    
    //Construtor herando variaveis da classe mãe via 'super'
    public Berserker(int furia) {
        this.furia = furia;
    }

    public Berserker(String nome, int vida, int poderBase, int furia) {
        super(nome, vida, poderBase);
        this.furia = furia;
    }

    public int calcularDanoGolpe() {
        return super.getPoderBase() + (this.furia * 3);
    }
}

