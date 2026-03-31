import java.util.Scanner;

public class Repeticao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int op = 0;

        // O laço continua enquanto a opção for diferente de 4
        while (op != 4) {
            System.out.println("\n====== Menu ======");
            System.out.println("1- Cadastrar ");
            System.out.println("2- Listar ");
            System.out.println("3- Remover");
            System.out.println("4- Sair");
            System.out.print("Informe a opcao: ");
            
            op = sc.nextInt();

            // O switch deve ficar AQUI DENTRO para verificar a opção a cada loop
            switch (op) {
                case 1:
                    System.out.println(">> Ação: Cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println(">> Ação: Listando itens...");
                    break;
                case 3:
                    System.out.println(">> Ação: Item removido.");
                    break;
                case 4:
                    System.out.println(">> Saindo do sistema...");
                    break;
                default:
                    System.out.println(">> Erro: Opcao invalida!");
                    break;
            }
        }
        
        sc.close();
    }
}