public class VeiculoMoto extends  Veiculo{
    private  int cilindrada;

    public VeiculoMoto (String marca, int ano, int cilindrada){
        super(marca, ano);
        this.cilindrada=cilindrada;
    }
    public int getCilindrada(){
        return cilindrada;
    }
    public void setCilindrada(int cilindrada){
        this.cilindrada=cilindrada;
    }

    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("A quantidade de cilindradas é "+getCilindrada());
    }
}