import java.util.Objects;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Qual operação deseja fazer? (Somar, Subtrair, Dividir, Multiplicar, Resto, Raiz ou Potência)");
            String operacao = scan.nextLine().toLowerCase();
            if(!Objects.equals(operacao, "somar") && !Objects.equals(operacao, "subtrair") && !Objects.equals(operacao, "dividir") && !Objects.equals(operacao, "multiplicar") && !Objects.equals(operacao, "resto") && !Objects.equals(operacao, "raiz") && !Objects.equals(operacao, "potência")){
                System.out.println("Operação desconhecida");
                System.exit(0);
            }
            System.out.println("Informe o primeiro número.");
            Double num1 = scan.nextDouble();
            System.out.println("Informe o segundo número.");
            Double num2 = scan.nextDouble();
            if(operacao.equals("dividir") &&num2==0.0) {
                System.out.println("Não é permitido divisão por ZERO.");
                System.exit(0);
            }else{
                switch (operacao){
                    case "somar":
                        System.out.println(num1+num2);
                        break;
                    case "subtrair":
                        System.out.println(num1-num2);
                        break;
                    case "dividir":
                        System.out.println(num1/num2);
                        break;
                    case "multiplicar":
                        System.out.println(num1*num2);
                        break;
                    case "resto":
                        System.out.println(num1%num2);
                        break;
                    case "raiz":
                        System.out.println(Math.pow(num1, 1.0 / num2));
                        break;
                    case "potência":
                        System.out.println(Math.pow(num1, num2));
                        break;
                    default:
                        System.out.println("Erro inesperado");
                        break;
                }

            }

    }
}
