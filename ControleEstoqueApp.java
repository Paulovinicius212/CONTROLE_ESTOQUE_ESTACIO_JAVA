package controleestoqueservicos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControleEstoqueApp {
    private JFrame frame;
    private JTextField txtNome;
    private JTextField txtQuantidade;
    private JTextField txtPreco;
    private JTextArea textAreaProdutos;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ControleEstoqueApp window = new ControleEstoqueApp();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public ControleEstoqueApp() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(4, 2));

        JLabel lblNome = new JLabel("Nome:");
        panel.add(lblNome);

        txtNome = new JTextField();
        panel.add(txtNome);
        txtNome.setColumns(10);

        JLabel lblQuantidade = new JLabel("Quantidade:");
        panel.add(lblQuantidade);

        txtQuantidade = new JTextField();
        panel.add(txtQuantidade);
        txtQuantidade.setColumns(10);

        JLabel lblPreco = new JLabel("Preço:");
        panel.add(lblPreco);

        txtPreco = new JTextField();
        panel.add(txtPreco);
        txtPreco.setColumns(10);

        JButton btnAdicionar = new JButton("Adicionar");
        panel.add(btnAdicionar);

        textAreaProdutos = new JTextArea();
        frame.getContentPane().add(new JScrollPane(textAreaProdutos), BorderLayout.SOUTH);

        btnAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                String quantidade = txtQuantidade.getText();
                String preco = txtPreco.getText();

                textAreaProdutos
                        .append(String.format("Produto [nome=%s, quantidade=%s, preco=%s]%n", nome, quantidade, preco));

                // Clear the text fields
                txtNome.setText("");
                txtQuantidade.setText("");
                txtPreco.setText("");
            }
        });
    }
}
