import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes
        //intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra.
        // Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double numero = sc.nextDouble();

        if(numero < 0.0 || numero > 100) {
            System.out.println("Numero fora de intervalo");
        } else if (numero <= 25.0) {
            System.out.println("Está entre os numeros: 0 e 25");
        } else if (numero <= 50.0) {
            System.out.println("Está entre os numeros: 25 e 50");
        } else if (numero <= 75.0) {
            System.out.println("Está entre os numeros: 50 e 75");
        } else {
            System.out.println("Está entre os numeros 75 e 100");
        }

        sc.close();
    }
}
