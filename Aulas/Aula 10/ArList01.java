import java.util.ArrayList;

public class ArList01 {
    public static void main(String[] args) {
        // Criando ArrayList
        ArrayList<String> nomes = new ArrayList<>();
        // Adicionar
        nomes.add("Josiel");
        nomes.add("Kaio");
        nomes.add("Isaac");
        nomes.add("Rui");
        nomes.add("Matheus");

        // Listando
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));

        }
        // Alterar
        nomes.set(1, "Kaio Pinto (la ele)");
        nomes.remove("Matheus");
        
        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("Os nomes cadastrados sao: "+nomes);
    }
}