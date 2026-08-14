import java.util.Scanner;

public class ComissaoVendas { //Exercício 7
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do vendedor: ");
        String nomeVendedor = scan.next();

        System.out.println("Informe seu salário base: ");
        Double salarioBase = scan.nextDouble();

        System.out.println("Informe o total vendido: ");
        Double totalVendido = scan.nextDouble();

        double comissao = comissaoVendas(salarioBase);

        System.out.println("Nome do vendedor: " + nomeVendedor);
        System.out.println("Total vendido: "+ totalVendido);
        System.out.println("Valor comissão: " + comissao);
        System.out.println("Salário Final: " + salarioFinal(comissao, salarioBase));

        mensagemFinal();
    }

    public static double comissaoVendas (double totalVendido){
        return totalVendido * 0.05;
    }

    public static double salarioFinal (double comissao, double salarioBase){
        return salarioBase + comissao;
    }

    public static void mensagemFinal(){
        System.out.println("Cálculo da comissão finalizado com sucesso!");
    }
}
