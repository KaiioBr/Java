import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GerenciadorDeArquivo {

    private static final String NOME_ARQUIVO = "arquivo.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("\n=========================");
            System.out.println("          MENU           ");
            System.out.println("=========================");
            System.out.println("1 - Criar arquivo");
            System.out.println("2 - Escrever no arquivo");
            System.out.println("3 - Ler arquivo");
            System.out.println("4 - Alterar arquivo");
            System.out.println("5 - Remover arquivo");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");

            // Verifica se a entrada é um número inteiro
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha após o número

                switch (opcao) {
                    case 1:
                        criarArquivo();
                        break;
                    case 2:
                        escreverNoArquivo(scanner, false); // false para sobrescrever
                        break;
                    case 3:
                        lerArquivo();
                        break;
                    case 4:
                        escreverNoArquivo(scanner, true); // true para adicionar ao final (append)
                        break;
                    case 5:
                        removerArquivo();
                        break;
                    case 6:
                        System.out.println("Saindo do programa...");
                        break;
                    default:
                        System.out.println("Opção inválida! Escolha um número entre 1 e 6.");
                }
            } else {
                System.out.println("Entrada inválida! Por favor, digite um número.");
                scanner.next(); // Limpar a entrada incorreta do buffer
            }
        }
        
        scanner.close();
    }

    // 1 - Criar arquivo
    private static void criarArquivo() {
        try {
            File arquivo = new File(NOME_ARQUIVO);
            if (arquivo.createNewFile()) {
                System.out.println("Sucesso: Arquivo '" + NOME_ARQUIVO + "' criado!");
            } else {
                System.out.println("Aviso: O arquivo '" + NOME_ARQUIVO + "' já existe.");
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
        }
    }

    // 2 e 4 - Escrever / Alterar arquivo
    private static void escreverNoArquivo(Scanner scanner, boolean adicionar) {
        System.out.print("Digite o texto que deseja inserir: ");
        String texto = scanner.nextLine();

        // O parâmetro 'adicionar' (append) define se o texto sobrescreve ou é adicionado ao final
        try (FileWriter writer = new FileWriter(NOME_ARQUIVO, adicionar)) {
            writer.write(texto + "\n");
            if (adicionar) {
                System.out.println("Sucesso: Texto adicionado (alterado) no arquivo!");
            } else {
                System.out.println("Sucesso: Texto escrito no arquivo (sobrescrito)!");
            }
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    // 3 - Ler arquivo
    private static void lerArquivo() {
        File arquivo = new File(NOME_ARQUIVO);
        
        if (!arquivo.exists()) {
            System.out.println("Erro: O arquivo '" + NOME_ARQUIVO + "' não existe. Crie-o primeiro.");
            return;
        }

        System.out.println("\n--- Conteúdo do Arquivo ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            boolean vazio = true;
            
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
                vazio = false;
            }
            
            if (vazio) {
                System.out.println("(O arquivo está vazio)");
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        System.out.println("---------------------------");
    }

    // 5 - Remover arquivo
    private static void removerArquivo() {
        File arquivo = new File(NOME_ARQUIVO);
        
        if (arquivo.exists()) {
            if (arquivo.delete()) {
                System.out.println("Sucesso: Arquivo '" + NOME_ARQUIVO + "' removido!");
            } else {
                System.out.println("Erro: Não foi possível remover o arquivo.");
            }
        } else {
            System.out.println("Aviso: O arquivo '" + NOME_ARQUIVO + "' não existe.");
        }
    }
}