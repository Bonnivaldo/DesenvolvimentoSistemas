/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicio;

import AtividadeEntrega.Calculadora;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EXE01 extends JFrame{
    
        JTextField jtpt101, jtpt102;
        JLabel jlpt101, jlpt102;
    
    public class EXE01(){
    
        super("Gnuplot Front End");
        Container tela = getContentPane();
        setLayout(null);

        jlpt101 = new JLabel ("Filename");
        jlpt102 = new JLabel ("Function");

       jlpt101.setBounds(50,20,100,20);
       jlpt102.setBounds(50,60,100,20);
       jtpt101.setBounds(120,20,200,20);
       jtpt102.setBounds(120,60,200,20);   


       tela.add(jlpt101); tela.add(jlpt102);
       tela.add(jtpt101); tela.add(jtpt102);


       
        setSize(400,250);
        setVisible(true);

    }
        
    public static void main(String args[]){
        EXE01 app = new EXE01();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
