public abstract  class AtvAnimal {
    private String nome;

    public AtvAnimal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void fazersom();
}
