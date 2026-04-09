import java.util.Scanner;

public class Atv02FucionarioApp {
    public static void exibirDados(String nome) {
        System.out.println("Nome: " + nome);
    }

    public static void exibirDados(String nome, double salario) {
        System.out.printf("Nome: %s | Salário Final: R$ %.2f\n", nome, salario);
    }

    public static void exibirDados(String nome, double salario, String cargo) {
        System.out.printf("Cargo: %s | Nome: %s | Salário Final: R$ %.2f\n", cargo, nome, salario);
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- CADASTRO DE FUNCIONÁRIOS ---\n");

        // Entrada de dados do Gerente
        System.out.println("[ GERENTE ]");
        System.out.print("Digite o nome do Gerente: ");
        String nomeGerente = sc.nextLine();
        System.out.print("Digite o salário base do Gerente: R$ ");
        double salarioGerente = sc.nextDouble();
        sc.nextLine(); // Limpar o buffer do teclado

        Atv02Gerente gerente = new Atv02Gerente(nomeGerente, salarioGerente);

        // Entrada de dados do Vendedor
        System.out.println("\n[ VENDEDOR ]");
        System.out.print("Digite o nome do Vendedor: ");
        String nomeVendedor = sc.nextLine();
        System.out.print("Digite o salário base do Vendedor: R$ ");
        double salarioVendedor = sc.nextDouble();
        System.out.print("Digite a comissão do Vendedor: R$ ");
        double comissaoVendedor = sc.nextDouble();

        Atv02Vendedor vendedor = new Atv02Vendedor(nomeVendedor, salarioVendedor, comissaoVendedor);

        // Saída de dados testando a sobrecarga
        System.out.println("\n--- EXIBINDO DADOS (Testando Sobrecarga) ---");

        System.out.println("\n1. Testando exibirDados:");
        exibirDados(gerente.getNome());

        System.out.println("\n2. Testando exibirDados:");
        exibirDados(vendedor.getNome(), vendedor.calcularSalario());

        System.out.println("\n3. Testando exibirDados:");
        exibirDados(gerente.getNome(), gerente.calcularSalario(), "Gerente");
        exibirDados(vendedor.getNome(), vendedor.calcularSalario(), "Vendedor");

        sc.close();
    }
}
