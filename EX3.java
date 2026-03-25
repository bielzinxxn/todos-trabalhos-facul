import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int n, sucTriplo, antDobro;
         System.out.println("Digite um numero inteiro: ");
         n = sc.nextInt();
         sucTriplo = 3 * n + 1;
         antDobro = 2 * n - 1;
         System.out.println ("Resultado = " + (sucTriplo + antDobro));
         sc.close();

      
        
         
        
    }
}
