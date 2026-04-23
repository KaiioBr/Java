import java.io.FileWriter;

public class AlterarArquivo {
    public static void main(String[] args) {
        

    String caminho = "Arquivo.txt";

    try {
        FileWriter write = new FileWriter(caminho);
        write.write("Conteudo Atualizado");  
        write.write("Este texto substituii o anterior");
        write.close();
        System.out.println("Arquivo atualizado com sucesso!");
    } catch (Exception e) {
        System.out.println("Ocorreu um erro.");
        e.printStackTrace();
    }
    }
}
