package controleestoqueservicos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private static final String FILE_NAME = "produtos.txt";

    public static void salvarDados(List<Produto> produtos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Produto produto : produtos) {
                writer.write(produto.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Produto> carregarDados() {
        List<Produto> produtos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            @SuppressWarnings("unused")
            String line;
            while ((line = reader.readLine()) != null) {
                // Processar linha e adicionar produto
                // Exemplo: produtos.add(Produto.fromString(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return produtos;
    }
}
