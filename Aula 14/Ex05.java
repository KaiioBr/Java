import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int op = -1;

        while (op!=0) {
            try{
                System.out.println("\n====Menu====");
                System.out.println("1 - Adicionar item");
                System.out.println("2 - Listar itens");
                System.out.println("3 - Remover item");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opcao: ");
                op = sc.nextInt();
                sc.nextLine(); 

                switch (op) {
                    case 1:
                        System.out.print("Digite o item a ser adicionado: ");
                        String item = sc.nextLine();
                        lista.add(item);
                        System.out.println("Item adicionado com sucesso!");
                        break;
                    case 2:
                        System.out.println("Itens na lista:");
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println((i + 1) + ". " + lista.get(i));
                        }
                        break;
                    case 3:
                        System.out.print("Digite o numero do item a ser removido: ");
                        int index = sc.nextInt() - 1;
                        if (index >= 0 && index < lista.size()) {
                            String removedItem = lista.remove(index);
                            System.out.println("Item '" + removedItem + "' removido com sucesso!");
                        } else {
                            System.out.println("Error: Numero do item invalido.");
                        }
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Error: Opcao invalida. Por favor, escolha uma opcao valida.");
                }
            
            } catch (Exception e) {
                System.out.println("Error: Entrada invalida. Por favor, insira um numero valido.");
                sc.nextLine(); // Limpar o buffer
            }
        }
    }
}
