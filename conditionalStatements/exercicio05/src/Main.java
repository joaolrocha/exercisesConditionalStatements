import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
        //A seguir, calcule e mostre o valor da conta a pagar.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int qtd = sc.nextInt();
        double preco;
        String produto;


        if (x == 1){
            produto = "Cachorro Quente ";
            preco = 4.0;
        } else if (x == 2) {
            produto = "X-Salada ";
            preco = 4.5;
        } else if (x == 3) {
            produto = "X-Bacon ";
            preco = 5.0;
        } else if (x == 4) {
            produto = "Torrada Simples ";
            preco = 2.0;
        } else if (x == 5) {
            produto = "Refrigerante ";
            preco = 1.5;
        } else {
            produto = ("Produto Não Cadastrado");
            preco = 0;
        }

        System.out.println("Produto selecionado: " + produto + "Valor total: R$ " + qtd * preco);

        sc.close();
    }
}
