public class Veiculo {
    // Sem encapsulamento
    String modelo;
    int ano;
    Mecanico mecanico;
    boolean pronto;

    // Construtor
    public Veiculo(String modelo, int ano, Mecanico mecanico, boolean pronto) {
        this.modelo = modelo;
        this.ano = ano;
        this.mecanico = mecanico;
        this.pronto = pronto;
    }

    public void exibirDados() {
        System.out.println("Veículo: " + modelo + " | Ano: " + ano);
        System.out.println("Status: " + (pronto ? "Pronto" : "Em conserto/Fila"));
        
        if (mecanico != null) {
            System.out.println("Mecânico Responsável: " + mecanico.nome + " (" + mecanico.especialidade + ")");
        } else {
            System.out.println("Mecânico Responsável: Nenhum");
        }
    }

    public void verificarStatus() {
        if (this.pronto) {
            System.out.println("Situação: Veículo pronto para retirada");
        } else if (this.mecanico != null) {
            System.out.println("Situação: Veículo em conserto");
        } else {
            System.out.println("Situação: Aguardando mecânico disponível");
        }
    }

    public void marcarComoPronto() {
        this.pronto = true;
        System.out.println("O veículo " + this.modelo + " teve seu conserto finalizado.");
    }
}
