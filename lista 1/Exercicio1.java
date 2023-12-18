import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o seu nome.\n");
        String nome = scan.nextLine();
        System.out.println("Digite a sua idade.");
        int idade = scan.nextInt();
        scan.nextLine();
        System.out.print("Digite a sua profissão.\n");
        String profissao = scan.nextLine();
        System.out.printf("Seu nome é %s, sua idade é %d e sua profissão é %s.", nome, idade, profissao);
    }
}
