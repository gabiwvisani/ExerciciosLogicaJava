import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite o seu salário: ");
        Double salario = scan.nextDouble();
        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Digite a sua altura em metros: ");
        float altura = scan.nextFloat();
        scan.nextLine();
        System.out.println("Digite o seu sexo: ");
        String sexo = scan.nextLine();
        System.out.printf("Seu nome é %s, seu salário é %.2f, sua idade é %d, sua altura é %.2fm e seu sexo é %s.", nome, salario, idade, altura, sexo);

    }
}
