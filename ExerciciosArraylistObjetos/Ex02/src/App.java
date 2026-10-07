import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Medico med1 = new Medico("José Carlos", "Clínico Geral");
        Medico med2 = new Medico("Maria da Silva", "Cardiologia");
        Medico med3 = new Medico("Marcos de Souza", "Ortopedista");

        ArrayList<Paciente> pacientes = new ArrayList<>();

        pacientes.add(new Paciente("João", 45, med2, true));
        pacientes.add(new Paciente("Maria", 8, med1, false));
        pacientes.add(new Paciente("José", 35, med3, true));
        pacientes.add(new Paciente("Pedro", 50, med2, false));
        pacientes.add(new Paciente("Lucas", 22, null, true));
        pacientes.add(new Paciente("Tiago", 30, null, false));

        System.out.println("=====PACIENTES====");
        for (Paciente paciente : pacientes) {
            paciente.exibirInformacoes();
            paciente.verificarAtendimento();
            System.out.println("------------------------");
        }

        System.out.println("=====PACIENTES INTERNADOS====");
        for (Paciente paciente : pacientes) {
            if (paciente.internado) {
                paciente.exibirInformacoes();
                ;
                System.out.println("------------------------");
            }
        }

        String especialidadeFiltro = "Cardiologia";
        System.out.println("\n========== PACIENTES DA " + especialidadeFiltro.toUpperCase() + " ==========");
        for (Paciente p : pacientes) {
            if (p.medico != null && p.medico.especialidade.equals(especialidadeFiltro)) {
                p.exibirInformacoes();
                System.out.println("----------------------------------------");
            }
        }

    }
}

/* public static void main(String[] args) {
        // 1. Criando 3 médicos de especialidades diferentes
        Medico med1 = new Medico("Dr. Roberto", "Cardiologia");
        Medico med2 = new Medico("Dra. Ana", "Pediatria");
        Medico med3 = new Medico("Dr. Carlos", "Ortopedia");

        // 2. Criando 6 pacientes (alguns internados, alguns não, um ou mais sem médico)
        Paciente p1 = new Paciente("João", 45, med1, true);    // Internado, com médico
        Paciente p2 = new Paciente("Maria", 8, med2, false);  // Não internado, com médico
        Paciente p3 = new Paciente("José", 35, med3, true);   // Internado, com médico
        Paciente p4 = new Paciente("Pedro", 50, med1, false); // Não internado, com médico
        Paciente p5 = new Paciente("Lucas", 22, null, true);  // Internado, SEM médico
        Paciente p6 = new Paciente("Tiago", 30, null, false); // Não internado, SEM médico

        // 3. Armazenando os pacientes em um ArrayList
        ArrayList<Paciente> listaPacientes = new ArrayList<>();
        listaPacientes.add(p1);
        listaPacientes.add(p2);
        listaPacientes.add(p3);
        listaPacientes.add(p4);
        listaPacientes.add(p5);
        listaPacientes.add(p6);

        // 4. Utilizando foreach para exibir todos e verificar situação
        System.out.println("========== TODOS OS PACIENTES ==========");
        for (Paciente p : listaPacientes) {
            p.exibirInformacoes();
            p.verificarAtendimento();
            System.out.println("----------------------------------------");
        }

        // 5. Utilizando foreach para mostrar somente os internados
        System.out.println("\n========== APENAS PACIENTES INTERNADOS ==========");
        for (Paciente p : listaPacientes) {
            if (p.internado) {
                p.exibirInformacoes();
                System.out.println("----------------------------------------");
            }
        }

        // 6. Utilizando foreach para mostrar pacientes de uma especialidade (Ex: Cardiologia)
        String especialidadeFiltro = "Cardiologia";
        System.out.println("\n========== PACIENTES DA " + especialidadeFiltro.toUpperCase() + " ==========");
        for (Paciente p : listaPacientes) {
            // É preciso checar se o médico não é nulo antes de ler a especialidade dele para evitar erro
            if (p.medico != null && p.medico.especialidade.equals(especialidadeFiltro)) {
                p.exibirInformacoes();
                System.out.println("----------------------------------------");
            }
        }

        // 7. Testando o método contarInternados
        System.out.println("\nTotal de pacientes internados: " + contarInternados(listaPacientes));
        
        // 8. Testando o método de alta (Opcional, apenas para demonstrar o funcionamento)
        System.out.println("\nDando alta para o João...");
        p1.altaPaciente();
        System.out.println("Novo total de pacientes internados: " + contarInternados(listaPacientes));
    }
}
 */