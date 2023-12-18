import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> candidatos = new HashMap<>();
        System.out.println("Digite o nome do primeiro candidato:");
        candidatos.put(scan.nextLine().toLowerCase(), 0);
        System.out.println("Digite o nome do segundo candidato:");
        candidatos.put(scan.nextLine().toLowerCase(), 0);
        System.out.println("Digite o nome do terceiro candidato:");
        candidatos.put(scan.nextLine().toLowerCase(), 0);
        candidatos.put("Nulo", 0);
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do candidato: ");
            String nomeCandidato = scan.nextLine().toLowerCase();
            if (candidatos.containsKey(nomeCandidato)) {
                candidatos.put(nomeCandidato, candidatos.get(nomeCandidato) + 1);
            } else {
                candidatos.put("Nulo", candidatos.get("Nulo") + 1);
            }
        }
        String vencedor = "";
        int maiorNumeroVotos = 0;
        for (Map.Entry<String, Integer> entry : candidatos.entrySet()) {
            String candidato = entry.getKey();
            int votos = entry.getValue();
            System.out.printf("%s: %d votos%n", candidato, votos);
            if (votos > maiorNumeroVotos && !candidato.equals("Nulo")) {
                maiorNumeroVotos = votos;
                vencedor = candidato;
            }
        }
        if(candidatos.get("Nulo")>candidatos.get(vencedor)){
            System.out.println("Houve mais votos nulos do que votos para o vencedor, mas nulo não é um candidato que pode vencer.");
        }
        double porcentagemVencedor = (double) maiorNumeroVotos / 10 * 100;
        System.out.printf("O vencedor da eleição é %s com %.2f%% dos votos.", vencedor, porcentagemVencedor);
        scan.close();
    }
}
