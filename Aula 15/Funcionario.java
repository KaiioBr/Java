public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    // Construtor
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // Método abstrato
    public abstract double calcularSalarioFinal();

    // Método para exibir os dados
    public void exibir() {
        System.out.printf("Nome: %-15s | Salário Base: R$ %,.2f | Salário Final: R$ %,.2f\n", 
                          nome, salarioBase, calcularSalarioFinal());
    }
}