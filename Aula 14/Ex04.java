import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();
            
            if (nome.isEmpty()) {
                throw new IllegalArgumentException("O nome nao pode ser vazio.");
            }
            System.out.println("O nome digitado foi: " + nome);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Operacao finalizada.");
        }

    }
}
