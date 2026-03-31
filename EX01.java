//ler um número, dizer se ele é positivo (>0) ou não
import java.util.Scanner;
public class EX01{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;
        System.out.print("Digite um número: ");
        numero = sc.nextDouble();
        //Estrutura de Decisão
        if (numero > 0) {
            System.out.println(numero + " é positivo");
        }
        else {
            System.out.println(numero + " não é positivo");
        }
        
        sc.close();


}

}