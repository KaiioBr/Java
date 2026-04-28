import javax.swing.JOptionPane;

public class DadosUsuario {
    public static void main(String[] args) {

        try {
            // Solicita o nome
            String nome = JOptionPane.showInputDialog("Digite seu nome:");
            if (nome == null || nome.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nome não informado. Encerrando.");
                return;
            }

            // Solicita a idade
            String idadeStr = JOptionPane.showInputDialog("Digite sua idade:");
            if (idadeStr == null || idadeStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Idade não informada. Encerrando.");
                return;
            }

            int idade = Integer.parseInt(idadeStr);

            // Exibe os dados
            String mensagem = "Nome: " + nome + "\nIdade: " + idade + "\n";
            mensagem += (idade >= 18) ? "Você é maior de idade." : "Você é menor de idade.";

            JOptionPane.showMessageDialog(null, mensagem);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Idade inválida! Digite apenas números.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e.getMessage());
        }
    }
}