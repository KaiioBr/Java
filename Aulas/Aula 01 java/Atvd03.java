import java.util.Scanner;

public class Atvd03 {
  
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros vc deseja inserir ? ");
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
