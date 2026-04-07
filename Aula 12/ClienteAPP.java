public class ClienteAPP {
    public static void main(String[] args) {
        ClientePf pf = new ClientePf("João Silva", "Rua A, 123", "123.456.789-00");
        ClientePj pj = new ClientePj("Empresa XYZ", "Avenida B, 456", "12.345.678/0001-00");

        System.out.println("Cliene pf dados  "+pf.getNome());
        System.out.println("Cliene pj  "+pj.getNome());
        
        pf.atualizarDados("NovoNome");

        pj.atualizarDados(null, null);
    }
}
