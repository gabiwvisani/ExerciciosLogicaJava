import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a quantidade de notas a serem calculadas: ");
        int quantidade = scan.nextInt();
        double soma = 0.0;
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite a nota da " + i + "ª prova: ");
            double nota = scan.nextDouble();
            soma += nota;
        }
        double media = soma / quantidade;
        System.out.printf("A média das %d provas é %.2f%n", quantidade, media);
        scan.close();
    }
}
