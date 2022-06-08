import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

        Scanner sc = new Scanner(System.in);

        int numInteiro;


        numInteiro = sc.nextInt();

        if (numInteiro >= 0) {
            System.out.println("Esse numero é positivo!!");
        } else
        {
            System.out.println("Esse numero é negativo!!");
        }


        sc.close();
    }
}
