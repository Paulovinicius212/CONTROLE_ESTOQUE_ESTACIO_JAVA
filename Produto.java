public class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + "," + quantidade + "," + preco;
    }

    // Método para criar Produto a partir de uma string (se necessário)
    public static Produto fromString(String str) {
        String[] parts = str.split(",");
        return new Produto(parts[0], Integer.parseInt(parts[1]), Double.parseDouble(parts[2]));
    }
}
