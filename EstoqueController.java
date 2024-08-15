package controleestoqueservicos;

import java.util.ArrayList;
import java.util.List;

public class EstoqueController {
    private final List<Produto> produtos;

    public EstoqueController() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(String nome, int quantidade, double preco) {
        Produto produto = new Produto(nome, quantidade, preco);
        produtos.add(produto);
    }

    public void mostrarEstoque() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
