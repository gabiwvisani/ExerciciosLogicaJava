import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual operação deseja fazer? (Somar, Subtrair, Dividir ou Multiplicar)");
        String operacao = scan.nextLine().toLowerCase();
        if(!operacao.equals("somar") && !operacao.equals( "subtrair") && !operacao.equals( "dividir") && !operacao.equals("multiplicar") ){
            System.out.println("Operação desconhecida");
            System.exit(0);
        }
        System.out.println("Informe o primeiro número.");
        Double num1 = scan.nextDouble();
        System.out.println("Informe o segundo número.");
        Double num2 = scan.nextDouble();
        switch (operacao){
            case "somar":
                somar(num1,num2);
                break;
            case "subtrair":
                subtrair(num1,num2);
                break;
            case "dividir":
                dividir(num1,num2);
                break;
            case "multiplicar":
                multiplicar(num1,num2);
                break;
            default:
                System.out.println("Erro inesperado");
                break;
        }

    }
    public static void somar(double num1, double num2){
        System.out.println(num1+num2);
    }
    public static void subtrair(double num1, double num2){
        System.out.println(num1-num2);
    }
    public static void dividir(double num1, double num2){
        if(num2==0.0) {
            System.out.println("Não é permitido divisão por ZERO.");
        }else {
            System.out.println(num1 / num2);
        }
    }
    public static void multiplicar(double num1, double num2){
        System.out.println(num1*num2);
    }

}
