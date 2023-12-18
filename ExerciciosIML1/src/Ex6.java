public class Ex6 {
    //de 1 até 5 anos => 1%
    //de 5 até 10 anos => 1.5%
    //10 ou mais anos => 2% valor da inflação (IPCA)
    //a soma do percentual de tempo de serviço mais o percentual da inflação
    //Entrada: [1, 5.0, 2000.00]
    //Saída: 2120.00
    public static void main(String[] args) {
        double[] array1 = new double[]{11,4.5,2500.00};
        System.out.println(calculoSalario(array1));

    }
    public static double calculoSalario( double[] input) {
        double percReajuste=0.0;
        if(input[0]>=1&&input[0]<5){
            percReajuste=0.01;
        }else if(input[0]>=5&&input[0]<10){
            percReajuste=0.015;
        }else if(input[0]>=10){
            percReajuste=0.02;
        }
        double resultado = Math.round((((percReajuste+(input[1]/100.00))*input[2])+input[2])*100)/100;
        return resultado;
    }
}
