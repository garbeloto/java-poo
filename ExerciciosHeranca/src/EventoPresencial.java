public class EventoPresencial extends Evento{
    private String local;
    private boolean possuiAcessibilidade;

    public EventoPresencial(String nome, String data, double valorIngresso, int capacidadeMaxima, int inscritos,
            String local, boolean possuiAcessibilidade) {
        super(nome, data, valorIngresso, capacidadeMaxima, inscritos);
        setLocal(local);
        this.possuiAcessibilidade = possuiAcessibilidade;
    }

    public void setLocal(String local) {
        if (local == null || local.isBlank()) {
            System.out.println("O local é obrigatório.");
        } else {
            this.local = local;
        }
    }

    public boolean permiteInscricaoAcessivel(){
        if (possuiAcessibilidade) {
            return true;
        } else {
            return false;
        }
    }

    public void exibirDadosEventoPresencial(){
        exibirDadosEvento();
        System.out.println("Local: "  + local);
        System.out.println("Acessibilidade: "  + permiteInscricaoAcessivel());
    }

    public String getLocal() {
        return local;
    }

    public boolean isPossuiAcessibilidade() {
        return possuiAcessibilidade;
    }

    



    

}
