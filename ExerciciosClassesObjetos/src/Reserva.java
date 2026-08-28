public class Reserva {
    String hospede;
    int numeroQuarto;
    int diarias;
    double valorDiaria;


    public void adicionarDiarias(int quantidade){
        diarias = diarias + quantidade;
    }

    public double calcularTotal(){
        return diarias * valorDiaria;
    }

    public void exibirResumo(){
        System.out.println("===RESERVA===");
        System.out.println("Hospede: "  + hospede);
        System.out.println("Número Quarto: " + numeroQuarto);
        System.out.println("Valor diária: " + valorDiaria);
        System.out.println("Quantidade de diárias: " + diarias);
    }

}
