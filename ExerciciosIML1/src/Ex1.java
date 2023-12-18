public class Ex1 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,7,3,8,5,0};
        int[] resultado = ordenar(array1);
        System.out.print("Array Ordenado: ");
        for (int num : resultado) {
            System.out.print(num + " ");
        }

    }

        public static int[] ordenar(int[] input)
        {
            for (int i = 1; i < input.length; i++) {
                int key = input[i];
                int j = i - 1;

                while (j >= 0 && input[j] > key) {
                    input[j + 1] = input[j];
                    j = j - 1;
                }

                input[j + 1] = key;
            }

            return input;/*
            int a=0;
            for(int i =1; i<input.length;i++) {
                int count = i;
                while (input[count - 1] > input[count] &&(count-1)>=0 ) {
                    a = input[count - 1];
                    input[count - 1] = input[count];
                    input[count]=a;
                    count--;
                }

                }
            return input;*/

        }

}
