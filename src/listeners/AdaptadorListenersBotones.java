/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Roberto Cruz Leija
 */
public class AdaptadorListenersBotones implements ActionListener{

    private JPanel panelCentral;

    public AdaptadorListenersBotones(JPanel panelCentral) {
        this.panelCentral = panelCentral;
    }
    
      
    @Override
    public void actionPerformed(ActionEvent e) {
        // conocemos el boton que fue presionado 
        JButton btnPresionado = (JButton)e.getSource();
        String tituloBoton = btnPresionado.getText();
        // verificamos el texto del boton y tomamos una decision 
        if (tituloBoton.equals("Rojo")){
        panelCentral.setBackground(Color.red);
        }
        if (tituloBoton.equals("Verde")){
        panelCentral.setBackground(Color.GREEN);
        }
        if (tituloBoton.equals("Amarillo")){
        panelCentral.setBackground(Color.yellow);
        }
        if (tituloBoton.equals("Azul")){
        panelCentral.setBackground(Color.BLUE);
        }
    }
    
    
}
