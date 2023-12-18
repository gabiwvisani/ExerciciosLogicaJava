import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex5 {
    //número de carros por ele vendidos no mês, o valor total de suas vendas no mês,
    // seu salário fixo, valor fixo que ele recebe por carro vendido
    // Ex:
    //Entrada: [3, 20000.00, 2000.00, 250.00]
    //Saída: 3750.00
    //5% sobre o valor total vendido no mês
    //valor fixo por cada carro vendido
    public static void main(String[] args) {
        double[] array1 = new double[]{4,25000.00, 3500.00, 100.00};
        System.out.printf("%.2f",salarioComComissao(array1));

    }
        public static double salarioComComissao( double[] input) {
            double cincoPorCento = input[1] * 0.05;
            double vF = input[3] * input[0];
            double resultado = input[2] + cincoPorCento + vF;
            BigDecimal roundedResult = new BigDecimal(resultado).setScale(2, RoundingMode.HALF_UP);
            return roundedResult.doubleValue();
            //double cincoPorCento = input[1]*0.05;
           // double vF = input[3]*input[0];
           // Double resultado = input[2]+cincoPorCento+vF;
           // return resultado;
        }

}
