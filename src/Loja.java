import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Item> itens;

    // Construtor
    public Loja() {
        this.itens = new ArrayList<>();
    }

    // Adicionar item à loja
    public void adicionarItem(Item item) {
        itens.add(item);
        System.out.println(item.getNome() + " foi adicionado à loja.");
    }

    // Listar itens da loja
    public void listarItens() {
        System.out.println("Itens disponíveis na loja:");
        for (Item item : itens) {
            System.out.println(item);
        }
    }
}