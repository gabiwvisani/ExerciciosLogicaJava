import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos alunos existem na turma?");
        int qtdAlunos = scan.nextInt();
        System.out.println("Quantas notas cada aluno teve?");
        int qtdNotas = scan.nextInt();
        double[][] matrizNotasDaTurma = new double[qtdAlunos][qtdNotas];
        double somaTurma =0.0;
        double somaAluno =0.0;
        double[] mediaAluno =new double[qtdAlunos];
        for(int i=0;i<qtdAlunos;i++){
            System.out.println("Digite as notas do aluno "+(i)+":");
            somaAluno =0.0;
            for(int count=0;count<qtdNotas;count++){
                System.out.println("Nota da avaliação número "+(count+1)+":");
                matrizNotasDaTurma[i][count]=scan.nextDouble();
                somaTurma+=matrizNotasDaTurma[i][count];
                somaAluno+=matrizNotasDaTurma[i][count];
            }
            mediaAluno[i]=somaAluno/qtdNotas;
        }
        for(int i=0;i<qtdAlunos;i++){
            System.out.println("Aluno "+i+" - Média "+mediaAluno[i]);
        }
        System.out.println("Média da turma: "+(somaTurma/(qtdAlunos*qtdNotas)));
        scan.close();
    }
}
