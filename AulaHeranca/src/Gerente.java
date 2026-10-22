public class Gerente extends Funcionario{
    private String equipe;
    private String departamento;
    private double meta;
    private double bonus;

    public Gerente(int id, String nome, String email, String dataAdmissao, double salario, String equipe,
            String departamento, double meta, double bonus) {
        super(id, nome, email, dataAdmissao, salario);
        this.equipe = equipe;
        this.departamento = departamento;
        this.meta = meta;
        this.bonus = bonus;
    }

    public void exibirDadosGerente(){
        exibirDados();
        System.out.println("Equipe: " + equipe);
        System.out.println("Departamento: " + departamento);
        System.out.println("Meta: " + meta);
        System.out.println("Bonus: " + bonus);
    }

}
