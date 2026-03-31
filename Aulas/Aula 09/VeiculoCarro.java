public class VeiculoCarro extends Veiculo {
    private int qtdPortas;

    public VeiculoCarro(String marca, int ano, int qtdPortas) {
        super(marca, ano);
        this.qtdPortas = qtdPortas;
    }
    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("A quantidade de portas é " + getQtdPortas());
    }
}
