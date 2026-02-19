import java.util.Scanner;

public class Ex05 {
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        for (int i=1;i<=3;i++){
            System.out.println("Informe no nome: ");
            String nome = sc.nextLine();

            System.out.println("O nome do cadastrado é: "+nome);
        }
        sc.close();

    }
}
