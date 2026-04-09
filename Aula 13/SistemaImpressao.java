import java.util.Scanner;

public class SistemaImpressao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- SISTEMA DE IMPRESSÃO ---");
        System.out.println("1 - Impressora a Jato de Tinta");
        System.out.println("2 - Impressora a Laser");
        System.out.print("Escolha o tipo de impressora (1 ou 2): ");
        
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado após ler o número

        // Verifica se a opção é válida antes de pedir o texto
        if (opcao != 1 && opcao != 2) {
            System.out.println("\n❌ Opção inválida! Encerrando o sistema.");
            scanner.close();
            return; 
        }

        System.out.print("Digite o texto a ser impresso: ");
        String texto = scanner.nextLine();

        // Variável do tipo da Interface
        Impressora impressora = null;

        // Instancia a classe correta dependendo da escolha
        if (opcao == 1) {
            impressora = new ImpressoraJatoTinta();
        } else if (opcao == 2) {
            impressora = new ImpressoraLaser();
        }

        // Executa a impressão
        impressora.imprimir(texto);

        scanner.close();
    }
}