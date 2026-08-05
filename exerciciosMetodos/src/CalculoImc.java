import java.util.Scanner;

public class CalculoImc {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu peso: ");
        double peso = scan.nextDouble();

        System.out.println("Informe sua altura: ");
        double altura = scan.nextDouble();


    }

    public static double calcularImc (double peso, double altura){
        return peso / (altura * altura);
    }

    public static void classificacaoImc (double imc){
        if (imc < 18.5) {
            System.out.println("Magreza (abaixo do peso)");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Normal (peso saudável)");
        }
    }
}

/*Menor que 18,5: Magreza (abaixo do peso)18,5 a 24,9: Normal (peso saudável)25,0 a 29,9: Sobrepeso (excesso de peso)30,0 a 39,9: Obesidade (graus I e II)Maior que 40,0: Obesidade grave (grau III) */