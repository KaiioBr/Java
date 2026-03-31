import java.util.Scanner;

public class Atvd02 {
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Imformew um numero:");
        double x=sc.nextDouble();
        System.out.println("Imformew outro numero:");
        double y=sc.nextDouble();
        double media = (x+y) / 2;
        System.out.println(media);
        sc.close();
    }

}
