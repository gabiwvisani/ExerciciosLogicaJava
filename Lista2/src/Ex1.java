import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int X = scan.nextInt();
        System.out.println("Se o número for ímpar, será imprimido Weird.");
        if (X%2 == 1) {
            System.out.println("Weird");
        }
        System.out.println("Se o número for par e estiver no intervalo inclusivo de 2 a 5,será imprimido Not Weird");
        if (X%2==0 && X >= 2 && X <= 5) {
            System.out.println("Not Weird");
        }
        System.out.println("Se o número for par e estiver no intervalo inclusivo de 6 a 20, será imprimido Weird");
        if (X >= 6 && X <= 20) {
            System.out.println("Weird");
        }
        System.out.println("Se o número for par e maior que 20, será imprimido Not Weird");
        if(X%2==0 && X>20){
            System.out.println("Not Weird");
        }
        scan.close();
    }
}
