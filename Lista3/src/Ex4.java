import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do funcionário: ");
        String nome = scan.nextLine();
        System.out.print("Digite o número de horas trabalhadas por mês: ");
        double horasPorMes = scan.nextDouble();
        System.out.print("Digite o valor da hora de trabalho: ");
        double valorHora = scan.nextDouble();
        double salarioAnual = calcularSalarioAnual(horasPorMes, valorHora);
        System.out.printf("O salário anual de %s é R$ %.2f%n", nome, salarioAnual);
        scan.close();
    }
    private static double calcularSalarioAnual(double horasPorMes, double valorHora) {
        double salarioAnual = horasPorMes * valorHora * 12.0;
        return salarioAnual;
    }
}
