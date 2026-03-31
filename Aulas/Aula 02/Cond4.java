import java.util.Scanner;

public class Cond4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe nome: ");
        String nome = sc.next();
        System.out.println("Informe N1: ");
        double n1 = sc.nextDouble();

        System.out.println("Informe N2: ");
        double n2 = sc.nextDouble();

        double media =(n1+n2)/2;

        if (media >=7) {
            System.out.println("Ola "+nome+" sua media e "+ media+" Aluno "+" Aprovado");
        } else if (media >= 5) {
            System.out.println("Ola "+nome+" sua media e "+ media+" Aluno"+" Recuperaçao");
        } else {
            System.out.println("Ola "+nome+" sua media e "+ media+" Aluno"+" Reprovado");
        }
        sc.close();
        

    }
}
