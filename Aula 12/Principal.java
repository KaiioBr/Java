
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        // Animal an = new Animal(); //
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o animeal (1 - Cachorro, 2 - Gato)");
        int Escolha = sc.nextInt();
        Animal animalSelecionado; 

        if (Escolha==1) {
            animalSelecionado=new Cachorro();
        }else if (Escolha==2) {
            animalSelecionado=new Gato();
        } else {
            System.out.println("Opção inválida. Encerrando o programa.");
            
            return;
        }

        animalSelecionado.fazersom();
        sc.close();

    }
}

