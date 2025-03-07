import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in); // Scanner agora é estático
    static int escolha; // Tornando a variável escolha estática
    // Array de Itens para guardar os itens disponíveis no jogo
    static Itens[] itens = new Itens[10];
    static Itens itemSelecionado = null; // Variável itemSelecionado declarada como estática

    public static void main(String[] args) {
        // Inicializando o array de itens
        itens[0] = new Armas(0, "Espada de Ferro", "Espada", 5, 10, 0, 5, 15);
        itens[1] = new Armas(1, "Varinha Mágica", "Varinha", 12, 5, 15, 3, 20);

        // Menu para o usuário escolher o que deseja fazer
        do {
            System.out.println("Bem-vindo. Selecione uma opção a seguir: ");
            System.out.println("0. Encerrar o programa");
            System.out.println("1. Montar build");
            System.out.println("2. Inspecionar build");
            escolha = scanner.nextInt(); // Agora pode acessar escolha

            switch (escolha) {
                case 1:
                    mostrarItens(); // Mostra os itens e permite selecionar
                    break;
                case 2:
                    buildSalva(); // Método para inspecionar a build
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (escolha != 0);

        scanner.close();
    }

    // Exibe os itens disponíveis para montar uma build
    public static void mostrarItens() {
        System.out.println("Itens disponíveis para montar a build:");
        for (Itens item : itens) {
            if (item != null) { // Verifica se o item não é nulo
                System.out.println(item);
            }
        }

        System.out.print("\nDigite o código do item que você deseja salvar: ");
        int codigoEscolhido = scanner.nextInt();

        for (Itens item : itens) {
            if (item != null && item.getCodigo() == codigoEscolhido) {
                itemSelecionado = item; // Item encontrado e salvo
                break;
            }
        }

        if (itemSelecionado != null) {
            System.out.println("\nVocê selecionou o item: " + itemSelecionado.getNome());
        } else {
            System.out.println("\nCódigo de item inválido. Nenhum item selecionado.");
        }

        // Exibindo o item selecionado
        if (itemSelecionado != null) {
            System.out.println("\nInformações do item selecionado:");
            System.out.println(itemSelecionado); // Exibe o item salvo
        }
    }

    // Método para inspecionar a build salva
    public static void buildSalva() {
        if (itemSelecionado != null) {
            System.out.println("\nBuild atual:");
            System.out.println(itemSelecionado); // Exibe o item salvo na build
        } else {
            System.out.println("\nNenhum item foi selecionado para a build.");
        }
    }
}
