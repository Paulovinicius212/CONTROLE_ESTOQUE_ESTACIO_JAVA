import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem sairMenuItem;
    
    public MainFrame() {
        setTitle("Sistema de Controle de Estoque");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        menuBar = new JMenuBar();
        menu = new JMenu("Arquivo");
        sairMenuItem = new JMenuItem("Sair");
        menu.add(sairMenuItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);
        
        sairMenuItem.addActionListener(e -> System.exit(0));
        
        // Adicionar outros componentes e layouts
    }
}
