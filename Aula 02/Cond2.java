import java.util.Scanner;

public class Cond2 {
    public static void main(String[] args) {
        int nota = 7;
        Scanner sc = new Scanner(System.in);
        // Condicional encadeada
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
