
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MEnuOptionPAne {
    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<>();
        boolean executando=true;

        while (executando) { 
            String opcao = JOptionPane.showInputDialog(
                null, "Escolha uma opcao:\n"+
                "1-Cadastrar\n"+
                "2-listar\n"+
                "3-Sair", 
                "Menu Principal", JOptionPane.QUESTION_MESSAGE
            );

            if (opcao==null) {
                JOptionPane.showConfirmDialog(null, "Operacao cancelada");
                break;
            }
            switch (opcao) {
                case "1":
                    String produto=JOptionPane.showInputDialog(null, "Digite o nome do produto ",
                    "Cadastro de Produto", JOptionPane.QUESTION_MESSAGE);

                    if (produto==null || produto.trim().isEmpty()) {
                        JOptionPane.showConfirmDialog(null, "PRoduto nao cadastrado");
                    } else {
                        produtos.add(produto);

                        JOptionPane.showConfirmDialog(null, "Produto cadastrado com sucesso");
                    }
                    break;
                case "2":
                    if (produtos.isEmpty()) {

                        JOptionPane.showConfirmDialog(null, "Lista vazia");
                    } else {
                        String  lista = "Produtos cadastrados\n";

                        for(int i=0;i<produtos.size();i++){
                            lista+=(i+1)+ " - "+ produtos.get(i);
                        }
                        JOptionPane.showConfirmDialog(null, lista, "LIsta de Produtos", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case "3":
                    JOptionPane.showConfirmDialog(null, "Voce escolheu sair");
                    executando=false;
                    break;

                default:
                    JOptionPane.showConfirmDialog(null, "Opcao Invalida");
                    break;
            }
        }
    }
}
