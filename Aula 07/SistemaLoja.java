import java.util.Scanner;

public class SistemaLoja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Configurações do Sistema
        int CAPACIDADE = 5;
        String[] nomes = new String[CAPACIDADE];
        int[] quantidades = new int[CAPACIDADE];
        int totalProdutos = 0; // Controla quantos produtos existem de fato
        
        String opcao = "";

        do {
            System.out.println("\n========= SISTEMA DE ESTOQUE =========");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Pesquisar Produto");
            System.out.println("4 - Alterar Produto");
            System.out.println("5 - Remover Produto");
            System.out.println("X - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc.nextLine().trim().toUpperCase();

            switch (opcao) {
                case "1": // CADASTRAR
                    if (totalProdutos < CAPACIDADE) {
                        System.out.print("Nome do produto: ");
                        nomes[totalProdutos] = sc.nextLine();
                        System.out.print("Quantidade em estoque: ");
                        quantidades[totalProdutos] = sc.nextInt();
                        sc.nextLine(); // Limpar buffer
                        totalProdutos++;
                        System.out.println("Produto cadastrado com sucesso!");
                    } else {
                        System.out.println("Erro: Capacidade máxima atingida!");
                    }
                    break;

                case "2": // LISTAR
                    System.out.println("\n--- LISTA DE PRODUTOS ---");
                    if (totalProdutos == 0) {
                        System.out.println("Estoque vazio.");
                    } else {
                        for (int i = 0; i < totalProdutos; i++) {
                            System.out.println("Índice: " + i + " | Nome: " + nomes[i] + " | Qtd: " + quantidades[i]);
                        }
                    }
                    break;

                case "3": // PESQUISAR
                    System.out.print("Digite o nome para buscar: ");
                    String busca = sc.nextLine();
                    int indiceEncontrado = -1;
                    
                    for (int i = 0; i < totalProdutos; i++) {
                        if (nomes[i].equalsIgnoreCase(busca)) {
                            indiceEncontrado = i;
                            break;
                        }
                    }
                    
                    if (indiceEncontrado != -1) {
                        System.out.println("Produto encontrado! Nome: " + nomes[indiceEncontrado] + " | Qtd: " + quantidades[indiceEncontrado]);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case "4": // ALTERAR
                    System.out.print("Digite o nome do produto que deseja alterar: ");
                    String nomeAlterar = sc.nextLine();
                    int idxAlt = -1;
                    
                    for (int i = 0; i < totalProdutos; i++) {
                        if (nomes[i].equalsIgnoreCase(nomeAlterar)) {
                            idxAlt = i;
                            break;
                        }
                    }
                    
                    if (idxAlt != -1) {
                        System.out.print("Novo nome: ");
                        nomes[idxAlt] = sc.nextLine();
                        System.out.print("Nova quantidade: ");
                        quantidades[idxAlt] = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Produto atualizado!");
                    } else {
                        System.out.println("Produto não localizado.");
                    }
                    break;

                case "5": // REMOVER COM DESLOCAMENTO
                    System.out.print("Digite o nome do produto para remover: ");
                    String nomeRemover = sc.nextLine();
                    int idxRem = -1;

                    for (int i = 0; i < totalProdutos; i++) {
                        if (nomes[i].equalsIgnoreCase(nomeRemover)) {
                            idxRem = i;
                            break;
                        }
                    }

                    if (idxRem != -1) {
                        // Lógica de deslocamento (shift)
                        for (int i = idxRem; i < totalProdutos - 1; i++) {
                            nomes[i] = nomes[i + 1];
                            quantidades[i] = quantidades[i + 1];
                        }
                        totalProdutos--; // Diminui o contador real
                        System.out.println("Produto removido e estoque organizado.");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case "X":
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (!opcao.equals("X"));

        sc.close();
    }
}