public class AtvMainn {
    public static void main(String[] args) {
        AtvPagamento meuCartao = new AtvCartaoCredito();
        AtvPagamento meuPix = new AtvPix();

        System.out.println(" ======== Compra 1 ========");
        meuCartao.processarPagamento(100.0);

        System.out.println("\n ======== Compra 2 ========");
        meuPix.processarPagamento(50.0);
    }
}
