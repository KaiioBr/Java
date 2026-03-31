import java.util.ArrayList;
import java.util.Scanner;

public class CadastroContatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        ArrayList<Contato> contatos = new ArrayList<>();

        do { 
            System.out.println("\nEscolha a opcao: ");
            System.out.println("1 - CADASTRAR CONTATO");
            System.out.println("2 - LISTAR CONTATOS");
            System.out.println("3 - EXCLUIR CONTATO");
            System.out.println("4 - ALTERAR CONTATO");
            System.out.println("5 - PESQUISAR CONTATO");
            System.out.println("6 - SAIR");
            System.out.print("Opcao: ");
            
            op = sc.nextInt();
            sc.nextLine(); // Limpar o buffer do teclado

            switch (op) {
                case 1:
                    System.out.print("Informe o nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Informe o telefone: ");
                    String numero = sc.nextLine();
                    contatos.add(new Contato(nome, numero));
                    System.out.println("Contato cadastrado com sucesso!");
                    break;

                case 2:
                    if (contatos.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.");
                    } else {
                        System.out.println("OS NUMEROS CADASTRADOS SAO: ");
                        for(int i = 0; i < contatos.size(); i++) {
                            // Imprime o índice (0, 1, 2...) e os dados do contato
                            System.out.println(i + " - " + contatos.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Informe o numero (indice) do contato a ser excluido: ");
                    int index = sc.nextInt();
                    sc.nextLine();

                    // Correção: removido o "index - 1", pois a lista mostrada no case 2 já começa em 0
                    if (index >= 0 && index < contatos.size()) {
                        contatos.remove(index);
                        System.out.println("Contato excluido com sucesso!");
                    } else {
                        System.out.println("Numero do contato invalido!");
                    }
                    break;

                case 4:
                    if (contatos.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado para alterar.");
                        break;
                    }

                    System.out.print("Informe o numero (indice) para alterar: ");
                    int pos = sc.nextInt();
                    sc.nextLine();

                    // Correção: removido o "pos - 1"
                    if (pos >= 0 && pos < contatos.size()) {
                        System.out.print("Informe o novo nome: ");
                        String newNome = sc.nextLine();
                        System.out.print("Informe o novo numero: ");
                        String newNumero = sc.nextLine();
                        
                        contatos.get(pos).setNome(newNome);
                        contatos.get(pos).setNumero(newNumero);
                        System.out.println("Contato alterado com sucesso!");
                    } else {
                        System.out.println("Numero do contato invalido!");
                    }
                    break;

                case 5:
                    System.out.print("Informe o nome para pesquisar: ");
                    String busca = sc.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < contatos.size(); i++) {
                        if (contatos.get(i).getNome().equalsIgnoreCase(busca)) {
                            System.out.println("Contato encontrado: " + contatos.get(i));
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Contato nao encontrado!");
                    }
                    break;

                case 6:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opcao invalida, tente novamente.");
                    break;
            }

        } while (op != 6);

        sc.close();
    }
}
