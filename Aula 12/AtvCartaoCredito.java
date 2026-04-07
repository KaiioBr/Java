public class AtvCartaoCredito implements  AtvPagamento {
    public void processarPagamento(double valor) {
        System.out.println("Aprovando pagamento ");
        System.out.println("Processando pagamento de R$ " + valor + " com cartão de crédito.");
    }
    
}
