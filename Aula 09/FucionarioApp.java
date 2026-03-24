public class FucionarioApp {
    public static void main(String[] args) {
        Fucionario f1 = new Fucionario(null, 0, 0);
        FucionarioGerente f2 = new FucionarioGerente(null, 0, 0, 0);


        f1.exibirInformacoes();
        f2.exibirInformacoes();
    }
}
