import java.util.Scanner;

public class EX03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double numero1, numero2;
        System.out.println("Digite seu primeiro número: ");
        numero1 = sc.nextDouble();
        System.out.println("Digite seu segundo número: ");
        numero2 = sc.nextDouble();

        if (numero1 == numero2){
            System.out.println("Número igual"); 
        }
        else{
        System.out.println("Número diferente");
        
            
        }
    }
}

