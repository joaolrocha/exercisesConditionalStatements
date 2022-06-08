import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

        Scanner sc = new Scanner(System.in);

        int N;


        N = sc.nextInt();




        if (N % 2 == 0) {
            System.out.println(" é número par");
        } else {
            System.out.println(" é número impar");
        }




    }
}

