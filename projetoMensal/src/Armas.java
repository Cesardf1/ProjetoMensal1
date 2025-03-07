class Armas extends Itens {
    String tipo; // Tipo da arma, como "Espada", "Arco", etc.
    int dano;

    // Construtor da classe Armas, que chama o construtor da classe pai (Itens)
    public Armas(int codigo, String nome, String tipo, int preco, float forca, float magia, float resistencia, int dano) {
        super(codigo, nome, preco, forca, magia, resistencia); // Chama o construtor da classe pai (Itens)
        this.tipo = tipo; // Define o tipo da arma
        this.dano = dano;
    }
    // Getter para o tipo da arma
    public String getTipo() {
        return tipo;
    }
    public int getDano(){
        return dano;
    }

    // Sobrescreve o método toString() para incluir o tipo da arma
    @Override
    public String toString() {
            return codigo + " - Item: " + nome + ", Tipo: " + tipo + ", Preço: " + preco + ", Força: " + forca + ", Magia: " + magia + ", Resistência: " + resistencia + ", Dano: " + dano;
    }
}