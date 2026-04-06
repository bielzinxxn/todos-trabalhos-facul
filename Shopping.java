//Ler o valor da compra e a opção de pagamento (1- vista/2 - prazo)
//Se for a vista ler forma de pagamento (1- pix/2 - débito)
//No pix, dar 10% de desconto, no débito, 5%
//Se for a prazo, ler número de parcelas (2/3)
//Para 2 parcelas, não tem acréscimo para 4, 10%
//Em todos os casos, exibir todos os valores

import java.util.Scanner;

public class Shopping {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double valorCompra;
      int opcaoPagamento;
      System.out.print("Digite o valor da compra: R$");
      valorCompra = sc.nextDouble();
      System.out.print("Digite:\n1 - a vista\n2 - a prazo\n --> ");
      opcaoPagamento = sc.nextInt();
      if (opcaoPagamento == 1) {
         System.out.print("Digite\n1 - pix\n2 - débito\n--> ");
         int formaPagamento = sc.nextInt();

         if (formaPagamento == 1) {
            double desconto = 10.0 / 100 * valorCompra;
            double valorFinal = valorCompra - desconto;
            System.out.printf("Desconto = R$ %.2f\n", desconto);
            System.out.printf("Valor a pagar = R$ %.2f\n", valorFinal);

         } else if (formaPagamento == 2) {
            double desconto = 5.00/100 * valorCompra;
            double valorFinal = valorCompra - desconto;

            System.out.printf("Desconto = R$ %2.f\n", desconto);
            System.out.printf("Valor a pagar = R$ %.2f\n", valorFinal);

         }
         else {
            System.out.println("Forma de pagamento inválida!");

         }
      } else if (opcaoPagamento == 2) {
         System.out.println("Escolha o número de parcelas: (2/3: ");
         int parcelas = sc.nextInt();
         if (parcelas == 2 ) {
            double valorParcela = valorCompra / 2;
            System.out.printf("Valor de cada parcela = R$ %.2f\n", valorParcela);
            
         }
         else if (parcelas == 3) {

         }
         else {

         }

      }
      else {
         System.out.println("Opção invalida!!!");

      }

   }
}