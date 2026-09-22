import java.util.ArrayList;

public class Paciente {
    String nome;
    int idade;
    Medico medico;
    boolean internado;
    
    public Paciente() {

    }

    public Paciente(String nome, int idade, Medico medico, boolean internado) {
        this.nome = nome;
        this.idade = idade;
        this.medico = medico;
        this.internado = internado;
    }

    public void exibirInformacoes(){
        System.out.println("Nome do Paciente: " + nome);
        System.out.println("Idade do Paciente: " + idade);
        System.out.println("Paciente Internado? " + internado);

        if (medico != null) {
            System.out.println("Médico responsável: " + medico.nome + " (" + medico.especialidade + ")");
        } else { 
            System.out.println("Médico responsável: Nenhum");
        }
    }

    public void verificarAtendimento(){
        if (internado = true) {
            System.out.println("Situação: Paciente internado");
        } else if (internado = false) {
            System.out.println("Situação: Paciente em atendimento");
        } else {
            System.out.println("Situação: Paciente sem médico responsável");
        }
    }

    public boolean altaPaciente(){
        return internado = false;
    }

    public int contarInternados(ArrayList<Paciente> pacientes){
        int quantidade = 0;
        for (Paciente p : pacientes) {
            if (p.internado) {
                quantidade++;
            }
        }
        return quantidade;
    }

    

    
}
