public class EventoOnline extends Evento{
    private String plataforma;
    private String linkAcesso;
    
    public EventoOnline(String nome, String data, double valorIngresso, int capacidadeMaxima, int inscritos,
            String plataforma, String linkAcesso) {
        super(nome, data, valorIngresso, capacidadeMaxima, inscritos);
        this.plataforma = plataforma;
        this.linkAcesso = linkAcesso;
    }

    
}
