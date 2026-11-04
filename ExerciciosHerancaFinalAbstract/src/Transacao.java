public abstract class Transacao {
    private int codigoTransacao;
    private double valorOriginal;

    public Transacao(int codigoTransacao, double valorOriginal) {
        this.codigoTransacao = codigoTransacao;
        setValorOriginal(valorOriginal);
    }

    public int getCodigoTransacao() {
        return codigoTransacao;
    }
    public double getValorOriginal() {
        return valorOriginal;
    }

    public void setValorOriginal(double valorOriginal) {
        if (valorOriginal <= 0) {
            System.out.println("O valor deve ser maior que 0");
        } else {
            this.valorOriginal = valorOriginal;
        }
    }

    public abstract boolean validarDados();
    public abstract double calcularTaxa();

    /* 
     * JUSTIFICATIVA TÉCNICA DO MODIFICADOR FINAL:
     * O modificador 'final' impede que qualquer classe filha sobrescreva este método.
     * Isso garante a segurança e a auditoria do gateway, assegurando que as etapas 
     * (log, validação, cobrança e recibo) ocorram sempre na ordem estrita definida, 
     * sem possibilidade de fraude ou violação por meios de pagamento específicos.
     */
    public final void processarTransacao(){
        System.out.println("--- Iniciando Log de Abertura: Transação " + codigoTransacao + " ---");
        
        if (validarDados() == true) {
            double taxa = calcularTaxa();
            double valorLiquido = valorOriginal - taxa;
            
            System.out.println("Recibo Emitido:");
            System.out.println("Valor Original: R$ " + valorOriginal);
            System.out.println("Taxa Cobrada: R$ " + taxa);
            System.out.println("Valor Final Processado (Líquido): R$ " + valorLiquido);
        } else {
            System.out.println("Transação " + codigoTransacao + " cancelada por falha na validação.");
        }
        System.out.println("--------------------------------------------------\n");
    }
}
