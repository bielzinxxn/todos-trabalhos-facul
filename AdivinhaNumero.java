import java.util.Random;
import java.util.Scanner;
public class AdivinhaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int sorteado = random.nextInt(10) + 1;
        int chute;
        int contador = 0;
        do {
            System.out.print("Adivinhe um número de 1 a 10: ");
            chute = sc.nextInt();
            if (chute > sorteado && contador < 2){
                System.out.println("Chute um número menor!");
            }
            else if (chute < sorteado && contador < 2) {
                System.out.println("Chute um número maior!");
            }
            contador++;
        } while (chute!= sorteado && contador < 3);
        if (chute == sorteado){
            System.out.print("Você acertou!!!");
        }
        else {
            System.out.print("Não foi desta vez...");
        }

    }
    
}
