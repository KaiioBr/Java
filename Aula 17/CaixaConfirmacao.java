
import javax.swing.JOptionPane;

public class CaixaConfirmacao {
    public static void main(String[] args) {
        int resposta = JOptionPane.showConfirmDialog(null, 
            "Deseja continuar? ", "Confirmacao",
            JOptionPane.YES_NO_OPTION
        );

        if (resposta==JOptionPane.YES_NO_OPTION)    {
            JOptionPane.showMessageDialog(null, 
                "Voce escolheu sim", "Resultado",
                JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showConfirmDialog(null, "Voce escolheu Nao", "Resultado", 
                JOptionPane.WARNING_MESSAGE
            );
        }
}
}
