import java.io.FileWriter;

public class Exp04 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("dados.txt");

            fw.write("Nome: João\n");
            fw.write("Idade: 30\n");

            fw.close();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
    }
    
}
