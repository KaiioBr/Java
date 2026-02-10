import java.util.Scanner;

public class atv02 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int x = 0; 

        while (x >= 0) {
            System.out.println("Digite algum numero (negativo para parar): ");   
            x = sc.nextInt();
            
            if(x >= 0) {
                System.out.println("Você digitou: " + x);
            }
       }
       
       System.out.println("Programa encerrado porque você digitou um número negativo.");
       sc.close();
    }
}