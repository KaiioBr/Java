import java.util.Scanner;

public class Estudo01 {
    public static void main(String[] args) {
        // Scanner: objeto para ler o que o usuário digita no teclado
        Scanner sc = new Scanner(System.in);
        
        // --- CONFIGURAÇÕES E ESTRUTURA DE DADOS ---
        int CAPACIDADE = 5; // Limite fixo do nosso array
        String[] nomes = new String[CAPACIDADE]; // Array para textos
        int[] quantidades = new int[CAPACIDADE]; // Array para números inteiros
        
        // Esta variável é o coração do sistema. Ela diz quantos produtos
        // realmente cadastramos, ignorando os espaços vazios do array.
        int totalProdutos = 0; 
        
        String opcao = "";

        // O laço 'do-while' garante que o menu apareça ao menos 1 vez
        do {
            System.out.println("\n========= SISTEMA DE ESTOQUE =========");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Pesquisar Produto");
            System.out.println("4 - Alterar Produto");
            System.out.println("5 - Remover Produto");
            System.out.println("X - Sair");
            System.out.print("Escolha uma opção: ");
            
            // trim(): remove espaços extras / toUpperCase(): aceita 'x' ou 'X'
            opcao = sc.nextLine().trim().toUpperCase();

            switch (opcao) {
                case "1": // --- CADASTRAR ---
                    // Verifica se ainda há espaço no array antes de tentar salvar
                    if (totalProdutos < CAPACIDADE) {
                        System.out.print("Nome do produto: ");
                        nomes[totalProdutos] = sc.nextLine();
                        
                        System.out.print("Quantidade em estoque: ");
                        quantidades[totalProdutos] = sc.nextInt();
                        
                        // IMPORTANTE: sc.nextLine() limpa o buffer do teclado (o 'Enter')
                        // que o nextInt() deixa sobrando, evitando erros na próxima leitura.
                        sc.nextLine(); 
                        
                        totalProdutos++; // Sobe o contador para o próximo cadastro usar o novo índice
                        System.out.println("Produto cadastrado com sucesso!");
                    } else {
                        System.out.println("Erro: Capacidade máxima atingida!");
                    }
                    break;

                case "2": // --- LISTAR ---
                    System.out.println("\n--- LISTA DE PRODUTOS ---");
                    if (totalProdutos == 0) {
                        System.out.println("Estoque vazio.");
                    } else {
                        // O loop vai apenas até 'totalProdutos', não até o fim do array (5)
                        for (int i = 0; i < totalProdutos; i++) {
                            System.out.println("Índice: " + i + " | Nome: " + nomes[i] + " | Qtd: " + quantidades[i]);
                        }
                    }
                    break;

                case "3": // --- PESQUISAR ---
                    System.out.print("Digite o nome para buscar: ");
                    String busca = sc.nextLine();
                    int indiceEncontrado = -1; // -1 significa "não encontrado ainda"
                    
                    // Busca sequencial: olha um por um no array
                    for (int i = 0; i < totalProdutos; i++) {
                        // equalsIgnoreCase: ignora diferença entre letras maiúsculas/minúsculas
                        if (nomes[i].equalsIgnoreCase(busca)) {
                            indiceEncontrado = i; // Guarda onde o produto está
                            break; // Se achou, para de procurar (otimização)
                        }
                    }
                    
                    if (indiceEncontrado != -1) {
                        System.out.println("Produto encontrado! Nome: " + nomes[indiceEncontrado] + " | Qtd: " + quantidades[indiceEncontrado]);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case "4": // --- ALTERAR ---
                    System.out.print("Digite o nome do produto que deseja alterar: ");
                    String nomeAlterar = sc.nextLine();
                    int idxAlt = -1;
                    
                    // Primeiro, precisamos descobrir onde o produto está (mesma lógica da busca)
                    for (int i = 0; i < totalProdutos; i++) {
                        if (nomes[i].equalsIgnoreCase(nomeAlterar)) {
                            idxAlt = i;
                            break;
                        }
                    }
                    
                    if (idxAlt != -1) {
                        System.out.print("Novo nome: ");
                        nomes[idxAlt] = sc.nextLine(); // Sobrescreve o nome antigo
                        System.out.print("Nova quantidade: ");
                        quantidades[idxAlt] = sc.nextInt(); // Sobrescreve a quantidade antiga
                        sc.nextLine(); // Limpa buffer
                        System.out.println("Produto atualizado!");
                    } else {
                        System.out.println("Produto não localizado.");
                    }
                    break;

                case "5": // --- REMOVER COM DESLOCAMENTO ---
                    System.out.print("Digite o nome do produto para remover: ");
                    String nomeRemover = sc.nextLine();
                    int idxRem = -1;

                    // Encontra o índice do produto a ser removido
                    for (int i = 0; i < totalProdutos; i++) {
                        if (nomes[i].equalsIgnoreCase(nomeRemover)) {
                            idxRem = i;
                            break;
                        }
                    }

                    if (idxRem != -1) {
                        // Lógica de DESLOCAMENTO (Shift):
                        // Se apitarmos o item 2, o item 3 vira 2, o 4 vira 3...
                        // Isso garante que não fiquem "buracos" no meio do estoque.
                        for (int i = idxRem; i < totalProdutos - 1; i++) {
                            nomes[i] = nomes[i + 1];
                            quantidades[i] = quantidades[i + 1];
                        }
                        totalProdutos--; // Diminui o contador, pois agora temos um item a menos
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
        } while (!opcao.equals("X")); // Repete enquanto a opção for diferente de 'X'

        sc.close(); // Fecha o Scanner para liberar recursos do sistema
    }
}