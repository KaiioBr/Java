import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldu = 1000.00; // Saldo inicial de exemplo

        try {
            System.out.println("Saldo disponível: R$ " + saldu);
            System.out.print("Digite o valor do saque: ");
            double valorDoSaque = sc.nextDouble();

            if (valorDoSaque <= 0) {
                throw new IllegalArgumentException("O valor deve ser maior que zero.");
            }

            if (valorDoSaque > saldu) {
                throw new ArithmeticException("Saldo insuficiente para esta operação.");
            }

            saldu -= valorDoSaque;
            System.out.println("Saque realizado! Novo saldo: R$ " + saldu);

        } catch (InputMismatchException e) {
            System.err.println("Erro: Digite apenas números (use vírgula para decimais).");
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.err.println("Erro na operação: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        } finally {
            System.out.println("Operação encerrada.");
            sc.close();
        }
    }
}
