package ExerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleEstoque { //Exercício 10
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <String> produto = new ArrayList<>();

        produto.add("Bolacha");
        produto.add("Arroz");
        produto.add("Farinha de Trigo");
        produto.add("Açucar");
        produto.add("Feijão");

        System.out.println("====PRODUTOS CADASTRADOS====");
        for (int i = 0; i < produto.size(); i++) {
            System.out.println(produto.get(i));
        }

        System.out.println("Adicione um novo produto: ");
        String novoProduto = scan.next();

        produto.add(novoProduto);

        System.out.println("Informe uma posição de 0 " + (produto.size() - 1) + " para alterar um produto: ");
        int posicaoEditar = scan.nextInt();

        System.out.println("Informe o novo produto: ");
        String produtoEditar = scan.next();

        produto.set(posicaoEditar, produtoEditar);

        System.out.println("Informe uma posição de 0-" + (produto.size() - 1) + " para remover um produto: ");
        int removerProduto = scan.nextInt();

        produto.remove(removerProduto);

        System.out.println("Informe uma posição de 0-" + (produto.size() - 1) + " para consultar um produto: ");
        int produtoConsultar = scan.nextInt();

        System.out.println("Produto consultado: " + produto.get(produtoConsultar));

        System.out.println("====PRODUTOS CADASTRADOS====");
        for (int i = 0; i < produto.size(); i++) {
            System.out.println(produto.get(i));
        }

        System.out.println("Quantidade de produtos cadastrados: " + produto.size());
    }


}
