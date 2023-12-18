import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int figura =0;
        int contador =1;
        while (figura < 1 || figura > 4) {
            System.out.println("Escolha a figura geométrica. Digite 1 para retângulo, 2 para triângulo, 3 para círculo ou 4 para trapézio):");
            figura = scan.nextInt();
            if ((figura < 1 || figura > 4) && contador < 5) {
                System.out.println("Por favor digite um número válido.");
                contador++;
            } else if ((figura < 1 || figura > 4) && contador >4) {
                System.out.println("Você não parece conseguir digitar uma opção válida a aplicação sera fechada.");
                System.exit(0);
            }
        }
        double area = 0.0;
        switch (figura) {
            case 1:
                System.out.println("Digite a largura do retângulo:");
                double largura = scan.nextDouble();
                System.out.println("Digite a altura do retângulo:");
                double altura = scan.nextDouble();
                area = calcularAreaRetangulo(largura, altura);
                break;

            case 2:
                System.out.println("Digite a base do triângulo:");
                double baseTriangulo = scan.nextDouble();
                System.out.println("Digite a altura do triângulo:");
                double alturaTriangulo = scan.nextDouble();
                area = calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
                break;

            case 3:
                System.out.println("Digite o raio do círculo:");
                double raio = scan.nextDouble();
                area = calcularAreaCirculo(raio);
                break;

            case 4:
                System.out.println("Digite a base maior do trapézio:");
                double baseMaior = scan.nextDouble();
                System.out.println("Digite a base menor do trapézio:");
                double baseMenor = scan.nextDouble();
                System.out.println("Digite a altura do trapézio:");
                double alturaTrapezio = scan.nextDouble();
                area = calcularAreaTrapezio(baseMaior, baseMenor, alturaTrapezio);
                break;

        }
        System.out.printf("A área da figura %s é: %.2f%n", figura, area);

        // Fechar o Scanner (opcional, mas recomendado para evitar vazamentos de recursos)
        scan.close();
    }
    private static double calcularAreaRetangulo(double largura, double altura) {
        return largura * altura;
    }

    private static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    private static double calcularAreaCirculo(double raio) {
        return Math.PI * raio * raio;
    }

    private static double calcularAreaTrapezio(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) / 2) * altura;
    }
}
