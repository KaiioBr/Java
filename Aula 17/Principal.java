import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Carro> listaCarros = new ArrayList<>();
        boolean executando = true;

        while (executando) {
            String menu = "===== SISTEMA DE CARROS =====\n\n"
                    + "1 - Cadastrar Carro\n"
                    + "2 - Listar Carros\n"
                    + "3 - Detalhar Carro\n"
                    + "4 - Alterar Carro\n"
                    + "5 - Remover Carro\n"
                    + "6 - Gravar Informações em Arquivo\n"
                    + "7 - Sair\n\n"
                    + "Escolha uma opção:";

            String opcaoStr = JOptionPane.showInputDialog(null, menu, "Menu Principal", JOptionPane.QUESTION_MESSAGE);

            // Caso o usuário clique em "Cancelar" ou feche a janela
            if (opcaoStr == null) {
                break;
            }

            int opcao = 0;
            try {
                opcao = Integer.parseInt(opcaoStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite um número válido!");
                continue;
            }

            switch (opcao) {
                case 1: // Cadastrar Carro
                    try {
                        String marca = JOptionPane.showInputDialog("Digite a marca do carro:");
                        if (marca == null) break;
                        
                        String modelo = JOptionPane.showInputDialog("Digite o modelo do carro:");
                        if (modelo == null) break;
                        
                        String anoStr = JOptionPane.showInputDialog("Digite o ano do carro:");
                        if (anoStr == null) break;
                        
                        int ano = Integer.parseInt(anoStr);

                        Carro novoCarro = new Carro(marca, modelo, ano);
                        listaCarros.add(novoCarro);
                        JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso!");
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Ano inválido! Cadastro cancelado.");
                    }
                    break;

                case 2: // Listar Carros
                    if (listaCarros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado.");
                    } else {
                        StringBuilder lista = new StringBuilder("--- Lista de Carros ---\n");
                        for (int i = 0; i < listaCarros.size(); i++) {
                            Carro c = listaCarros.get(i);
                            lista.append("Número: ").append(i + 1)
                                 .append(" | Marca: ").append(c.getMarca())
                                 .append(" | Modelo: ").append(c.getModelo()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, lista.toString());
                    }
                    break;

                case 3: // Detalhar Carro
                    if (listaCarros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado.");
                        break;
                    }
                    try {
                        String numStr = JOptionPane.showInputDialog("Digite o número do carro para detalhar:");
                        if (numStr == null) break;
                        
                        int num = Integer.parseInt(numStr) - 1;

                        if (num >= 0 && num < listaCarros.size()) {
                            JOptionPane.showMessageDialog(null, listaCarros.get(num).exibirDetalhes());
                        } else {
                            JOptionPane.showMessageDialog(null, "Carro não encontrado!");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Número inválido!");
                    }
                    break;

                case 4: // Alterar Carro
                    if (listaCarros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado.");
                        break;
                    }
                    try {
                        String numStr = JOptionPane.showInputDialog("Digite o número do carro que deseja alterar:");
                        if (numStr == null) break;
                        
                        int num = Integer.parseInt(numStr) - 1;

                        if (num >= 0 && num < listaCarros.size()) {
                            String novaMarca = JOptionPane.showInputDialog("Digite a nova marca:", listaCarros.get(num).getMarca());
                            String novoModelo = JOptionPane.showInputDialog("Digite o novo modelo:", listaCarros.get(num).getModelo());
                            String novoAnoStr = JOptionPane.showInputDialog("Digite o novo ano:", listaCarros.get(num).getAno());
                            
                            int novoAno = Integer.parseInt(novoAnoStr);

                            // Atualizando a lista com um novo objeto Carro na mesma posição
                            listaCarros.set(num, new Carro(novaMarca, novoModelo, novoAno));
                            JOptionPane.showMessageDialog(null, "Carro atualizado com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Carro não encontrado!");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Dado inválido! Alteração cancelada.");
                    }
                    break;

                case 5: // Remover Carro
                    if (listaCarros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado.");
                        break;
                    }
                    try {
                        String numStr = JOptionPane.showInputDialog("Digite o número do carro que deseja remover:");
                        if (numStr == null) break;
                        
                        int num = Integer.parseInt(numStr) - 1;

                        if (num >= 0 && num < listaCarros.size()) {
                            listaCarros.remove(num);
                            JOptionPane.showMessageDialog(null, "Carro removido com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Carro não encontrado!");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Número inválido!");
                    }
                    break;

                case 6: // Gravar Informações em Arquivo
                    if (listaCarros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não há carros para gravar.");
                        break;
                    }
                    try (FileWriter arq = new FileWriter("carros.txt");
                         PrintWriter gravarArq = new PrintWriter(arq)) {
                        
                        gravarArq.println("=== RELATÓRIO DE CARROS CADASTRADOS ===");
                        for (Carro c : listaCarros) {
                            gravarArq.println("Marca: " + c.getMarca() + " | Modelo: " + c.getModelo() + " | Ano: " + c.getAno());
                        }
                        
                        JOptionPane.showMessageDialog(null, "Dados gravados com sucesso no arquivo 'carros.txt'!");
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Erro ao gravar o arquivo: " + e.getMessage());
                    }
                    break;

                case 7: // Sair
                    JOptionPane.showMessageDialog(null, "Encerrando o sistema...");
                    executando = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Escolha um número entre 1 e 7.");
            }
        }
    }
}