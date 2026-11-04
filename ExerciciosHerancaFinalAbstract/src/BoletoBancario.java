public class BoletoBancario extends Transacao {
    private String codigoBarra;

    public BoletoBancario(int codigoTransacao, double valorOriginal, String codigoBarra) {
        super(codigoTransacao, valorOriginal);
        this.codigoBarra = codigoBarra;
    }

    @Override
    public boolean validarDados() {
        System.out.println("Validando Boleto: Verificando código de barras...");
        if (codigoBarra != null && codigoBarra.length() >= 10) {
            return true;
        } else { 
            return false;
        }
    }

    @Override
    public double calcularTaxa() {
        return 2.50;
    }

    
    

    

    
}
