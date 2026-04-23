import java.io.BufferedReader;
import java.io.FileReader;

public class Exp07 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("dados.txt"));
            String linha;

            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
    }
}
