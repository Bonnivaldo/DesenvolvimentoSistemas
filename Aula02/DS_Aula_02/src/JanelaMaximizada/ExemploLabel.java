
package JanelaMaximizada;       //Indica o pacote onde a classe encontra-se

import java.awt.*;              //Importa a biblioteca grafica AWT 
import javax.swing.*;           //Importa a biblioteca grafica Swing

public class ExemploLabel extends JFrame{

    JLabel  rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7, rotulo8;
    JTextField text1, text2, text3, text4, text5, text6, text7,text8;
    
    public ExemploLabel(){    
        super("Exemplo com Label");                     //
        Container tela = getContentPane();
        setLayout(null);
            rotulo1 = new JLabel ("CPF");              //Dando um valor string dentro do objeto
            rotulo2 = new JLabel ("Nome");
            rotulo3 = new JLabel ("Idade");
            rotulo4 = new JLabel ("Celular");
            rotulo5 = new JLabel ("Telefone");
            rotulo6 = new JLabel ("Endereço");
            rotulo7 = new JLabel ("CEP");
            rotulo8 = new JLabel ("Estado");
            
            text1 = new JTextField (500);
            text2 = new JTextField (500);
            text3 = new JTextField (500);
            text4 = new JTextField (500);
            text5 = new JTextField (500);
            text6 = new JTextField (500);
            text7 = new JTextField (500);
            text8 = new JTextField (500);
            
            rotulo1.setBounds(50,20,80,20);            //Ajusta posição e tamanho dos objetos
            rotulo2.setBounds(50,60,80,20);
            rotulo3.setBounds(50,100,80,20);
            rotulo4.setBounds(50,140,80,20);
            rotulo5.setBounds(50,180,80,20);            
            rotulo6.setBounds(50,220,80,20);
            rotulo7.setBounds(50,260,80,20);
            rotulo8.setBounds(50,300,80,20);
            
            text1.setBounds(150,20,200,20);            //Ajusta posição e tamanho dos objetos
            text2.setBounds(150,60,200,20);
            text3.setBounds(150,100,200,20);
            text4.setBounds(150,140,200,20);
            text5.setBounds(150,180,200,20);
            text6.setBounds(150,220,200,20);
            text7.setBounds(150,260,200,20);
            text8.setBounds(150,300,200,20);           
            
            rotulo1.setForeground(new Color(000,000,255));          // Ajusta cor do objeto
            rotulo2.setForeground(new Color(000,000,255));
            rotulo3.setForeground(new Color(000,000,255));
            rotulo4.setForeground(new Color(000,000,255));
            rotulo5.setForeground(new Color(000,000,255)); 
            rotulo6.setForeground(new Color(000,000,255));
            rotulo7.setForeground(new Color(000,000,255));
            rotulo8.setForeground(new Color(000,000,255));
            
            rotulo1.setFont(new Font("Arial",Font.BOLD,16));        // Ajusta fonte do objeto
            rotulo2.setFont(new Font("Arial",Font.BOLD,16));
            rotulo3.setFont(new Font("Arial",Font.BOLD,16));
            rotulo4.setFont(new Font("Arial",Font.BOLD,16));
            rotulo5.setFont(new Font("Arial",Font.BOLD,14));        
            rotulo6.setFont(new Font("Arial",Font.BOLD,16));
            rotulo7.setFont(new Font("Arial",Font.BOLD,16));
            rotulo8.setFont(new Font("Arial",Font.BOLD,16));
            
            tela.add(rotulo1);      //Exibe o objeto na tela 
            tela.add(rotulo2);
            tela.add(rotulo3);
            tela.add(rotulo4);
            tela.add(rotulo5);   
            tela.add(rotulo6);
            tela.add(rotulo7);
            tela.add(rotulo8);
       
            tela.add(text1);      //Exibe o objeto na tela 
            tela.add(text2);
            tela.add(text3);
            tela.add(text4);
            tela.add(text5);   
            tela.add(text6);
            tela.add(text7);
            tela.add(text8);

            setSize(400,400);       //Ajusta tamanho da janela
            setVisible(true);       //Torna a janela visivel na tela
            setLocationRelativeTo(null); //Ajusta a posição de abertura da janela
    }
    public static void main(String[] args) {            //método principal 
        ExemploLabel app = new ExemploLabel();          
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}