public class EventoPresencial extends Evento{
    private String local;
    private boolean possuiAcessibilidade;

    public EventoPresencial(String nome, String data, double valorIngresso, int capacidadeMaxima, int inscritos,
            String local, boolean possuiAcessibilidade) {
        super(nome, data, valorIngresso, capacidadeMaxima, inscritos);
        this.local = local;
        this.possuiAcessibilidade = possuiAcessibilidade;
    }

    

}
