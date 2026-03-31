import java.util.Scanner;

public class ArrayEntradaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Definindo o tamanho do Array
        System.out.println("Quantos nomes deseja inserir? ");
        int tamanho = sc.nextInt();
        sc.nextLine(); //Consumir a quebra de linha

        // Criando o Array com o tamanho informado pelo usuario
        String[] nomes = new String[tamanho];

        // Preenchendo o Array com os nomes Digitados
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }

        // Exibindo os nomes armazenado no array
        System.out.println("\nNomes Digitados ");
        for (int i = 0; i < nomes.length; i++) {
        System.out.println("Nome da posicao " + i + ": " +   nomes[i]);
        }
        sc.close();
    }
}
