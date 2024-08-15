import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;

public class Relatorio {
    public static JPanel criarGrafico(List<Produto> produtos) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (Produto produto : produtos) {
            dataset.addValue(produto.getQuantidade(), "Quantidade", produto.getNome());
        }
        
        JFreeChart chart = ChartFactory.createBarChart(
            "Relatório de Estoque", "Produto", "Quantidade", dataset,
            PlotOrientation.VERTICAL, true, true, false);

        return new ChartPanel(chart);
    }
}
