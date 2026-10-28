public class Aluno extends Pessoa{
    private String matricula;
    private double notaFinal;
    private int frequencia;

    public Aluno(String nome, String cpf, String email, String matricula, double notaFinal, int frequencia) {
        super(nome, cpf, email);
        this.matricula = matricula;
        setNotaFinal(notaFinal);
        setFrequencia(frequencia);
    }

    public void setNotaFinal(double notaFinal) {
        if (notaFinal >= 0 && notaFinal <= 10) {
            this.notaFinal = notaFinal;
        } else {
            System.out.println("Nota inválida.");
        }
    }

    public void setFrequencia(int frequencia) {
        if (notaFinal >= 0 && notaFinal <= 100) {
            this.frequencia = frequencia;
        } else {
            System.out.println("Frequência inválida.");
        }
    }

    public String verificarSituacaoAcademica(){
        if (frequencia < 75) {
            return "Reprovado por faltas.";
        } else if (notaFinal >= 7 && frequencia >= 75) {
            return "Aprovado.";
        } else if (notaFinal < 7 && frequencia >= 75) {
            return "Em recuperação.";
        } else {
            return "Situação inválida";
        }
    }

    public void exibirInformacoesAluno(){
        exibirInformacoes();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota final: " + notaFinal);
        System.out.println("Frequência: " + frequencia + "%");
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public int getFrequencia() {
        return frequencia;
    }

    
}
