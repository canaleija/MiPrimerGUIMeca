/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import gui.JButtonNuevo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javafx.scene.input.MouseButton;

import sun.util.calendar.JulianCalendar;

/**
 *
 * @author Roberto Cruz Leija
 */
public class ControladorEventosBotones implements MouseListener{

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        // cual fue el boton que se presionó
        JButtonNuevo btn = (JButtonNuevo) e.getSource();
        // si el click fue en el izq
        if (e.getButton()==MouseEvent.BUTTON1){
          btn.acumular();
        }
         if (e.getButton()==MouseEvent.BUTTON3){
          btn.restar();
        }
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
       
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        
    }
    
}
