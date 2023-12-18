//import java.util.Arrays;
//import java.util.OptionalDouble;

public class Ex2 {
    /*Entrada: [20.0, 40.0]
Saída: Valor total: 60.0 | Valor de descontos: 10.0 | Valor a pagar: 50.0

     */
    public static void main(String[] args) {
        double[] array1 = new double[]{20.0, 20.0, 30.0};
        String resultado = geraRecibo(array1);
        System.out.print( resultado) ;

    }

        public static String geraRecibo(double[] input){
            Double menor=input[0];
            Double total=input[0];
                for( int i = 1; i<input.length;i++) {
                    int count=i;
                    total+=input[i];
                    while (input[count]<menor&&input[count]<input[count-1]&& count-1>=0) {
                        menor = input[count];
                        count--;
                    }
                }
               Double desconto =menor/2.0;
               Double totalDescontado=total-desconto;

                     return "Valor total: "+ total.toString()+" | Valor de descontos: "+ desconto.toString()+" | Valor a pagar: "+totalDescontado.toString();

        }
    }

