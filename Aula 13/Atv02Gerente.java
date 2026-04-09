public class Atv02Gerente extends Atv02Fucionarios{
    private final double BONUS_FIXO = 1000.0;

    public Atv02Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + BONUS_FIXO;
    }
}
