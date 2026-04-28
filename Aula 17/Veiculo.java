public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    // Construtor
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    // Método exibirDetalhes
    public String exibirDetalhes() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano;
    }
}