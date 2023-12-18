public class Ex7 {
    //Entrada: [115500.00,25000.00, 32500.00]
    //Saída: [21.64, 28.14]
    public static void main(String[] args) {
        double[] array1 = new double[]{115500.00,25000.00, 32500.00};
        double[] resultado = custosCarro(array1);
       // System.out.println(custosCarro(array1));
        for (double num : resultado) {
            System.out.print(num + " ");
        }

    }
    public static double[] custosCarro( double[] input) {
        double[] resultado = new double[2];
        resultado[0]= Math.round((input[1] / input[0]) * 10000.0)/100.0;
        resultado[1]= Math.round((input[2] / input[0]) * 10000.0)/100.0;
        return resultado;
    }

}
