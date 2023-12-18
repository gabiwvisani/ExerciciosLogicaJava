import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho que deseja que as Arrays tenham:");
        int tamanho = scan.nextInt();
        int[] array1 = new int[tamanho];
        int[] array2 = new int[tamanho];
        System.out.println("Agora você irá popular a primeira array.");
        for(int i=0;i<tamanho;i++){
            System.out.println("Digite um número inteiro para popular a posição: "+i);
            array1[i]=scan.nextInt();
        }
        System.out.println("Agora você irá popular a segunda array.");
        for(int i=0;i<tamanho;i++){
            System.out.println("Digite um número inteiro para popular a posição: "+i);
            array2[i]=scan.nextInt();
        }
        int[] arrayConcatenada = new int[tamanho*2];
        System.out.print("A Array concatenada é : [");
        for(int i=0;i<tamanho;i++){
            arrayConcatenada[i*2]=array1[i];
            arrayConcatenada[i*2+1]=array2[i];
            if(i!=tamanho-1) {
                System.out.print(arrayConcatenada[i*2] + ", " + arrayConcatenada[i*2+1] + ", ");
            }else{
                System.out.print(arrayConcatenada[i*2] + ", " + arrayConcatenada[i*2+1] + "]");
            }
        }
        scan.close();

    }
}
