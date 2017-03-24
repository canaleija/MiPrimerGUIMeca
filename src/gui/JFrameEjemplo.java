/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Roberto Cruz Leija
 */
public class JFrameEjemplo extends JFrame {
    
    private String titulo;
    private Dimension dim;
    private JButton btn1,btn2,btn3,btn4;
    private JPanel panelCentral;
    
    
    public JFrameEjemplo(String titulo,Dimension dim){
        this.titulo = titulo;
        this.dim = dim;
        initComponents();
    }

    private void initComponents() {
        // inicializar todos los componentes 
        // de mi JFrame
        // creando los botones
        this.btn1 = new JButton("Norte");
        this.btn2 = new JButton("Sur");
        this.btn3 = new JButton("Oeste");
        this.btn4 = new JButton("Este");
        
        this.panelCentral =  new JPanel();
        this.panelCentral.setBackground(Color.magenta);
        // definimos la forma de distribucion 
        // del jframe
        setLayout(new BorderLayout());
        // agregar los botones
        add(this.btn1, BorderLayout.NORTH);
        add(this.btn2, BorderLayout.SOUTH);
        add(this.btn3, BorderLayout.WEST);
        add(this.btn4, BorderLayout.EAST);
        add(this.panelCentral,BorderLayout.CENTER);
        
        
        // conf ventana
        setVisible(true);
        setSize(dim);
        setTitle(titulo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        
        
    }
    
    
}
