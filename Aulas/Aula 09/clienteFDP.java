

public class clienteFDP extends cliente {
    private String cpf;

    public clienteFDP(String nome, String endereco, String cpf) {
        super(nome, endereco, cpf);
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();

    
    }


    
}
