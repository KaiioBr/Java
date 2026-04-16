import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaAutomotivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 4. Uso de ArrayList
        ArrayList<Veiculo> frota = new ArrayList<>();
        boolean continuar = true;

        System.out.println("--- Sistema de Cadastro de Veículos ---");

        // 3. Entrada de dados
        while (continuar) {
            try {
                System.out.print("\nDigite o modelo do veículo: ");
                String modelo = scanner.nextLine();

                // 5. Tratamento de exceção: modelo vazio
                if (modelo.trim().isEmpty()) {
                    throw new IllegalArgumentException("O modelo não pode ser vazio.");
                }

                System.out.print("Digite o ano do veículo: ");
                int ano = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer do teclado

                // 5. Tratamento de exceção: ano menor que 2000
                if (ano < 2000) {
                    throw new IllegalArgumentException("O ano não pode ser menor que 2000.");
                }

                System.out.print("Qual o tipo do veículo? (1 para Carro, 2 para Moto): ");
                int tipo = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer do teclado

                // Cadastra o veículo com base no tipo
                if (tipo == 1) {
                    frota.add(new Carro(modelo, ano));
                    System.out.println("Carro cadastrado com sucesso!");
                } else if (tipo == 2) {
                    frota.add(new Moto(modelo, ano));
                    System.out.println("Moto cadastrada com sucesso!");
                } else {
                    System.out.println("Tipo inválido. Veículo não cadastrado.");
                }

            // 5. Tratamento de exceção: erro de digitação no ano (ex: letras)
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. O ano deve ser um número inteiro.");
                scanner.nextLine(); // Limpa a entrada errada do buffer
            } catch (IllegalArgumentException e) {
                System.out.println("Erro de Validação: " + e.getMessage());
            }

            // Pergunta se o usuário quer continuar cadastrando
            System.out.print("\nDeseja cadastrar outro veículo? (S/N): ");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }

        // 6. Saída
        System.out.println("\n=========================================");
        System.out.println("           VEÍCULOS CADASTRADOS          ");
        System.out.println("=========================================");
        
        if (frota.isEmpty()) {
            System.out.println("Nenhum veículo foi cadastrado.");
        } else {
            for (Veiculo v : frota) {
                v.exibir();
            }
        }
        
        scanner.close();
    }
}