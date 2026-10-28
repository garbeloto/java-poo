public class PlanoPremium extends Assinatura{
    private String qualidadeVideo;
    private int limiteDownloads;
    
    public PlanoPremium(String titular, double valorMensal, boolean ativa, int telasSimultaneas, String qualidadeVideo,
            int limiteDownloads) {
        super(titular, valorMensal, ativa, telasSimultaneas);
        this.qualidadeVideo = qualidadeVideo;
        setLimiteDownload(limiteDownloads);
    }

    public void setLimiteDownload(int limiteDownloads) {
        if (limiteDownloads < 0) {
            System.out.println("o limite de download não pode ser negativo");
        } else {
            this.limiteDownloads = limiteDownloads;
        }
    }

    public boolean permiteQualidade4K(){
        if (qualidadeVideo.equalsIgnoreCase("4K")) {
            return true;
        } else {
            return false;
        }
    }

    public String getQualidadeVideo() {
        return qualidadeVideo;
    }

    public int getLimiteDownloads() {
        return limiteDownloads;
    }

    
}
