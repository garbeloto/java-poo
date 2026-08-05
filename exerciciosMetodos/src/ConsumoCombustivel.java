import java.util.Scanner;

public class ConsumoCombustivel {
    
public static void main(String[] args) throws Exception { //Exercício 05
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe a distância percorrida (km): ");
    double distancia = scan.nextDouble();

    System.out.println("Informe a quantidade de combustível consumido (litros): ");
    double combustivel = scan.nextDouble();

    double consumo = calcularConsumo(distancia, combustivel);

    System.out.println("Consumo: " + consumo);
    classificarConsumo(consumo);
    mensagem();

    }

    public static double calcularConsumo(double distancia, double combustivel){
        return distancia / combustivel;
    }

    public static void classificarConsumo (double consumo){

        if (consumo >=16) {
            System.out.println("Econômico");
        } else if (consumo >= 8) {
            System.out.println("Regular");
        } else {
            System.out.println("Alto consumo");
        }

    }

    public static void mensagem(){
        System.out.println("Calculo concluido com sucesso!");
    }
}
