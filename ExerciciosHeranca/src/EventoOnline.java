public class EventoOnline extends Evento{
    private String plataforma;
    private String linkAcesso;
    
    public EventoOnline(String nome, String data, double valorIngresso, int capacidadeMaxima, int inscritos,
            String plataforma, String linkAcesso) {
        super(nome, data, valorIngresso, capacidadeMaxima, inscritos);
        setPlatafroma(plataforma);
        setLinkAcesso(linkAcesso);
    }

    public void setPlatafroma(String plataforma) {
        if (plataforma == null || plataforma.isBlank()) {
            System.out.println("A plataforma é obrigatória.");
        } else {
            this.plataforma = plataforma;
        }
    }
    public void setLinkAcesso(String linkAcesso) {
        if (linkAcesso == null || linkAcesso.isBlank()) {
            System.out.println("O link acesso é obrigatório.");
        } else {
            this.linkAcesso = linkAcesso;
        }
    }

    public void exibirDadosEventoOnline(){
        exibirDadosEvento();
        System.out.println("Plataforma: "  + plataforma);
        System.out.println("Link acesso: "  + linkAcesso);
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String getLinkAcesso() {
        return linkAcesso;
    }

    
}
