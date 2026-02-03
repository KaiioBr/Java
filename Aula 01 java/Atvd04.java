import java.util.Scanner;

public class Atvd04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Imforme a forca aplicada (F):");
        double x=sc.nextDouble();
        System.out.println("Imforme a distancia pecorrida (D):");
        double y=sc.nextDouble();
        double T = (x*y);
        System.out.println("O trabalho (T) foi de: "+T);
        sc.close();
    }

    
}
