public class Administrador extends Funcionario{
    private String nivelAcesso;
    private String permissao;
    private String modulo;
    private String logAcesso;
    
    public Administrador(int id, String nome, String email, String dataAdmissao, double salario, String nivelAcesso,
            String permissao, String modulo, String logAcesso) {
        super(id, nome, email, dataAdmissao, salario);
        this.nivelAcesso = nivelAcesso;
        this.permissao = permissao;
        this.modulo = modulo;
        this.logAcesso = logAcesso;
    }

    public void exibirDadosAdministrador(){
        exibirDados();
        System.out.println("Nível Acesso: " + nivelAcesso);
        System.out.println("Permissão: " + permissao);
        System.out.println("Módulo: " + modulo);
        System.out.println("Log de Acesso: " + logAcesso);

    }
}
