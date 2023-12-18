import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho que deseja que a Array tenha:");
        int tamanho = scan.nextInt();
        int[] arrayChecaPivot = new int[tamanho];
        System.out.println("Agora você irá popular a array.");
        for(int i=0;i<tamanho;i++) {
            System.out.println("Digite um número inteiro para popular a posição: " + i);
            arrayChecaPivot[i] = scan.nextInt();
        }
        int pivotIndex = pivotIndex(arrayChecaPivot);
        System.out.println("O index pivot dessa array é : "+pivotIndex+"\n(se for -1, não existe pivot para essa array)");

    }
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftsum = 0;
        for (int elemento : nums) {
            totalSum += elemento;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftsum * 2 == totalSum - nums[i]) {
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}
