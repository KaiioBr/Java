
import java.util.ArrayList;

public class ArList02 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(50);
        numeros.add(100);

        for(int i=0;i<numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        numeros.set(2, 1221);
        numeros.remove(0);

        for (Integer n : numeros) {
            System.out.println(n);
        }

    }
}
