/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagui2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.tree.DefaultTreeCellEditor;

/**
 *
 * @author Roberto Cruz Leija
 */
public class JFrameEditor extends JFrame {
    
    private String txtInicial;
    private JTextField texto;
    private JButton btnAgregar;
    private JRadioButton rbAzul,rbRojo,rbNegro;
    private JComboBox listaFuentes;
    private JTextArea areaTexto;
    
    public JFrameEditor (String txtInicial){
      this.txtInicial = txtInicial;
      initComponents();
      initListeners();
    }

    private void initComponents() {
        // propiedades del frame
        setSize(new Dimension(700, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // construir el panel norte
        JPanel panelNorte = new JPanel();
        panelNorte.setLayout(new BorderLayout());
        this.texto = new JTextField();
        this.btnAgregar = new JButton("Concatenar Texto");
        panelNorte.add(texto,BorderLayout.CENTER);
        panelNorte.add(btnAgregar,BorderLayout.EAST);
        
        // construir el panel oeste
        JPanel panelOeste = new JPanel();
        panelOeste.setLayout(new GridLayout(4, 1));
        ButtonGroup grupo = new ButtonGroup();
        this.rbAzul = new JRadioButton("Azul");
        this.rbNegro = new JRadioButton("Negro");
        this.rbRojo = new JRadioButton("Rojo");
        grupo.add(rbAzul);
        grupo.add(rbNegro);
        grupo.add(rbRojo);
        panelOeste.add(rbNegro);
        panelOeste.add(rbRojo);
        panelOeste.add(rbAzul);
        String[] fuentes = new String[]{"Fuente 1","Fuente 2","Fuente3"};
        this.listaFuentes = new JComboBox(fuentes);
        panelOeste.add(listaFuentes);
        
        // agregar paneles y el area texto
        add(panelNorte,BorderLayout.NORTH);
        add(panelOeste,BorderLayout.WEST);
        this.areaTexto = new JTextArea(txtInicial);
        add(areaTexto,BorderLayout.CENTER);
        
        setVisible(true);
    
    }

    private void initListeners() {
        this.btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.append(" "+texto.getText());
                texto.setText("");
            }
        });
    }
    
}
