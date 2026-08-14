package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaProdutos { //Exercício 3
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <String> produto = new ArrayList<>();

        produto.add("Arroz");
        produto.add("Feijão");
        produto.add("Açucar");
        produto.add("Farinha");
        produto.add("Óleo");


        System.out.println("===PRODUTOS===");
        for (int i = 0; i < produto.size(); i++) {
            System.out.println(produto.get(i));
        }

        System.out.println("Informe uma posição de 0" + " até " + (produto.size() -1) + " editar um produto");
        int posicao = scan.nextInt();

        System.out.println("Informe o novo produto");
        String novoProduto = scan.next();

        produto.set(posicao, novoProduto);

        System.out.println("===PRODUTOS ATUALIZADOS===");
        for (int i = 0; i < produto.size(); i++) {
            System.out.println(produto.get(i));
        }




    }
}
