public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        setCargo(cargo);
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo.toUpperCase();
    }

    public void setSalario(double salario) {
        if (salario > this.salario) {
            this.salario = salario;
        } else {
            System.out.println("O salario não pode ser alterado.");
        }
    }

    public String getFaixaSalarial(){
        if (salario <= 2000) {
            return "Funcionário Júnior";
        } else if (salario <= 5000) {
            return "Funcionário Pleno";
        } else {
            return "Funcionário Sênior";
        }
    }

    public void consultarFuncionario (){
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Salário: " + getSalario());
    } 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public double getSalario() {
        return salario;
    }

    
    
}
