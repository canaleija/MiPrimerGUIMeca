/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import listeners.ControladorEventosBotones;

/**
 *
 * @author Roberto Cruz Leija
 */
public class JFrameGridLayOut extends JFrame {
    
    private String titulo;
    private Dimension dim;

    public JFrameGridLayOut(String titulo, Dimension dim) {
        this.titulo = titulo;
        this.dim = dim;
        initComponents();
    }

    private void initComponents() {
        setTitle(titulo);
        setSize(dim);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        
        // definir el LayOut
        setLayout(new GridLayout(2, 2));
        // creamos los botones
        JButtonNuevo btn1 = new JButtonNuevo();
        JButtonNuevo btn2 = new JButtonNuevo();
        JButtonNuevo btn3 = new JButtonNuevo();
        JButtonNuevo btn4 = new JButtonNuevo();
        
        ControladorEventosBotones controlbotones = new ControladorEventosBotones();
        btn1.addMouseListener(controlbotones);
        btn2.addMouseListener(controlbotones);
        btn3.addMouseListener(controlbotones);
        btn4.addMouseListener(controlbotones);
        
        // agregar los botones
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        
        // hacemos visible el JFrame
        setVisible(true);
        
    }
    
    
    
    
}
