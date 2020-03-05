
package AtividadeEntrega;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame{
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar,subtrair,multiplicar,dividir;
    
public Calculadora(){
    super("Calculadora");
    Container tela = getContentPane();
    setLayout(null);
    
    rotulo1 = new JLabel ("1° Número: ");
    rotulo2 = new JLabel ("2° Número: ");
    texto1 = new JTextField(5);
    texto2 = new JTextField(5);
    exibir = new JLabel("");
    somar = new JButton("+");
    subtrair = new JButton("-");
    multiplicar = new JButton("x");
    dividir = new JButton("/");
    
    
    rotulo1.setBounds(50,20,100,20);
    rotulo2.setBounds(50,60,100,20);
    texto1.setBounds(120,20,200,20);
    texto2.setBounds(120,60,200,20);
    exibir.setBounds(50,120,200,20);
    somar.setBounds(100,100,50,20);
    subtrair.setBounds(170,100,50,20);
    multiplicar.setBounds(240,100,50,20);
    dividir.setBounds(310,100,50,20);    
    
    
somar.addActionListener(
    new ActionListener(){
        public void actionPerformed(ActionEvent e){
            int numero1,numero2,soma;
            soma=0;
            numero1 = Integer.parseInt(texto1.getText());
            numero2 = Integer.parseInt(texto2.getText());
            soma = numero1 + numero2;
            exibir.setVisible(true);
            exibir.setText("A soma é: "+soma);
            
        }
    }
);

subtrair.addActionListener(
    new ActionListener(){
        public void actionPerformed(ActionEvent e){
            int numero1,numero2,soma;
            soma=0;
            numero1 = Integer.parseInt(texto1.getText());
            numero2 = Integer.parseInt(texto2.getText());
            soma = numero1 - numero2;
            exibir.setVisible(true);
            exibir.setText("A subtração é: "+soma);
            
        }
    }
);

multiplicar.addActionListener(
    new ActionListener(){
        public void actionPerformed(ActionEvent e){
            int numero1,numero2,soma;
            soma=0;
            numero1 = Integer.parseInt(texto1.getText());
            numero2 = Integer.parseInt(texto2.getText());
            soma = numero1 * numero2;
            exibir.setVisible(true);
            exibir.setText("A multiplicação é: "+soma);
            
        }
    }
);

dividir.addActionListener(
    new ActionListener(){
        public void actionPerformed(ActionEvent e){
            int numero1,numero2,soma;
            soma=0;
            numero1 = Integer.parseInt(texto1.getText());
            numero2 = Integer.parseInt(texto2.getText());
            soma = numero1 / numero2;
            exibir.setVisible(true);
            exibir.setText("A divisão é: "+soma);
            
        }
    }
);

exibir.setVisible(false);

tela.add(rotulo1); tela.add(rotulo2);
tela.add(texto1); tela.add(texto2);
tela.add(exibir); tela.add(somar);
tela.add(subtrair); tela.add(multiplicar);
tela.add(dividir);

setSize(400,250);
setVisible(true);
}
    public static void main(String args[]){
        Calculadora app = new Calculadora();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
