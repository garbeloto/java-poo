public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo.toUpperCase();
        this.salario = salario;
    }

    public void consultarFuncionario (){
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Salário: " + getSalario());
    }

    public void alterarSalario(double novoSalario){
        if (novoSalario > salario) {
            setSalario(novoSalario);
        } else {
            System.out.println("O valor do novo salário deve ser maior que o salário atual");
        }
    }

    public void getFaixaSalarial(){
        if (salario <= 2000) {
            System.out.println("Funcionário Júnior");
        } else if (salario <= 5000) {
            System.out.println("Funcionário Pleno");
        } else if (salario > 5000) {
            System.out.println("Funcionário Sênior");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
}
