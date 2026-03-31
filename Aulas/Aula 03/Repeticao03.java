import java.util.Scanner;

public class Repeticao03 {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x=1;

        while (x!=10) {
            System.out.println("Digite o numero 10 para encerrar! ");   
            x=sc.nextInt();  
        }
    System.out.println("Programa encerrado: ");
    sc.close();
    }

}
