import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        double nota3 = sc.nextDouble();

        double notaFinal = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Média = %.2f%n", notaFinal);

        if (notaFinal >= 7.0){
            System.out.println("Você foi aprovado.");
        }
        else if (notaFinal >= 3.0){
            System.out.println("Você terá que realizar um exame.");
        }
        else {
            System.out.println("Você está reprovado.");
        }

        sc.close();
    }
}

