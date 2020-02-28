
package JanelaMaximizada;       //Indica o pacote onde a classe encontra-se

import java.awt.*;              //Importa a biblioteca grafica AWT 
import javax.swing.*;           //Importa a biblioteca grafica Swing

public class Botao extends JFrame{

    JButton botao;


    public Botao (){
        super("Exemplo com JButton");
        Container tela = getContentPane();
        setLayout(null);
        
        botao = new JButton ("Cadastrar");
        botao.setBounds(50,20,100,20);
        tela.add(botao);
        
        
            setSize(400,400);       //Ajusta tamanho da janela
            setVisible(true);       //Torna a janela visivel na tela
            setLocationRelativeTo(null); //Ajusta a posição de abertura da janela
    }
    public static void main(String[] args) {            //método principal 
        ExemploLabel app = new ExemploLabel();          
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}