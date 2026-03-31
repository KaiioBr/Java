import java.util.Scanner;

public class Atv06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Calcular Tabuada");
            System.out.println("2 - Realizar Contagem Regressiva");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("\n--- Calcular Tabuada ---");
                    System.out.print("Informe um número: ");
                    int numeroTabuada = sc.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numeroTabuada + " x " + i + " = " + (numeroTabuada * i));
                    }
                    break;

                case 2:
                    System.out.println("\n--- Contagem Regressiva ---");
                    System.out.print("Informe de qual número começar a contagem: ");
                    int inicio = sc.nextInt();
                    for (int i = inicio; i >= 0; i--) {
                        System.out.println(i + "...");
                    }
                    System.out.println("LET IT RIP! 🚀");
                    break;

                case 0:
                    System.out.println("\nSaindo do programa... Até logo!");
                    break;

                default:

                    System.out.println("\nOpção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 0); 

        sc.close();
    }
}

