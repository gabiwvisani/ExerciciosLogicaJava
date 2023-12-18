import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Digite um número inteiro: ");
            int x = scan.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d%n", x, i, x * i);
            }
            scan.close();
    }
}
