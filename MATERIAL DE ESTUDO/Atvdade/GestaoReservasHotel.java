// Importamos as bibliotecas necessárias para o funcionamento do programa
import java.util.ArrayList; // Usado para criar listas dinâmicas (que crescem ou diminuem de tamanho)
import java.util.HashMap;   // Usado para criar uma estrutura de chave-valor (ex: Quarto 101 -> Lista de Hóspedes)
import java.util.Scanner;   // Usado para ler o que o usuário digita no teclado

public class GestaoReservasHotel {
    public static void main(String[] args) {
        // Inicializa o Scanner para capturar as entradas do usuário
        Scanner sc = new Scanner(System.in);
        
        // Constantes (valores que não mudam) para definir os limites do sistema
        final int MAX_QUARTOS = 5;
        final int MAX_RESERVAS = 25;

        // Variáveis de controle de estado do sistema
        int qtdQuartosRegistrados = 0; // Guarda exatamente quantos quartos o usuário escolheu cadastrar
        int[] quartos = new int[MAX_QUARTOS]; // Array fixo para guardar os números dos quartos
        int[] camas = new int[MAX_QUARTOS];   // Array fixo para guardar a quantidade de camas de cada quarto
        
        // Esta é a estrutura mais poderosa do código:
        // O Integer (chave) é o número do quarto.
        // O ArrayList<String> (valor) é a lista com os nomes dos hóspedes daquele quarto.
        HashMap<Integer, ArrayList<String>> reservas = new HashMap<>();
        
        int totalReservas = 0; // Contador geral de quantas reservas já foram feitas no hotel

        // "Flags" (bandeiras) booleanas para impedir que o usuário pule etapas
        boolean quartosRegistrados = false;
        boolean camasRegistradas = false;

        int opc; // Variável para guardar a opção escolhida no menu

        // Início do laço principal do programa: ele vai repetir até o usuário digitar 6
        do {
            // Exibição do Menu
            System.out.println("\n========= Reservas de Hotel =========");
            System.out.println("| 1 - Registrar número dos quartos    |");
            System.out.println("| 2 – Registrar quantidade de camas   |");
            System.out.println("| 3 – Reservar quarto                 |");
            System.out.println("| 4 – Consultar reservas por quarto   |");
            System.out.println("| 5 – Consultar reservas por hóspede  |");
            System.out.println("| 6 – Encerrar sistema                |");
            System.out.println("=====================================");
            System.out.print("\nEscolha uma opção: ");
            
            // --- BLOCO DE SEGURANÇA (Validação de Inteiro) ---
            // Se o usuário digitar uma letra em vez de número, o hasNextInt() será falso.
            while (!sc.hasNextInt()) {
                System.out.print("Digite um número válido: ");
                sc.next(); // Descarta a entrada inválida (a letra que o usuário digitou)
            }
            // Só chega aqui se o usuário digitou um número real
            opc = sc.nextInt();
            sc.nextLine(); // Consome a "quebra de linha" (o Enter) que fica sobrando no buffer do Scanner
            // -------------------------------------------------

            // Avalia a opção escolhida pelo usuário
            switch (opc) {
                
                // OPÇÃO 1: REGISTRAR QUARTOS
                case 1:
                    System.out.print("Quantos quartos deseja registrar? (Máximo " + MAX_QUARTOS + "): ");
                    
                    // Validação de segurança para garantir que é um número
                    while (!sc.hasNextInt()) {
                        System.out.print("Digite um número válido: ");
                        sc.next();
                    }
                    qtdQuartosRegistrados = sc.nextInt();
                    sc.nextLine(); // Limpa o buffer

                    // Verifica se a quantidade está dentro do limite permitido
                    if (qtdQuartosRegistrados > 0 && qtdQuartosRegistrados <= MAX_QUARTOS) {
                        reservas.clear(); // Limpa o mapa de reservas caso o usuário esteja reconfigurando o hotel

                        // Laço para pedir o número de cada quarto
                        for (int i = 0; i < qtdQuartosRegistrados; i++) {
                            System.out.print("Digite o número do quarto " + (i + 1) + ": ");
                            
                            // Validação de número novamente
                            while (!sc.hasNextInt()) {
                                System.out.print("Digite um número válido: ");
                                sc.next();
                            }
                            quartos[i] = sc.nextInt();
                            sc.nextLine();
                            
                            // Prepara o HashMap: cria uma nova lista de hóspedes VAZIA para este novo quarto
                            reservas.put(quartos[i], new ArrayList<>());
                            
                            // Zera as camas por segurança, garantindo que não há "lixo" na memória
                            camas[i] = 0; 
                        }
                        
                        // Atualiza as flags indicando que a etapa 1 foi concluída
                        quartosRegistrados = true;
                        camasRegistradas = false; // Se mudou os quartos, obriga a cadastrar as camas de novo
                        totalReservas = 0; // Zera as reservas
                        System.out.println("Números dos quartos registrados com sucesso!");
                    } else {
                        // Se digitou número negativo ou maior que MAX_QUARTOS
                        System.out.println("Quantidade inválida! Deve ser entre 1 e " + MAX_QUARTOS + ".");
                        qtdQuartosRegistrados = 0;
                        quartosRegistrados = false;
                    }
                    break;

                // OPÇÃO 2: REGISTRAR CAMAS
                case 2:
                    // Trava de segurança: não deixa cadastrar cama sem ter quarto
                    if (!quartosRegistrados) {
                        System.out.println("Primeiro registre os números dos quartos (opção 1).");
                        break;
                    }
                    System.out.println("Registrar quantidade de camas para cada quarto:");
                    
                    // Percorre apenas a quantidade de quartos que o usuário realmente cadastrou
                    for (int i = 0; i < qtdQuartosRegistrados; i++) {
                        int qtdCamas;
                        // Laço infinito que só quebra (break) se a quantidade for válida (positiva)
                        while (true) {
                            System.out.print("Digite a quantidade de camas para o quarto " + quartos[i] + ": ");
                            
                            // Validação de número
                            while (!sc.hasNextInt()) {
                                System.out.print("Digite um número válido: ");
                                sc.next();
                            }
                            qtdCamas = sc.nextInt();
                            sc.nextLine();

                            if (qtdCamas < 0) {
                                System.out.println("A quantidade não pode ser negativa. Tente novamente.");
                            } else {
                                break; // Se for válido, sai do while(true)
                            }
                        }
                        // Guarda a quantidade de camas na mesma posição (índice) do quarto correspondente
                        camas[i] = qtdCamas;
                    }
                    camasRegistradas = true; // Libera o sistema para fazer reservas
                    System.out.println("Quantidade de camas registrada com sucesso!");
                    break;

                // OPÇÃO 3: FAZER RESERVA
                case 3:
                    // Trava: exige que passos 1 e 2 estejam prontos
                    if (!quartosRegistrados || !camasRegistradas) {
                        System.out.println("Primeiro registre os quartos e as camas (opções 1 e 2).");
                        break;
                    }
                    // Trava: verifica lotação máxima do hotel
                    if (totalReservas >= MAX_RESERVAS) {
                        System.out.println("Limite máximo de reservas atingido!");
                        break;
                    }
                    
                    System.out.print("Digite o número do quarto para reservar: ");
                    // Validação de número
                    while (!sc.hasNextInt()) {
                        System.out.print("Digite um número válido: ");
                        sc.next();
                    }
                    int numeroQuarto = sc.nextInt();
                    sc.nextLine();

                    // Lógica para verificar se o quarto digitado realmente existe no array
                    boolean quartoExiste = false;
                    int indiceQuarto = -1; // Usado para saber em qual posição do array este quarto está
                    
                    for (int i = 0; i < qtdQuartosRegistrados; i++) {
                        if (quartos[i] == numeroQuarto) {
                            quartoExiste = true;
                            indiceQuarto = i; // Guarda a posição para achar as camas depois
                            break;
                        }
                    }

                    if (!quartoExiste) {
                        System.out.println("Este quarto não existe!");
                        break; // Para a execução do case 3 e volta pro menu
                    }

                    // Verifica se ainda tem cama sobrando olhando pro array de camas na posição encontrada
                    if (camas[indiceQuarto] <= 0) {
                        System.out.println("Não há camas disponíveis neste quarto!");
                        break;
                    }

                    // Pede o nome e não deixa passar em branco
                    String hospede;
                    while (true) {
                        System.out.print("Digite o nome do hóspede: ");
                        hospede = sc.nextLine().trim(); // .trim() remove espaços vazios no começo e fim
                        if (hospede.isEmpty()) {
                            System.out.println("O nome não pode ficar vazio. Tente novamente.");
                        } else {
                            break;
                        }
                    }

                    // A MÁGICA DO HASHMAP ACONTECE AQUI:
                    // 1. reservas.get(numeroQuarto) -> Pega a lista de hóspedes desse quarto
                    // 2. .add(hospede) -> Adiciona o novo hóspede no fim dessa lista
                    reservas.get(numeroQuarto).add(hospede);
                    
                    camas[indiceQuarto]--; // Diminui uma cama disponível
                    totalReservas++;       // Aumenta o contador de reservas do hotel
                    System.out.println("Reserva realizada com sucesso!");
                    break;

                // OPÇÃO 4: CONSULTAR POR QUARTO
                case 4:
                    if (!quartosRegistrados) {
                        System.out.println("Primeiro registre os números dos quartos (opção 1).");
                        break;
                    }

                    System.out.print("Digite o número do quarto para consultar reservas: ");
                    // Validação de número
                    while (!sc.hasNextInt()) {
                        System.out.print("Digite um número válido: ");
                        sc.next();
                    }
                    int quartoConsulta = sc.nextInt();
                    sc.nextLine();

                    // O HashMap tem um método prático (.containsKey) para saber se a chave (quarto) existe
                    if (!reservas.containsKey(quartoConsulta)) {
                        System.out.println("Este quarto não existe!");
                        break;
                    }

                    // Puxa a lista de hóspedes do quarto solicitado
                    ArrayList<String> listaReservas = reservas.get(quartoConsulta);
                    
                    if (listaReservas.isEmpty()) { // Se a lista estiver vazia
                        System.out.println("Não há reservas para este quarto!");
                    } else {
                        System.out.println("Reservas para o quarto " + quartoConsulta + ":");
                        
                        // "For each": para cada String (r) dentro da lista (listaReservas), faça algo
                        for (String r : listaReservas) {
                            System.out.println("- " + r);
                        }
                        
                        // Busca no array de quartos a posição correta para mostrar as camas restantes
                        for (int i = 0; i < qtdQuartosRegistrados; i++) {
                            if (quartos[i] == quartoConsulta) {
                                System.out.println("Camas restantes: " + camas[i]);
                                break;
                            }
                        }
                    }
                    break;

                // OPÇÃO 5: CONSULTAR POR HÓSPEDE
                case 5:
                    if (totalReservas == 0) {
                        System.out.println("Não há reservas no sistema.");
                        break;
                    }

                    System.out.print("Digite o nome do hóspede para consultar reservas: ");
                    String nomeHospede = sc.nextLine().trim();

                    boolean encontrouReserva = false;
                    
                    // Vai varrer todas as "Chaves" (números dos quartos) cadastradas no HashMap
                    for (int quarto : reservas.keySet()) {
                        
                        // Pega a lista de hóspedes daquele quarto específico
                        ArrayList<String> reservasQuarto = reservas.get(quarto);
                        
                        // Varre a lista de hóspedes
                        for (String r : reservasQuarto) {
                            
                            // .equalsIgnoreCase compara textos ignorando maiúsculas e minúsculas
                            // Assim "Joao" é igual a "joao" ou "JOAO"
                            if (r.equalsIgnoreCase(nomeHospede)) {
                                System.out.println("Hóspede '" + r + "' possui reserva no quarto " + quarto);
                                encontrouReserva = true;
                            }
                        }
                    }

                    if (!encontrouReserva) {
                        System.out.println("Não há reservas para este hóspede!");
                    }
                    break;

                // OPÇÃO 6: SAIR
                case 6:
                    System.out.println("Encerrando o sistema...");
                    break;

                // PADRÃO: SE DIGITAR UM NÚMERO FORA DE 1 A 6
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opc != 6); // O programa roda em loop enquanto a opção não for 6

        sc.close(); // Fecha o Scanner para liberar recursos da memória do computador
    }
}