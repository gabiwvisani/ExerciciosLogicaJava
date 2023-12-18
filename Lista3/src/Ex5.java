import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        double consumoKmL = 12.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempoViagem = scanner.nextDouble();
        System.out.print("Digite a velocidade média durante a viagem (em km/h): ");
        double velocidadeMedia = scanner.nextDouble();
        double litrosCombustivel = calcularLitrosCombustivel(tempoViagem, velocidadeMedia, consumoKmL);
        System.out.printf("Quantidade de litros de combustível gastos: %.3f%n", litrosCombustivel);
        scanner.close();
    }
    private static double calcularLitrosCombustivel(double tempoViagem, double velocidadeMedia, double consumoKmL) {
        double distancia= tempoViagem * velocidadeMedia;
        double litrosCombustivel = distancia / consumoKmL;
        return litrosCombustivel;
    }
}
