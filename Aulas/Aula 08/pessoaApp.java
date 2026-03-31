public class pessoaApp {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Anderson",50);
        Pessoa p2 = new Pessoa("Kaio", 21);

        System.out.println("Nome: " + p1.getNome() + ", Idade: " + p1.idade());

        System.out.println("Nome: " + p2.getNome() + ", Idade: " + p2.idade());

        p1.setNome("helder");
        p1.setIdade(30);
        p2.setNome("carla");
        p2.setIdade(52);

        System.out.println("Nome: " + p1.getNome() + ", Idade: " + p1.idade());

        System.out.println("Nome: " + p2.getNome() + ", Idade: " + p2.idade());

    }
}
