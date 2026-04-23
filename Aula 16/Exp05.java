import java.io.FileReader;
import java.io.FileWriter;

public class Exp05 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("dados.txt");
            int carcater;

            while ((carcater = fr.read()) != -1) {
                System.out.print((char) carcater);
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
    }
    
}
