import java.util.Scanner;

public class mediaEscolar { //Exercício 01
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do aluno: ");
        String nome = scan.nextLine();

        System.out.println("Digite a primeira nota do aluno: ");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota do aluno: ");
        double nota2 = scan.nextDouble();

        System.out.println("Digite a terceira nota do aluno: ");
        double nota3 = scan.nextDouble();

        double media = calculaMedia(nota1, nota2, nota3);

        System.out.println("Nome do aluno: " + nome);

        System.out.println("Média do aluno: " + media);
        aprovacaoAluno(media);
        boletim();
    }

    public static double calculaMedia(double nota1, double nota2, double nota3){
        return (nota1 + nota2 + nota3) / 3;
    }

    public static void aprovacaoAluno(double media){
        if (media < 0 || media > 10) {
            System.out.println("Média invalida!");
        } else if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (media >= 5) {
            System.out.println("Aluno em recuperação!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }

    public static void boletim(){
        System.out.println("Boletim gerado com sucesso!");
    }

}
