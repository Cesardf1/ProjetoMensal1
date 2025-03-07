import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private List<Item> inventario;

    // Construtor
    public Jogador(String nome) {
        this.nome = nome;
        this.inventario = new ArrayList<>();
    }

    // Adicionar item ao inventário
    public void adicionarItem(Item item) {
        inventario.add(item);
        System.out.println(item.getNome() + " foi adicionado ao inventário.");
    }

    // Listar itens do inventário
    public void listarInventario() {
        System.out.println("Inventário de " + nome + ":");
        for (Item item : inventario) {
            System.out.println(item);
        }
    }
}
