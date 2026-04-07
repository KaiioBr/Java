public class CarroApp {
    public static void main(String[] args) {
        
        Carro c1 = new Carro("Fusca", "Volkswagen", 1970, 10000.0);
        Carro c2 = new Carro("Civic", "Honda", 2020, 80000.0);

        c1.exibirDetalhes();
        System.out.println("-----------------------------");
        c2.exibirDetalhes();    }
}
