public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;
    
    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        setSalarioBase(salarioBase);
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase <= 0 ) {
            System.out.println("valor de salario invalido.");
        } else {
            this.salarioBase = salarioBase;
        }
    }

    public abstract double calcularSalarioLiquido();

    public final void exibirHolerite(){
        System.out.println("=======HOLERITE FUNCIONARIO=======");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salario base: " + salarioBase);
        System.out.println("Salario liquido: "+ calcularSalarioLiquido());
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    
}
