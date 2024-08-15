import java.util.List;
import javax.swing.JOptionPane;

public class GerenciadorProduto {
    private List<Produto> produtos;

    public GerenciadorProduto(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void editarProduto(Produto produto) {
        // Atualizar detalhes do produto no GUI
    }

    public void excluirProduto(Produto produto) {
        produtos.remove(produto);
        // Atualizar exibição
    }
}
