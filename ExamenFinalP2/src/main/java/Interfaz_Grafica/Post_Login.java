package Interfaz_Grafica;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Post_Login {
    JPanel Panel_Principal;
    private JTextField tfNombre;
    private JTextField tfApellido;
    private JTextField tfEmail;
    private JButton btnAceptar;
    private JButton btnCancelar;

    //Agregar un estudiante a la base de datos
    public <Conexion> Post_Login() {
        btnAceptar.addActionListener(this::actionPerformed);
        btnCancelar.addActionListener(e -> {
            tfNombre.setText("");
            tfApellido.setText("");
            tfEmail.setText("");
        });

    }


    private <Conexion> void actionPerformed(ActionEvent e) {
        String nombre = tfNombre.getText();
        String apellido = tfApellido.getText();
        String email = tfEmail.getText();
        if (nombre.equals("") || apellido.equals("") || email.equals("")) {
            JOptionPane.showMessageDialog(null, "No se puede dejar campos vacios");
        } else {

            //Mandar los datos a la base de datos



            JOptionPane.showMessageDialog(null, "Estudiante agregado");
        }
    }
}
