import java.util.Scanner;

public class Hipotenusa{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o cateto a: ");
        double a = sc.nextDouble();
        System.out.print("Digite o cateto b: ");
        double b = sc.nextDouble();
        sc.close();
      double aQuad = Math.pow(a, 2);
      double bQuad = Math.pow(b, 2);
      double Hipotenusa = Math.sqrt(aQuad + bQuad);
      System.out.printf("Hipotenusa = %.2f\n", Hipotenusa);

      // também podia resumir 
      Hipotenusa = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

    }
}
