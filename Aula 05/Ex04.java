import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=2;i<=100;i++){
            System.out.println("Os numeros sao:  "+i);
            int numero = sc.nextInt();
            System.out.println("Os numeros sao:  "+numero);
            
        }
        sc.close();
    }  
}
