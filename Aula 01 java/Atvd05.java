import java.util.Scanner;

public class Atvd05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Imforme sua altura: ");
        double altura=sc.nextDouble();
        System.out.println("Imforme o seu peso: ");
        double peso=sc.nextDouble();
        double IMC = peso / (altura*2);
        System.out.println("O IMC e de: "+IMC);
        sc.close();
    } 
}
