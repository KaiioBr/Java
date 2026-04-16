public class Gerente extends Funcionario implements Bonificacao {

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return 1000.00;
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + calcularBonus();
    }
}