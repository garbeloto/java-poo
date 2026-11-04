public abstract class Funcionario2 {
    private String nome;
    private String cpf;
    private double salarioBase;

    public Funcionario2(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalarioFinal();

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário: " + salarioBase);
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
