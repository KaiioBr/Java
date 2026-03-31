import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String senhaSistema = "123abc";
        String senha = sc.nextLine();

        if  (senha.equals(senhaSistema)){
        System.out.println("Porta aberta");
        } else {
            System.out.println("Porta fechada");
        }
    sc.close();
    }
}
