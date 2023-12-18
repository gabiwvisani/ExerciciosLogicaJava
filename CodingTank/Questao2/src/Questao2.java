import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double VALOR_CARRO = 20000;
        double quantidadeParcelas=0;
        System.out.println("Qual valor de parcela você pode pagar?");
        double parcela = scan.nextFloat();
        int i=1;
        while(parcela<1000.00 && i<=10){
            System.out.println("O valor mínimo da parcela deve ser 1000,00 reais, informe um novo valor.");
             parcela = scan.nextFloat();
             i++;
             if(i==10){
                 System.out.println("Você não parece conseguir informar um valor de parcela dentro dos parâmetros de imprestimo. O programa será finalizado.");
                 System.exit(0);
             }
        }
        quantidadeParcelas=VALOR_CARRO/parcela;
        System.out.println("Com o valor de parcela = "+parcela+" é possível parcelar em "+quantidadeParcelas+" vezes");

    }
}
