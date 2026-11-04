public abstract class Funcionario {
    private String nome;
    private int matricula;
    private double salarioBase;

    public Funcionario(String nome, int matricula, double salarioBase) {
        setNome(nome);
        setMatricula(matricula);
        setSalarioBase(salarioBase);
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            System.out.println("O nome é obrigatorio!");
        } else {
            this.nome = nome;
        }
    }

    public void setMatricula(int matricula) {
        if (matricula < 0) {
            System.out.println("A matricula não pode ter valor negativo!");
        } else {
            this.matricula = matricula;
        }
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0) {
            System.out.println("O salario base não pode ter valor negativo!");
        } else {
            this.salarioBase = salarioBase;
        }
    }

    public  abstract double calculaBonusSalario();

    public void exibirHolerite(){

        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Slário base: " + salarioBase);
        System.out.println("Salario final: " + calculaBonusSalario());
    }
}
