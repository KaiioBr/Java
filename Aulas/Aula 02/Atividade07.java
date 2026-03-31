import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== TABELA DE PREÇOS POR COR ===");
        System.out.println("Cores disponíveis: Vermelho, Azul, Verde, Roxo");
        System.out.println("--------------------------------");
        
        System.out.print("Digite a cor do CD para consultar o preço: ");
        String cor = sc.nextLine();

        switch (cor) {
            case "vermelho":
                System.out.println("Preço: R$ 10,00");
                break;
                
            case "azul":
                System.out.println("Preço: R$ 100,00");
                break;
                
            case "verde":
                System.out.println("Preço: R$ 107,00");
                break;
                
            case "roxo":
                System.out.println("Preço: R$ 1000,00");
                break;
                
            default:
   
                System.out.println("Erro: Esta cor não está cadastrada no sistema.");
                break;
        }

        sc.close();
    }
}
