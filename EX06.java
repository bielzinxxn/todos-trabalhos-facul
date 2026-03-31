import java.util.Scanner;

public class EX06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        double valor = sc.nextDouble();
        System.out.print("Digite:\n1 - A Vista\n2 - A Prazo\n--> ");
        int opcao = sc.nextInt();
        if ( opcao == 2);{
            valor = valor + 10.0 / 100 * valor;
    }
    System.out.println("Valor a pagar = R$ " + valor);




        
        
        
    }
}
