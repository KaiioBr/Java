import java.util.ArrayList;
import java.util.Scanner;

public class MenuNomes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        int opcao = 0;

        do {
           
            System.out.println("\n=== MENU INTERATIVO ===");
            System.out.println("1 - Adicionar nome");
            System.out.println("2 - Listar nomes");
            System.out.println("3 - Alterar nome");
            System.out.println("4 - Remover nome");
            System.out.println("5 - Pesquisar nome");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
           
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    nomes.add(sc.nextLine());
                    System.out.println("Nome adicionado!");
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE NOMES ---");
                    if (nomes.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        for (int i = 0; i < nomes.size(); i++) {
                            System.out.println(i + " - " + nomes.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o número (índice) do nome para alterar: ");
                    int indAlt = Integer.parseInt(sc.nextLine());
                    System.out.print("Digite o novo nome: ");
                    nomes.set(indAlt, sc.nextLine());
                    System.out.println("Nome alterado!");
                    break;

                case 4:
                    System.out.print("Digite o número (índice) do nome para remover: ");
                    int indRem = Integer.parseInt(sc.nextLine());
                    nomes.remove(indRem);
                    System.out.println("Nome removido!");
                    break;

                case 5:
                    System.out.print("Digite o nome exato para pesquisar: ");
                    String pesquisa = sc.nextLine();
                    int posicao = nomes.indexOf(pesquisa);
                   
                    if (posicao != -1) { 
                        System.out.println("Nome encontrado na posição: " + posicao);
                    } else {
                        System.out.println("Nome não encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("Saindo do programa... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 6); 

        sc.close();
    }
}