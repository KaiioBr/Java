import java.util.Scanner;

public class EntradadeDados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("IMFORME O NOME");
        String nome = sc.next();
        System.out.println("IMFORME SUA IDADE");
        int idade=sc.nextInt();

        System.out.println("Ola "+nome+" Sua idade e "+idade+" anos");
        sc.close();
    }
}
