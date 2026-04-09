public class ImpressoraLaser implements Impressora {
    @Override
    public void imprimir(String texto) {
        System.out.println("\n🖨️ [Impressão a Laser]");
        System.out.println("Aquecendo toner...");
        System.out.println("Documento: \"" + texto + "\"");
    }
}