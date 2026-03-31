import java.util.Scanner;

public class EX04 {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    double numero1 = sc.nextDouble();
    System.out.println("Digite o segundo número: ");
    double numero2 = sc.nextDouble();
    
    if (numero1 > numero2) {
        System.out.println("O número " + numero1 + " é maior  que." + numero2);
    }
    else if (numero1 == numero2) {
        System.out.println("O número " + numero1 + " e o número " + numero2 + " são iguais.");
    }
    else {
        System.out.println("O número " + numero1 + " é menor que " + numero2);
    }
        
    }
        
}
