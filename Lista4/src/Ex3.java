import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho que deseja que a Array tenha:");
        int tamanho = scan.nextInt();
        int[] arrayInput = new int[tamanho];
        int[] arrayResultado = new int[tamanho];
        System.out.println("Agora você irá popular a array.");
        int soma =0;
        for(int i=0;i<tamanho;i++){
            System.out.println("Digite um número inteiro para popular a posição: "+i);
            arrayInput[i]=scan.nextInt();
            soma+=arrayInput[i];
            arrayResultado[i]=soma;
        }
        System.out.print("A array de soma acumulada é : [");
        for(int i=0;i<tamanho-1;i++){
                System.out.print(arrayResultado[i] + ", " );
            }
        System.out.print(arrayResultado[tamanho-1] + "]");
        scan.close();
    }
}
