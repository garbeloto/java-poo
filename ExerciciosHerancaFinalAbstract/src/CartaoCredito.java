public class CartaoCredito extends Transacao {
    private int numeroParcelas;

    public CartaoCredito(int codigoTransacao, double valorOriginal, int numeroParcelas) {
        super(codigoTransacao, valorOriginal);
        this.numeroParcelas = numeroParcelas;
    }

    @Override
    public boolean validarDados() {
        System.out.println("Validando Cartão: Verificando parcelamento (" + numeroParcelas + "x)...");
        if (numeroParcelas < 1 && numeroParcelas > 12) {
            return false;
        } else { 
            return true;
        }
    }

    @Override
    public double calcularTaxa() {
        return getValorOriginal() * 0.038;
    }
}
