import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Colaborador> colaborador = new ArrayList<>();

        colaborador.add(new Gerente("Carlos", "00000000", 8000, "10/03/2008", "Gerente", false, 18));
        colaborador.add(new Gerente("Mariana", "00000000", 7000, "15/06/2014", "Gerente", true, 12));
        colaborador.add(new Desenvolvedor("João", "00000000", 6000, "01/02/2020", "Desenvolvedor", false, 6));
        colaborador.add(new Desenvolvedor("Ana", "00000000", 5000, "10/08/2023", "Desenvolvedor", true, 3));
        colaborador.add(new DesenvolvedorSenior("Rafael", "00000000", 9000, "05/01/2010", "Desenvolvedor sênior", false, 16));
        colaborador.add(new DesenvolvedorSenior("Fernanda", "00000000", 8000, "20/11/2016", "Desenvolvedor sênior", true, 10));
        colaborador.add(new Estagiario("Pedro", "00000000", 2000, "05/01/2010", "Estagiário", false, 16));
        colaborador.add(new Estagiario("Julia", "00000000", 1800, "20/11/2016", "Estagiário", false, 10));

        for (Colaborador c : colaborador) {
            System.out.println();
            c.exibirDemonstrativo("11/2026");
        }
    }
}
