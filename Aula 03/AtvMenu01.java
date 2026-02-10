import java.util.Scanner;

public class AtvMenu01 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
        int op = 0;

        while (op != 4) {
            System.out.println("\n====== Menu ======");
            System.out.println("1- Caixa de papelão ");
            System.out.println("2- Sacola plástica ");
            System.out.println("3- Embalagem de vidro");
            System.out.println("4- Sair");
            System.out.print("Informe a opcao: ");
            
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Caixa de papelão: Ideal para transporte e armazenamento ");
                    break;
                case 2:
                    System.out.println("Sacola plástica: Leve e prática, mas pouco sustentável ");
                    break;
                case 3:
                    System.out.println("Embalagem de vidro: Resistente e reutilizável ");
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
