
import javax.swing.JOptionPane;

public class CaixaEntrada {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        JOptionPane.showConfirmDialog(null, "Ola, "+ nome+" !", "Saudaçao", JOptionPane.PLAIN_MESSAGE);
    }
}
