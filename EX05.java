import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero1 = sc.nextInt();
        if(numero1 % 2 == 0){
            System.out.print("número par");
        }
        else{
            System.out.print("número impar");
        }

        }
    }
    

