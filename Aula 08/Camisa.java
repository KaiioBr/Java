public class Camisa {
    private String cor;
    private String Tamanho;
    private String tipo;

    public Camisa(String cor, String Tamanho, String tipo) {
        this.cor = cor;
        this.Tamanho = Tamanho;
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public String getTamanho() {
        return Tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(String Tamanho) {
        this.Tamanho = Tamanho;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }   

}
