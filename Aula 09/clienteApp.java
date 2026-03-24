import java.util.Scanner;

public class clienteApp {
    public static void main(String[] args) {
        
    // cliente c1 = new clienteFDP("Anderson", "Rua", "000.000.000-00");
    //     clientePj c2 = new clientePj(null, null, null);

    //     c1.exibirInformacoes();

    //     c2.exibirInformacoes();
    // }
    Scanner sc = new Scanner(System.in);
    cliente c1 = new clienteFDP(null, null, null);
    System.out.println("Digite o nome do cliente:");
    c1.setNome(sc.nextLine());

    System.out.println("Digite o endereço do cliente:");
    c1.setEndereco(sc.nextLine());

    System.out.println("Digite o CPF do cliente:");
    c1.setCpf(sc.nextLine());
    
    c1.exibirInformacoes();

    sc.close();
    }
}
