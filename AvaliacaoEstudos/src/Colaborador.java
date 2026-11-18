public abstract class Colaborador {
    private String nome;
    private int matricula;
    private double salarioContrato;

    public Colaborador(String nome, int matricula, double salarioContrato) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioContrato = salarioContrato;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("o nome é obrigatorio");
        } else {
            this.nome = nome;
        }
    }

    public void setMatricula(int matricula) {
        if (matricula <= 0) {
            System.out.println("a matricula deve ser obrigatoria e maior que zero");
        } else {
            this.matricula = matricula;
        }
    }

    public void setSalarioContrato(double salarioContrato) {
        if (salarioContrato <= 0) {
            System.out.println("o salario Contrato deve ser maior que zero");
        } else {
            this.salarioContrato = salarioContrato;
        }
        
    }

    public  abstract double proventoBruto();

    public final void emitirHolerite() {
        System.out.println("nome: " + nome);
        System.out.println("matricula: " + matricula);
        System.out.println("salario contrato: " + salarioContrato);
        System.out.println("provento bruto: " + proventoBruto());
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getSalarioContrato() {
        return salarioContrato;
    }

    
}
