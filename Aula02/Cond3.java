import java.util.Scanner;

public class Cond3 {
    public static void main(String[] args) {
        double nota = 4.9;
        Scanner sc = new Scanner(System.in);
        // condional encadeada
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if(nota == 5){
            System.out.println("Recuperaçao");
        } else{
            System.out.println("Reprovado");
        }
        sc.close();

    }
    
}