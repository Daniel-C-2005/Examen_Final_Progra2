package edu.ejercicios;
import Interfaz_Grafica.LoginForm;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        LoginForm x = new LoginForm();
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new LoginForm().PanelPrincipal);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024,768);
        frame.pack();
        frame.setVisible(true);


    }
}