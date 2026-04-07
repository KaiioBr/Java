public class AtvGato extends AtvAnimal{
    public AtvGato(String nome) {
        super(nome);
    }

    @Override
    public void fazersom() {
        System.out.println("Miau Miau");
    }
}
