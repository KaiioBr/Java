public class VeiculoApp {
    public static void main(String[] args) {
        Veiculo v = new Veiculo(null, 0);
        VeiculoMoto m = new VeiculoMoto(null, 0, 0);
        VeiculoCarro c = new VeiculoCarro(null, 0, 0);
        
        v.exibirInformacoes();
        m.exibirInformacoes();
        c.exibirInformacoes();
    }
}
