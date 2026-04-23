import java.io.FileWriter;

public class Exp02 {
    public static void main(String[] args) {
        try{
            FileWriter escritor = new FileWriter("Exemplo.txt", true);
            escritor.write("Olá, mundo!\n");
            escritor.write("Segunda linha\n");

            escritor.close();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
    }
}
