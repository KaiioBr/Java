public abstract class Veiculo {
    protected String modelo;
    protected int ano;

    // Construtor para inicializar os atributos
    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método abstrato
    public abstract double calcularValor();

    // Método para exibir os dados
    public void exibir() {
        System.out.printf("Modelo: %-15s | Ano: %d | Valor: R$ %,.2f\n", modelo, ano, calcularValor());
    }
}