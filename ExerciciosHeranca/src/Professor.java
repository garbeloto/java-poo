public class Professor extends Pessoa{
    private String disciplina;
    private double valorHora;
    private int horasTrabalhadas;

    public Professor(String nome, String cpf, String email, String disciplina, double valorHora, int horasTrabalhadas) {
        super(nome, cpf, email);
        this.disciplina = disciplina;
        setValorHora(valorHora);
        setHorasTrabalhadas(horasTrabalhadas);
    }

    public void setValorHora(double valorHora) {
        if (valorHora >= 0) {
            this.valorHora = valorHora;
        } else {
            System.out.println("Valor hora inválido.");
        }
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        if (horasTrabalhadas >= 0) {
            this.horasTrabalhadas = horasTrabalhadas;
        } else {
            System.out.println("Horas trabalhadas inválidas.");
        }
    }

    public void exibirInformacoesProfessor(){
        exibirInformacoes();
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Valor Hora: " + valorHora);
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public double getValorHora() {
        return valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
}
