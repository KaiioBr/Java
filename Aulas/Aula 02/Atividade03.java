import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
                int idade = sc.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("Criança! ");
        } else if (idade >= 13 && idade <= 17 ) {
            System.out.println("Adolecente!");
        } else if (idade >= 18 && idade <= 59 ) {
            System.out.println("Adulto!");
        } else if (idade < 0 ) {
            System.out.println("Idade invalida!");
        } else {
            System.out.println("Idosos!");
        }

        sc.close();
    }
    
    
}
