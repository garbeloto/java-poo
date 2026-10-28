public class PlanoBasico extends Assinatura {
    private int limiteDispositivos;
    private boolean permiteDownload;
    
    public PlanoBasico(String titular, double valorMensal, boolean ativa, int telasSimultaneas, int limiteDispositivos,
            boolean permiteDownload) {
        super(titular, valorMensal, ativa, telasSimultaneas);
        setLimiteDispositivos(limiteDispositivos);
        this.permiteDownload = permiteDownload;
    }

    public void setLimiteDispositivos(int limiteDispositivos) {
        if (limiteDispositivos < 0) {
            System.out.println("o limite de dispositivos não pode ser negativo");
        } else {
            this.limiteDispositivos = limiteDispositivos;
        }
    }


    public int getLimiteDispositivos() {
        return limiteDispositivos;
    }

    public boolean isPermiteDownload() {
        return permiteDownload;
    }

    
}
