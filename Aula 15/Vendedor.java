public class Vendedor extends Funcionario implements Bonificacao {

    public Vendedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return 500.00;
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + calcularBonus();
    }
}