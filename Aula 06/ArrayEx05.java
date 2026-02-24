import java.util.Scanner;

public class ArrayEx05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] nomes = new String[3];

        for(int i=0;i<nomes.length;i++){
            System.out.println("Informe o "+i+"° nome");
            nomes[i]= sc.nextLine();
        }

        for(int i=0;i<nomes.length;i++){
            System.out.println("Nomes Cadastrados sao: "+nomes[i]);
        }
     sc.close();   
    }
}
