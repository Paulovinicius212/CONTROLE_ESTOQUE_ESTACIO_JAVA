import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProdutoSorter {
    public static void ordenarPorNome(List<Produto> produtos) {
        produtos.sort(Comparator.comparing(Produto::getNome));
        // Atualizar exibição
    }

    public static List<Produto> filtrarPorQuantidade(List<Produto> produtos, int limite) {
        return produtos.stream()
                       .filter(p -> p.getQuantidade() < limite)
                       .collect(Collectors.toList());
    }
}
