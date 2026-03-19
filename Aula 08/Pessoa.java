public class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Metodo acessador
    public String getNome() {
        return nome;
    }

    public int idade() {
        return idade;
    }

    // Metodo modificador
    public void setNome(String nome) {
        this.nome = nome;
    }   

    public void setIdade(int idade) {
        this.idade = idade;
    }
}