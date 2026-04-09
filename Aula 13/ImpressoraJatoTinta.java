public class ImpressoraJatoTinta implements Impressora {
    @Override
    public void imprimir(String texto) {
        System.out.println("\n🖨️ [Impressão a Jato de Tinta]");
        System.out.println("Processando cartuchos de tinta...");
        System.out.println("Documento: \"" + texto + "\"");
    }
}