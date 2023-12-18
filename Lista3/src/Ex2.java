import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a temperatura atual: ");
        double temperaturaAtual = scan.nextDouble();
        System.out.print("Digite a unidade de medida atual (celsius, fahrenheit ou kelvin): ");
        String medidaAtual = scan.next().toLowerCase();
        System.out.print("Digite a unidade de medida desejada (celsius, fahrenheit ou kelvin): ");
        String medidaFinal = scan.next().toLowerCase();
        double resultado = converterTemperatura(temperaturaAtual, medidaAtual, medidaFinal);
        System.out.printf("Temperatura atual = %.2f%nMedida atual = %s%nMedida final = %s%nOutput = %.2f%n",temperaturaAtual,medidaAtual,medidaFinal, resultado);
        scan.close();
    }
    private static double converterTemperatura(double temperatura, String medidaAtual, String medidaFinal) {
        switch (medidaAtual) {
            case "celsius":
                switch (medidaFinal) {
                    case "celsius":
                        return temperatura;
                    case "fahrenheit":
                        return (temperatura * 9 / 5) + 32;
                    case "kelvin":
                        return temperatura + 273.15;
                    default:
                        System.out.println("Unidade de medida final inválida.");
                        System.exit(0);
                }
            case "fahrenheit":
                switch (medidaFinal) {
                    case "celsius":
                        return (temperatura - 32) * 5 / 9;
                    case "fahrenheit":
                        return temperatura;
                    case "kelvin":
                        return (temperatura - 32) * 5 / 9 + 273.15;
                    default:
                        System.out.println("Unidade de medida final inválida.");
                        System.exit(0);
                }
            case "kelvin":
                switch (medidaFinal) {
                    case "celsius":
                        return temperatura - 273.15;
                    case "fahrenheit":
                        return (temperatura - 273.15) * 9 / 5 + 32;
                    case "kelvin":
                        return temperatura;
                    default:
                        System.out.println("Unidade de medida final inválida.");
                        System.exit(0);
                }
            default:
                System.out.println("Unidade de medida atual inválida.");
                System.exit(0);
                return 0;
        }
    }
}
