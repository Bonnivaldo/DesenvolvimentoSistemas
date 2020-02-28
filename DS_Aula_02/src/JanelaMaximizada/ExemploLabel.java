
package JanelaMaximizada;       //Indica o pacote onde a classe encontra-se

import java.awt.*;              //Importa a biblioteca grafica AWT 
import javax.swing.*;           //Importa a biblioteca grafica Swing

public class ExemploLabel extends JFrame{

    JLabel  tema1,rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7;
    JTextField text1, text2, text3, text4, text5, text6, text7;
    JButton botao;
  
 
    public ExemploLabel(){    
        super("Exemplo com Label");                     //
        Container tela = getContentPane();
        setLayout(null);
           
            botao = new JButton ("Cadastrar");
        
            tema1 = new JLabel ("Cadastro de Cliente");
            rotulo1 = new JLabel ("Nome");              //Dando um valor string dentro do objeto
            rotulo2 = new JLabel ("CPF");
            rotulo3 = new JLabel ("RG");
            rotulo4 = new JLabel ("Endereço");
            rotulo5 = new JLabel ("Cidade");
            rotulo6 = new JLabel ("Estado");
            rotulo7 = new JLabel ("CEP");
            
            text1 = new JTextField (50);
            text2 = new JTextField (12);
            text3 = new JTextField (10);
            text4 = new JTextField (50);
            text5 = new JTextField (50);
            text6 = new JTextField (50);
            text7 = new JTextField (9);
            
            botao.setBounds(150,330,120,20);
            
            tema1.setBounds(120,15,180,15);        
            rotulo1.setBounds(50,40,80,20);            //Ajusta posição e tamanho dos objetos
            rotulo2.setBounds(50,80,80,20);
            rotulo3.setBounds(50,120,80,20);
            rotulo4.setBounds(50,160,80,20);
            rotulo5.setBounds(50,200,80,20);            
            rotulo6.setBounds(50,240,80,20);
            rotulo7.setBounds(50,280,80,20);

            
            text1.setBounds(50,60,200,20);            //Ajusta posição e tamanho dos objetos
            text2.setBounds(50,100,200,20);
            text3.setBounds(50,140,200,20);
            text4.setBounds(50,180,200,20);
            text5.setBounds(50,220,200,20);
            text6.setBounds(50,260,200,20);
            text7.setBounds(50,300,200,20);    
            
            tema1.setForeground(new Color(255,000,000));
            rotulo1.setForeground(new Color(000,000,000));          // Ajusta cor do objeto
            rotulo2.setForeground(new Color(000,000,000));
            rotulo3.setForeground(new Color(000,000,000));
            rotulo4.setForeground(new Color(000,000,000));
            rotulo5.setForeground(new Color(000,000,000)); 
            rotulo6.setForeground(new Color(000,000,000));
            rotulo7.setForeground(new Color(000,000,000));
            
            tema1.setFont(new Font("Arial",Font.BOLD,16));
            rotulo1.setFont(new Font("Arial",Font.BOLD,12));        // Ajusta fonte do objeto
            rotulo2.setFont(new Font("Arial",Font.BOLD,12));
            rotulo3.setFont(new Font("Arial",Font.BOLD,12));
            rotulo4.setFont(new Font("Arial",Font.BOLD,12));
            rotulo5.setFont(new Font("Arial",Font.BOLD,12));        
            rotulo6.setFont(new Font("Arial",Font.BOLD,12));
            rotulo7.setFont(new Font("Arial",Font.BOLD,12));
           
           
            tela.add(botao);
            
            tela.add(tema1);
            tela.add(rotulo1);      //Exibe o objeto na tela 
            tela.add(rotulo2);
            tela.add(rotulo3);
            tela.add(rotulo4);
            tela.add(rotulo5);   
            tela.add(rotulo6);
            tela.add(rotulo7);
       
            tela.add(text1);      //Exibe o objeto na tela 
            tela.add(text2);
            tela.add(text3);
            tela.add(text4);
            tela.add(text5);   
            tela.add(text6);
            tela.add(text7);

            setSize(400,400);       //Ajusta tamanho da janela
            setVisible(true);       //Torna a janela visivel na tela
            setLocationRelativeTo(null); //Ajusta a posição de abertura da janela
    }
    public static void main(String[] args) {            //método principal 
        ExemploLabel app = new ExemploLabel();          
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}