public final class CartaoEstudante extends Cartao{
    private int cotaViagens;

    public CartaoEstudante(int numeroCartao, double saldo, int cotaViagens) {
        super(numeroCartao, saldo);
        this.cotaViagens = cotaViagens;
    }

    @Override
    public double passarCatraca() {
        
        double novoSaldo= 0;

        if (cotaViagens > 0 && cotaViagens <= 40 ) {
            return getSaldo() - 0;
        } else {
            novoSaldo= getSaldo() - 2.50;
            setSaldo(novoSaldo);
            return novoSaldo;
        }
    }

    public void setCotaViagens(int cotaViagens) {
        this.cotaViagens = 40;
    }
    
}
