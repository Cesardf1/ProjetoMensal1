class Itens {
    int codigo;
    String nome;
    int preco;
    float forca;
    float magia;
    float resistencia;

    // Construtor da classe Itens
    public Itens(int codigo, String nome, int preco, float forca, float magia, float resistencia) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.forca = forca;
        this.magia = magia;
        this.resistencia = resistencia;
    }

    // Métodos getters
    public int getCodigo(){
        return codigo;
    }
    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public float getForca() {
        return forca;
    }

    public float getMagia() {
        return magia;
    }

    public float getResistencia() {
        return resistencia;
    }


    // Método toString para representar o item de forma legível
    @Override
    public String toString() {
        return codigo + " - Item: " + nome + ", Preço: " + preco + ", Força: " + forca + ", Magia: " + magia + ", Resistência: " + resistencia;
    }
}
