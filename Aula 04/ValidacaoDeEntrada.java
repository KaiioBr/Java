import java.util.Scanner;

public class ValidacaoDeEntrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Digite um numero positivo (Maior que 0) ");
            numero = sc.nextInt();

            if (numero <= 0) {
                System.out.println("Entrada Invalida. Tente novamente. ");
                
            }
        } while (numero <= 0); //Continua pedindo enquanto o numero fo invalido

        System.out.println("Otimo! Voce digitou o numero positivo: "+ numero);
        sc.close();
    }
}
