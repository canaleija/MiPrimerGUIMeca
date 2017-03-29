/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import listeners.AdaptadorListenersBotones;

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
        initListenersAdaptador();
        
    }

    private void initComponents() {
        // inicializar todos los componentes 
        // de mi JFrame
        // creando los botones
        this.btn1 = new JButton("Rojo");
        this.btn2 = new JButton("Verde");
        this.btn3 = new JButton("Azul");
        this.btn4 = new JButton("Amarillo");
        
        
        
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

    private void initListeners() {
       // implementar Listener para el evento btn1
        
        this.btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // setear el color del panel central
               panelCentral.setBackground(Color.RED);
            }
        });
        
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCentral.setBackground(Color.GREEN);
            }
        });
        
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCentral.setBackground(Color.blue);
            }
        });
        
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCentral.setBackground(Color.YELLOW);
            }
        });
    }

    private void initListenersAdaptador() {
        // creamos el adaptador
        AdaptadorListenersBotones adaptador = new AdaptadorListenersBotones(panelCentral);
        // agregamos el adaptador a los botones
        this.btn1.addActionListener(adaptador);
        this.btn2.addActionListener(adaptador);
        this.btn3.addActionListener(adaptador);
        this.btn4.addActionListener(adaptador);
        
    }
    
    
}
