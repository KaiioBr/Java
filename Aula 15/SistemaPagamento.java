import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaPagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 4. Polimorfismo: ArrayList da classe abstrata
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        int cadastrados = 0;

        System.out.println("--- Sistema de Pagamento de Funcionários ---");

        // 6. Cadastrar exatamente 2 funcionários
        while (cadastrados < 2) {
            try {
                System.out.println("\nCadastro do " + (cadastrados + 1) + "º funcionário:");
                
                System.out.print("Nome: ");
                String nome = scanner.nextLine();

                // 5. Tratamento de exceção: nome vazio
                if (nome.trim().isEmpty()) {
                    throw new IllegalArgumentException("O nome não pode ser vazio.");
                }

                System.out.print("Salário Base (R$): ");
                double salarioBase = scanner.nextDouble();
                scanner.nextLine(); // Limpa o buffer do teclado

                // 5. Tratamento de exceção: salário base menor ou igual a zero
                if (salarioBase <= 0) {
                    throw new IllegalArgumentException("O salário base deve ser maior que zero.");
                }

                System.out.print("Cargo (1 para Gerente, 2 para Vendedor): ");
                int cargo = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer do teclado

                // 6. Permitir escolher o cargo e cadastrar no ArrayList
                if (cargo == 1) {
                    funcionarios.add(new Gerente(nome, salarioBase));
                    System.out.println("Gerente cadastrado com sucesso!");
                    cadastrados++; // Incrementa apenas se o cadastro der certo
                } else if (cargo == 2) {
                    funcionarios.add(new Vendedor(nome, salarioBase));
                    System.out.println("Vendedor cadastrado com sucesso!");
                    cadastrados++; // Incrementa apenas se o cadastro der certo
                } else {
                    System.out.println("Cargo inválido. Tente novamente.");
                }

            // 5. Tratamento de exceção: entrada inválida (ex: letras no lugar do salário)
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Certifique-se de digitar números corretamente.");
                scanner.nextLine(); // Limpa a entrada incorreta do buffer
            } catch (IllegalArgumentException e) {
                System.out.println("Erro de Validação: " + e.getMessage());
            }
        }

        // 6. Exibir os dados e o salário final de cada um
        System.out.println("\n=======================================================");
        System.out.println("                RESUMO DE PAGAMENTOS                   ");
        System.out.println("=======================================================");
        
        for (Funcionario f : funcionarios) {
            f.exibir();
        }
        
        scanner.close();
    }
}