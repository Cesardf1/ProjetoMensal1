import java.util.Scanner;

public class Main {
    // Declare static variables at the class level
    static Scanner scanner = new Scanner(System.in);
    static int escolha;
    static Item[] itens = new Item[10];
    static Item itemSelecionado = null;

    public static void main(String[] args) {
        // Inicializando o array de itens
        itens[0] = new Arma(0, "Espada de Ferro", "Espada", 15, TipoItem.ARMA,  20);
        itens[1] = new Arma(1, "Varinha Mágica", "Varinha", 20, TipoItem.ARMA,  10);

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
        for (Item item : itens) {
            if (item != null) { // Verifica se o item não é nulo
                System.out.println(item);
            }
        }

        System.out.print("\nDigite o código do item que você deseja salvar: ");
        int codigoEscolhido = scanner.nextInt();

        for (Item item : itens) {
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