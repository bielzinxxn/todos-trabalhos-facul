import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        double radianos, graus;
        System.out.println("Digite um ângulo em graus: ");
        graus = sc.nextDouble();
        radianos = graus * Math.PI / 180;
        System.out.printf("%.2f\u00b0 = %.3f rad\n", graus, radianos);

        sc.close();
    }
    
}
