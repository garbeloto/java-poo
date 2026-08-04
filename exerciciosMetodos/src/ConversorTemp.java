import java.util.Scanner;

public class ConversorTemp { //Exercício 03
    
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe uma temperatura em Celsius: ");
        double temperatura = scan.nextDouble();

        System.out.println("Temperatura convertida de Celsius em Fahrenheit: " + converterFahrenheit(temperatura));

        System.out.println("Temperatura convertida de Celsius em kelvin: " + converterKelvin(temperatura));

    }

    public static double converterFahrenheit(double temperatura){
        return (temperatura * 1.8) + 32;
    }

    public static double converterKelvin(double temperatura){
        return temperatura + 273.15;
    }

    public static void conversaoConcluida(){
        System.out.println("Conversão concluída!");
    }
}
