public class MestreCervejeiro {
    String nome;
    String especialidade;
    int anosExperiencia;

    public MestreCervejeiro() {
    }

    public MestreCervejeiro(String nome, String especialidade, int anosExperiencia) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.anosExperiencia = anosExperiencia;
    }

    public void exibirInformacoes(){
        System.out.println("Mestre Cervejeiro: " + nome);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Anos Experiência: " + anosExperiencia);
    }


}
