import java.io.File;

public class Exp01 {
    public static void main(String[] args) {
        try{

            File arquivo = new File("Exemplo.txt");
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado: " + arquivo.getName());
            } else {
                System.out.println("Arquivo já existe.");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
    }
}
