import java.util.Scanner;

public class SalarioFuncionario { //Exercício 04
    
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o salário do funcionário: ");
        double salario = scan.nextDouble();

        System.out.println("Informe o percentual de reajuste: ");
        double reajuste = scan.nextDouble();

        double aumento = calcularAumento(salario, reajuste);
        double novoSalario = calcularNovoSalario(salario, aumento);

        System.out.println("Salário atual: " + salario);
        System.out.println("Valor do aumento: " + aumento);
        System.out.println("Novo salário: " + novoSalario);

    }

    public static double calcularAumento(double salario, double reajuste) {
        return salario * (reajuste / 100);
    }

    public static double calcularNovoSalario(double salario, double aumento){
        return salario + aumento;
    }

    public static void mensagem(){
        System.out.println("Reajuste concluído!");
    }
}
