public class Carro extends Veiculo {

    // Construtor utilizando a classe pai
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    // Sobrescrita do método (Polimorfismo)
    @Override
    public String exibirDetalhes() {
        return "--- Detalhes do Carro ---\n" + super.exibirDetalhes();
    }
}