import javax.swing.*;

public class Login {
    private JTextField usuarioTextField;
    private JPasswordField senhaField;

    private void login() {
        String usuario = usuarioTextField.getText();
        String senha = new String(senhaField.getPassword());
        
        if (usuario.equals("admin") && senha.equals("1234")) {
            // Acesso concedido
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos.");
        }
    }
}
