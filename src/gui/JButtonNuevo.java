/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author Roberto Cruz Leija
 */
public class JButtonNuevo extends JButton{
    
    private int cantidad;
    
    //constructor por defecto

    public JButtonNuevo() {
        cantidad =0;
        setText(""+cantidad);
        setFont(new Font(getFont().getName(), getFont().getStyle(), 60));
    }
    
    public void acumular(){
        // aumentamos cantidad
        cantidad++;
        // modificamos el texto del boton
        setText(""+cantidad);
    
    }
    public void restar(){
     // restamos la unidad
     cantidad--;
     // modificamos el texto del boton
     setText(""+cantidad);
    
    }
    
    
    
}
