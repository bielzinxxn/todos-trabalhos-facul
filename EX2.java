import java.util.Scanner;
public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        double km, milhas;
        System.out.println("Digite uma distância em quilometros: ");
        km = sc.nextDouble();
        milhas = km / 1.61;
        System.out.println("km = " + milhas + " milhas" ); 
        System.out.printf("%.2f Km correspondem a %.2f milhas\n", km, milhas);

        sc.close();

    }
    
}
