import java.util.Scanner;

public class CamisaApp {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Camisa c = new Camisa(null, null, null);

        System.out.println("Digite a cor da camisa: ");
        c.setCor(sc.nextLine());
        
        System.out.println("Digite o tamanho da camisa: ");
        c.setTamanho(sc.nextLine());
        
        System.out.println("Digite o tipo da camisa: ");
        c.setTipo(sc.nextLine());

        System.out.println("A cor da camisa é: "+c.getCor());
        System.out.println("O tamanho da camisa é: "+c.getTamanho());
        System.out.println("O tipo da camisa é: "+c.getTipo());
        sc.close();
    }
}
