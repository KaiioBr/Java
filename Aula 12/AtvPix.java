public class AtvPix implements AtvPagamento {
    public void processarPagamento(double valor) {
        System.out.println("gerando qr code do pix");
        System.out.println("Processando pagamento de R$ " + valor + " com Pix.");
    }
    
}
