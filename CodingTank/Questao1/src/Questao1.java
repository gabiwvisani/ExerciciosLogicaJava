import java.util.Scanner;
public class Questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual é o valor do empréstimo?");
        double totalSaldoDevedor = scan.nextDouble();
        System.out.println("Qual é a taxa de juros do empréstimo ao mês?");
        double jurosAoMes = scan.nextDouble() /100.0;
        System.out.println("Qual é o tempo para pagamento em meses?");
        double totalDeMeses = scan.nextDouble();
        double amortizacao = totalSaldoDevedor / totalDeMeses;
        System.out.printf("Valor fixo da amortização R$ %.02f , Saldo devedor total R$ %.02f com um juros de %.02f %% ao mês. \n", amortizacao, totalSaldoDevedor, (jurosAoMes *100));
        double saldoDevedorAtual=totalSaldoDevedor;
        double jurosMensal;
        double parcelaMensal;
        double totalParcela = 0;
        double totalJutos = 0;;
        for(int i =1;i<=totalDeMeses;i++){
             jurosMensal = saldoDevedorAtual * jurosAoMes;
             parcelaMensal = jurosMensal + amortizacao;
             totalParcela = totalParcela+parcelaMensal;
            saldoDevedorAtual =saldoDevedorAtual - amortizacao;
             totalJutos =totalJutos+jurosMensal;
            System.out.printf("Parcela %d | Juros: R$ %.02f | Prestação:R$ %.02f | Saldo devedor: R$ %.02f. \n",i,jurosMensal,parcelaMensal, saldoDevedorAtual);
        }
        System.out.printf("Total: Prestação R$ %.02f, Juros R$ %.02f , Amortização R$ %.02f.\n ",totalParcela,totalJutos, totalSaldoDevedor);
    }
}
