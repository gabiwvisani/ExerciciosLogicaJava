import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.print("Digite um número positivo para calcular o fatorial: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num < 0) {
            System.out.println("Número inválido.");
        } else {
            int fatorial = calcularFatorial(num);
            System.out.printf("O fatorial de %d é %d.", num, fatorial);
        }
        scan.close();
    }
    private static int calcularFatorial ( int numero){
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            int fatorial = 1;
            for (int i = 2; i <= numero; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
}
