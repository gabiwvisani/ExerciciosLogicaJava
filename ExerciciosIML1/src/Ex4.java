public class Ex4 {
    public static void main(String[] args) {
        double[] array1 = new double[]{2,2,3.1,4,4.1,4.1};
        System.out.println(elementosRepetidos(array1));
    }
    public static boolean elementosRepetidos(double[] input) {
        for( int i = 1; i<input.length;i++) {
            int count=i-1;
            while ( count>=0) {
                if(input[count]==input[i]){
                    return true;
                }
                count--;
            }
        }
        return false;
    }
}
