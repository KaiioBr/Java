
import java.util.Scanner;

public class LojaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Loja l = new Loja(null, 0, 0);
        System.out.println("Digite o nome do produto: ");
        l.setNome(sc.nextLine());
        System.out.println("Digite o preço do produto: ");
        l.setPreco(sc.nextFloat());
        System.out.println("Digite a quantidade do produto: ");
        l.setQuantidade(sc.nextInt());

        System.out.println("O nome do produto é: "+l.getNome());
        System.out.println("O preço do produto é: "+l.getPreco());
        System.out.println("A quantidade do produto é: "+l.getQuantidade());
            sc.close();
    }
}
