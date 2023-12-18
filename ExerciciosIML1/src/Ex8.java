public class Ex8 {
    //Entrada: [3.0, 25.00, 2.0]
    //Saída: 25.000
    //Segundas (1), Terças(2) e Quintas(4), ela oferece um desconto de 25% do preço normal de entrada.
    // Nos dias de músicas ao vivo, o preço da entrada ainda é acrescido em 15%
    public static void main(String[] args) {
        double[] array1 = new double[]{4.0, 50.00, 1.0};
        System.out.println(valorEntrada(array1));
    }

        public static double valorEntrada(double[] input) {
            if(input[0]==1.0||input[0]==2.0||input[0]==4.0){
                input[1]=input[1]-(input[1]*0.25);
            }
            if(input[2]==1.0){
                input[1]=input[1]+(input[1]*0.15);
            }
            double resultado = Math.round(input[1]*1000.000)/1000.000;

            return resultado;
        }

}
