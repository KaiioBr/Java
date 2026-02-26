import java.util.Scanner;

public class Vetd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[3];
        int[] notas = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Informe o nome " + (i + 1) + ":");
            nomes[i] = sc.nextLine();
            
            System.out.println("Informe a nota de " + nomes[i] + ":");
            notas[i] = sc.nextInt();
            
            // --- A CORREÇÃO ESTÁ AQUI ---
            sc.nextLine(); // Limpa o buffer para o proximo nextLine() nao vir vazio
        }
        
        
        System.out.println("\n--- Lista de Alunos ---");
        for (int i = 0; i < 3; i++) {
            System.out.println("O nome: " + nomes[i] + " - Nota: " + notas[i]);
        }
        sc.close();
    }
}