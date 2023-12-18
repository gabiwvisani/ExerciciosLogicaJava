import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
      System.out.println("Qual a sua altura? (em metros)");
    double altura =scan.nextDouble();
      System.out.println("Qual o seu peso?");
    double peso =scan.nextDouble();
    double imc = peso/((altura)*(altura));
     System.out.println(peso);
      if (imc<17.0f){
        System.out.println("Muito abaixo do peso");
    }else if(imc>=17&&imc<18.50){
        System.out.println("Abaixo do peso");
    }else if(imc>=18.50&&imc<25){
        System.out.println("Normal");
    }else if(imc>=25&&imc<30){
        System.out.println("Acima do peso");
    }else if(imc>=30&&imc<35){
        System.out.println("Obesidade I");
    }else if(imc>=35&&imc<40){
        System.out.println("Obesidade II");
    }else{
        System.out.println("Obesidade III");
    }

    }
}
