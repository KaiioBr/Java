import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um numero inteiro: ");
            int numero = sc.nextInt();
            System.out.println("Voce digitou: " + numero);
        } catch (Exception e) {
            System.out.println("Error: Entrada invalida. Por favor, digite um numero inteiro.");
        } finally {
            sc.close();
            System.out.println("Operacao finalizada.");
        }

    }
}