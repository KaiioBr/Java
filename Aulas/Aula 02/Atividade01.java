import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("Numero Positivo! ");
        } else if (numero < 0) {
            System.out.println("Numero Negativo!");
        } else {
            System.out.println("Numero Nulo!");
        }
        sc.close();
    }
    
}