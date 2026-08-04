import java.util.Scanner;

public class DescontoProduto {
    
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valorProduto = scan.nextDouble();

        System.out.println("Digite o percentual do desconto:");
        double percentual = scan.nextDouble();

        double desconto = calculaDesconto(percentual, valorProduto);
        double valorFinal = calculaValorFinal(valorProduto, desconto);
        
        System.out.println("Valor desconto: " + desconto);
        System.out.println("Valor final: " + valorFinal);
        
        compraCalculada();
    }

    public static double calculaDesconto(double desconto, double valor){
        return (valor * desconto) / 100;
    }

    public static double calculaValorFinal(double valor, double desconto){
        return valor - desconto;
    }

    public static void compraCalculada(){
        System.out.println("Compra calculada com sucesso!");
    }
}
