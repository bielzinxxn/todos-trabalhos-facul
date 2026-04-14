//Construir um laço SENTINELA que executa até que o usuário digite "pare"
import java.util.Scanner;

public class EX01_13_04 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String ordem;
    // do {
    //     System.out.print("Digite PARE se quiser parar: ");
    //     ordem = sc.nextLine();
        
    // } while (!(ordem.toUpperCase().equals("PARE"))); 
    System.out.print("Digite PARE se quiser parar: ");
    ordem = sc.nextLine();
    while (!(ordem.toUpperCase().equals("PARE"))) {
        System.out.print("Digite PARE se quiser parar: ");
        ordem = sc.nextLine();
    }

    }
}