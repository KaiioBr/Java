import java.util.Scanner;

public class atv03 {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String resp="Anderson";
        while (resp.equalsIgnoreCase("Digite um nome fofo de professor: ")) {
            resp=sc.nextLine();
        }
        System.out.println("Processo encerrado");
    sc.close();
    }
}
