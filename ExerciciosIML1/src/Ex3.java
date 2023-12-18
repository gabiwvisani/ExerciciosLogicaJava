public class Ex3 {
   // Entrada: 1,2,3,6,9
   // Saída: 3 pares, 3 ímpares
   public static void main(String[] args) {
       int[] array1 = new int[]{1,2,3,6,9};
       System.out.println(parImpar(array1));
   }
    public static String parImpar(int[] input) {
       Integer par = 0;
       Integer impar = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i]%2==0){
                par++;
            }else{
                impar++;
            }
        }
        return par.toString()+" pares, "+impar.toString()+" ímpares";
    }
}
