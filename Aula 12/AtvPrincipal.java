
import java.util.ArrayList;
import java.util.Scanner;

public class AtvPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<AtvAnimal> animais = new ArrayList<>();
        int opcao;

        do { 
            System.out.println("MEnu");
            System.out.println("1 - Adicionar novo animal");
            System.out.println("2 - Fazer um animal emitir som");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma Opcao: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o tipo do animal (Cachorro ou Gato): ");               
                    String tipo = sc.next();
                    System.out.println("Digite o nome do animal: ");
                    String nome = sc.next();

                    if (tipo.equalsIgnoreCase("Cachorro")) {
                        animais.add(new AtvCachorro(nome));
                        System.out.println("Cachorro adicionado com sucesso!");
                    } else if (tipo.equalsIgnoreCase("Gato")) {
                        animais.add(new AtvGato(nome));
                        System.out.println("Gato adicionado com sucesso!");
                    } else {
                        System.out.println("Tipo de animal inválido. Tente novamente.");
                    }
                    
                    break;
                case 2:
                    if (animais.isEmpty()) {
                        System.out.println("Nenhum animal cadastrado. Adicione um animal primeiro.");
                    } else {
                        System.out.println("Animais cadastrados:");
                        for (int i = 0; i < animais.size(); i++) {
                            System.out.println((i + 1) + " - " + animais.get(i).getNome());
                        }
                        System.out.println("Escolha o número do animal para emitir som: ");
                        int escolhaAnimal = sc.nextInt();
                        sc.nextLine(); // Limpar o buffer do scanner
                        if (escolhaAnimal > 0 && escolhaAnimal <= animais.size()) {
                            animais.get(escolhaAnimal - 1).fazersom();
                        } else {
                            System.out.println("Número inválido. Tente novamente.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o programa. Até mais!");
                    
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
        sc.close();
    }
}
