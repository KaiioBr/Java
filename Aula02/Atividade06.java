import java.util.Scanner;

public class Atividade06 {
        public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Imforme um numero: ");
        double x=sc.nextDouble();
        System.out.println("Imforme outro numero:");
        double y=sc.nextDouble();
        System.out.println("Imforme outro numero:");
        double z=sc.nextDouble();
        double media = (x+y+z) / 3;
        System.out.println(media);
        sc.close();
    }

}
