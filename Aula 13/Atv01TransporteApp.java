public class Atv01TransporteApp {
    public static void main(String[] args) {
        Atv01Transporte carro = new Atv01Carro();
        Atv01Transporte bicicleta = new Atv01Bicicleta();

        carro.mover();
        bicicleta.mover();
    }
}
