/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package cl.banecul.pixelandbeans;
import cl.banecul.pixelandbeans.gui.LoginView;
/**
 *
 * @author Bastian
 */
public class PixelAndBean {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            LoginView login = new LoginView();
            login.setLocationRelativeTo(null); // centrar
            login.setVisible(true);
        });
    }
}