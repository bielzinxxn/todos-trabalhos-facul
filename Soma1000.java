//Ler inteiros até que soma deles atinja 1000
//a) usando while
//b) usando do-while
import java.util.Scanner;
public class Soma1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, soma = 0;
        // System.out.print("Digite seus números até bater 1000: ");
        // numero = sc.nextInt();
        // soma = numero;
        // while (soma <= 1000) {
        //     System.out.print("Digite seus números até bater 1000: ");
        //     numero = sc.nextInt();
        //     soma = soma + numero;
        // }
        // System.out.print("Você ultrapassou o limite, seu valor final é : " + soma);
        soma = 0;
        do {
            System.out.println("Digite seus números até bater 1000: ");
            numero = sc.nextInt();
            soma = soma + numero;
        } while (soma <= 1000);
            
        }

    
    
}

