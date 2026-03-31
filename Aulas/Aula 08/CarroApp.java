public class CarroApp {
    public static void main(String[] args) {
        Carro c1 = new Carro("Chevrolet", "Onix", 2020);
        Carro c2 = new Carro("Ford", "Ka", 2018);

        System.out.println("Marca: " + c1.getMarca() + ", Modelo: " + c1.getModelo() + ", Ano: " + c1.getAnoFabricacao());

        System.out.println("Marca: " + c2.getMarca() + ", Modelo: " + c2.getModelo() + ", Ano: " + c2.getAnoFabricacao());

        c1.setMarca("Volkswagen");
        c1.setModelo("Gol");
        c1.setAnoFabricacao(2021);

        c2.setMarca("Fiat");
        c2.setModelo("Argo");
        c2.setAnoFabricacao(2019);

        System.out.println("Marca: " + c1.getMarca() + ", Modelo: " + c1.getModelo() + ", Ano: " + c1.getAnoFabricacao());

        System.out.println("Marca: " + c2.getMarca() + ", Modelo: " + c2.getModelo() + ", Ano: " + c2.getAnoFabricacao());
    }
}
