package Interfaz_Grafica;

import javax.swing.*;

public class LoginForm {

    private JTextField tfuser;
    private JPasswordField tfpassword;
    private JButton OKButton;
    private JButton cancelarButton;
    public JPanel PanelPrincipal;
    public JLabel userkey;

    public LoginForm() {
        OKButton.addActionListener(e -> {
            String user = tfuser.getText();
            String password = tfpassword.getText();
            if (user.equals("postgres") && password.equals("mysecretpassword")) {
                JOptionPane.showMessageDialog(null, "Bienvenido");
                createUIComponents();
                //ingresar a post login
                JFrame frame = new JFrame("Post_Login");
                frame.setContentPane(new Post_Login().Panel_Principal);
                frame.setSize(300, 200);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(1024, 768);
                frame.pack();
                frame.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
        });
        cancelarButton.addActionListener(e -> {
            tfuser.setText("Hola");
            tfpassword.setText("");
        });
    }


    private void createUIComponents() {
        //Cambiar el tamaño del userkey
        userkey = new JLabel();
        userkey.setSize(150, 150);
        userkey.setText("Bienvenido");

    }
}
