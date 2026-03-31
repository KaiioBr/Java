public class ExemploContador {
    public static void main(String[] args) {
        int contador = 1;

        System.out.println("Iniciando o contador com do-while: ");

        do{
            System.out.println("O valor do contador e: "+ contador);
            contador++; //Incrementa o contador a cada interaçao
        } while (contador <= 5);

        System.out.println("Fim do laço. ");
    }
}