import java.io.FileWriter;
import java.io.BufferedWriter;

public class Exp06 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("dados.txt", true));

            bw.write("Terceira linha");
            bw.newLine();
            bw.write("Quarta linha");
            bw.close();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();

        }
    }
}
