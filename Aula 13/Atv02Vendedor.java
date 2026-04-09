public class Atv02Vendedor extends Atv02Fucionarios {
    private double comissao;

    public Atv02Vendedor(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comissao;
    }
}
