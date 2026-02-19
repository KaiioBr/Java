import java.util.Scanner;

public class Atv05 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero para a tabuada: ");
        int numero = sc.nextInt();
        System.out.println("Aqui esta a tabuada de: "+numero);
        for (int i=1;i<=10;i++){
            System.out.println(numero+"x"+i+ " = "+(numero*i));
        }
            sc.close();
    }
}
