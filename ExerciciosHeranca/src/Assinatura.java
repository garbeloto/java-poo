public class Assinatura {
    private String titular;
    private double valorMensal;
    private boolean ativa;
    private int telasSimultaneas;
    
    public Assinatura(String titular, double valorMensal, boolean ativa, int telasSimultaneas) {
        setTitular(titular);
        setValorMensal(valorMensal);
        setAtiva(ativa);
        setTelasSimultaneas(telasSimultaneas);
    }

    public void setTitular(String titular) {
        if (titular == null || titular.isBlank()) {
            System.out.println("o titular não pode ser vazio");
        } else { 
            this.titular = titular;
        }
    }

    public void setValorMensal(double valorMensal) {
        if (valorMensal < 0) {
            System.out.println("o valor mensal não pode ser negativo");
        } else {
            this.valorMensal = valorMensal;
        }
    }

    public void setTelasSimultaneas(int telasSimultaneas) {
        if (telasSimultaneas <= 0 ) {
            System.out.println("a quantidade de telas simultaneas deve ser maior que zero");
        } else {
            this.telasSimultaneas = telasSimultaneas;
        }
    }

    public void setAtiva(boolean ativa) {
        if (ativa == false) {
            System.out.println("conteudo bloqueado. assinatura inativa");
        } else {
            this.ativa = ativa;
        }
    }

    public boolean podeReproduzir(int telasEmUso){
        if (ativa) {
            return true;
        } else if(telasEmUso >= 0 && telasEmUso < telasSimultaneas){
            return true;
        } else{
            return false;
        }
    }

    public String getTitular() {
        return titular;
    }

    public double getValorMensal() {
        return valorMensal;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public int getTelasSimultaneas() {
        return telasSimultaneas;
    }

    
}
