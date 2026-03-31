import java.util.Scanner;

public class Atvd01 {
  
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Imformew um numero:");
        double x=sc.nextDouble();
        System.out.println("Imformew outro numero:");
        double y=sc.nextDouble();
        double soma = (x+y);
        double subtracao = (x-y);
        double divisao = (x/y);
        double multiplicacao = (x*y);
        System.out.println("A soma de "+x+" e "+y+" = "+soma);
        System.out.println("A subtracao de "+x+" e "+y+" = "+subtracao);
        System.out.println("A divisao de "+x+" e "+y+" = "+divisao);
        System.out.println("A multiplicacao de "+x+" e "+y+" = "+multiplicacao);
        sc.close();
    }
    
}
