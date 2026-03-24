public class clientePj extends cliente {
    private  String cnpj;

    public clientePj(String nome, String endereco, String cnpj) {
        super(nome, endereco, cnpj);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCpf(String cnpj) {
        this.cnpj = cnpj;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("O CPNJ e: " + getCnpj());
    
    }   

}
 