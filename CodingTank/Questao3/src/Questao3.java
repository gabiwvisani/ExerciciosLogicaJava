import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos asteriscos você gostaria na base de triângulo? (passe um valor ímpar)");
        int asterisco = scan.nextInt();
        int i=1;
        while(asterisco%2==0 && i<=10){
            System.out.println("Você não informou um valor ímpar, informe um valor ímpar:");
            asterisco = scan.nextInt();
            i++;
            if(i==10){
                System.out.println("Você não parece conseguir informar um valor de ímpar. O programa será finalizado.");
                System.exit(0);
            }
        }
        int espaco=1;
        int ast=1;
        for( i=1;i<=asterisco;i+=2){
            for( espaco= 1;espaco<=(asterisco-i)/2;espaco++){
                System.out.print(" ");
            }
            for(ast=1;ast<=i;ast++){
                System.out.print("*");
            }
            System.out.println();
        }
        for( i=asterisco;i>=1;i=i-2){
            for( espaco= 1;espaco<=(asterisco-i)/2;espaco++){
                System.out.print(" ");
            }
            for(ast=i;ast>=1;ast--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
