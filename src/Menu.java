import java.util.Scanner;

public class Menu {
    private Loja loja;
    private Jogador jogador;
    private Scanner scanner;

    // Construtor
    public Menu(Loja loja, Jogador jogador) {
        this.loja = loja;
        this.jogador = jogador;
        this.scanner = new Scanner(System.in);
    }

    // Método para exibir o menu
    public void exibirMenu() {
        int escolha;
        do {
            System.out.println("\nBem-vindo à Loja de Itens de RPG!");
            System.out.println("1. Listar itens da loja");
            System.out.println("2. Comprar item");
            System.out.println("3. Ver inventário");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    loja.listarItens();
                    break;
                case 2:
                    comprarItem();
                    break;
                case 3:
                    jogador.listarInventario();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 0);
    }

    // Método para comprar um item
    private void comprarItem() {
        System.out.print("Digite o código do item que deseja comprar: ");
        int codigo = scanner.nextInt();
        // Lógica para comprar o item (implementar conforme necessário)
        System.out.println("Item comprado!");
    }
}