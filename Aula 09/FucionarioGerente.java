public class FucionarioGerente extends Fucionario {
    private int bonus;

    public FucionarioGerente(String nome, int idade, float salario, int bonus) {
        super(nome, idade, salario);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Bonus: " + bonus);
    }
    
}
