import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número para calcular");
        double n1 = scan.nextDouble();

        System.out.println("Digite o segundo número para calcular");
        double n2 = scan.nextDouble();

        System.out.println("Digite a opção de calculo desejada: ");
        System.out.println("1 - Adição | 2 - Subtração | 3 - Divisão | 4 - Multiplicação");
        double operacao = scan.nextDouble();

        if (operacao == 1) {
            System.out.println("Resultado: " + adicao(n1, n2));
           operacaoConcluida();

        } else if (operacao == 2) {
            System.out.println("Resultado: " + subtracao(n1, n2));
            operacaoConcluida();

        } else if (operacao == 3) {
            System.out.println("Resultado: " + divisao(n1, n2));
            operacaoConcluida();

        } else if (operacao == 4) {
            System.out.println("Resultado: " + multiplicacao(n1, n2));
            operacaoConcluida();

        } else {
            System.out.println("Operação inválida");
        }
        
    }

    public static double adicao(double n1, double n2){
        return n1 + n2;
    }

    public static double subtracao(double n1, double n2){
        return n1 - n2;
    }

    public static double divisao(double n1, double n2){
        return n1 / n2;
    }

    public static double multiplicacao(double n1, double n2){
        return n1 * n2;
    }

    public static void operacaoConcluida(){
        System.out.println("Operação concluída!");
    }
}
