public class Desenvolvedor extends Funcionario {
    private String linguagem;
    private String nivel;
    private String ferramenta;
    private String equipe;

    public Desenvolvedor(int id, String nome, String email, String dataAdmissao, double salario, String linguagem,
            String nivel, String ferramenta, String equipe) {

        super(id, nome, email, dataAdmissao, salario);

        this.linguagem = linguagem;
        this.nivel = nivel;
        this.ferramenta = ferramenta;
        this.equipe = equipe;
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    public String getLinguagem() {
        return linguagem;
    }

    public String getFerramenta() {
        return ferramenta;
    }

    public String getEquipe() {
        return equipe;
    }

    public void exibirDadosDesenvolvedor(){
        exibirDados();
        System.out.println("Linguagem: " + linguagem);
        System.out.println("Nível: " + nivel);
        System.out.println("Ferramenta: " + ferramenta);
        System.out.println("Equipe: " + equipe);
    }

}
