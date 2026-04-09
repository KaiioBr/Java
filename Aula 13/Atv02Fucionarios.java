abstract class Atv02Fucionarios {
    protected String nome;
    protected double salarioBase;

    public Atv02Fucionarios(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    

    // Método abstrato
    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }
}
