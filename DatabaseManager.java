import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    private static final String URL = "jdbc:mysql://localhost:3306/estoque";
    private static final String USER = "usuario";
    private static final String PASSWORD = "senha";

    public static Connection conectarBanco() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static List<Produto> carregarProdutos() {
        List<Produto> produtos = new ArrayList<>();
        try (Connection conn = conectarBanco();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM produtos")) {
            while (rs.next()) {
                String nome = rs.getString("nome");
                int quantidade = rs.getInt("quantidade");
                double preco = rs.getDouble("preco");
                produtos.add(new Produto(nome, quantidade, preco));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }
}
