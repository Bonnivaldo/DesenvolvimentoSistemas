package AtividadeEntrega;

import javax.swing.*;
import java.awt.*;
import java.text.*;
import javax.swing.text.*;

public class Cadastro extends JFrame {
    
    JLabel jltitulo,jlnome, jlidade, jltel, jlcelular, jlcpf, jlendereco, jlcep, jlestado;
    JTextField jtnome, jtidade, jtendereco, jtestado;
    JFormattedTextField jftel, jfcelular, jfcpf, jfcep;
    MaskFormatter mftel, mfcelular, mfcpf, mfcep;
    JButton jb1,jb2,jb3;
   
    Cadastro(){
        super("Cadastro de Clientes");
        Container tela = getContentPane();
        setLayout(null);
        
        
        jltitulo = new JLabel("Cadastro de Clientes");
        jlnome = new JLabel("Nome:");
        jlidade = new JLabel("Idade:");
        jltel = new JLabel("Telefone:");
        jlcelular = new JLabel("Celular:");
        jlcpf = new JLabel("CPF:");
        jlendereco = new JLabel("Endereço:");
        jlcep = new JLabel("CEP:");
        jlestado = new JLabel("Estado:");
        
        jltitulo.setFont(new Font("Arial",Font.BOLD,16));
        jlnome.setFont(new Font("Arial",Font.BOLD,14));
        jlidade.setFont(new Font("Arial",Font.BOLD,14));
        jltel.setFont(new Font("Arial",Font.BOLD,14));
        jlcelular.setFont(new Font("Arial",Font.BOLD,14));
        jlcpf.setFont(new Font("Arial",Font.BOLD,14));
        jlendereco.setFont(new Font("Arial",Font.BOLD,14));
        jlcep.setFont(new Font("Arial",Font.BOLD,14));
        jlestado.setFont(new Font("Arial",Font.BOLD,14));
        
        jltitulo.setForeground(Color.blue);
        
        jltitulo.setBounds(125,5,250,20);
        jlnome.setBounds(50,50,60,20);
        jlidade.setBounds(50,80,60,20);
        jltel.setBounds(50,110,80,20);
        jlcelular.setBounds(50,140,80,20);
        jlcpf.setBounds(50,170,60,20);
        jlendereco.setBounds(50,200,80,20);
        jlcep.setBounds(50,230,60,20);
        jlestado.setBounds(50,260,60,20);
                
        tela.add(jltitulo);
        tela.add(jlnome);
        tela.add(jlidade);
        tela.add(jltel);
        tela.add(jlcelular);
        tela.add(jlcpf);
        tela.add(jlendereco);
        tela.add(jlcep);
        tela.add(jlestado);
        
        
        
        jtnome = new JTextField();        
        jtidade = new JTextField();
        jtestado = new JTextField();
        jtendereco = new JTextField();
        
        jtnome.setBounds(150,50,250,20);
        jtidade.setBounds(150,80,25,20);
        jtendereco.setBounds(150,200,250,20);
        jtestado.setBounds(150,260,20,20);
        
        
        tela.add(jtnome);
        tela.add(jtidade);
        tela.add(jtestado);
        tela.add(jtendereco);
        
        
        
        try{
            mftel = new MaskFormatter("(##)####-####");
            mfcpf = new MaskFormatter("###.###.###-##");
            mfcelular = new MaskFormatter("(##)#####-####");
            mfcep = new MaskFormatter("#####-###");
            
            mfcelular.setPlaceholderCharacter('_');
            mfcep.setPlaceholderCharacter('_');
            mftel.setPlaceholderCharacter('_');
            mfcpf.setPlaceholderCharacter('_');
            
        }
        catch(ParseException excp){}
        
        jfcelular = new JFormattedTextField(mfcelular);
        jfcep = new JFormattedTextField(mfcep);
        jfcpf = new JFormattedTextField(mfcpf);
        jftel = new JFormattedTextField(mftel);
        
        jftel.setBounds(150,110,90,20);
        jfcelular.setBounds(150,140,95,20);
        jfcpf.setBounds(150,170,95,20);
        jfcep.setBounds(150,230,70,20);
        
        tela.add(jftel);
        tela.add(jfcpf);
        tela.add(jfcep);
        tela.add(jfcelular);
        
        
        
        ImageIcon icone1 = new ImageIcon("skip_backward_16x16.gif"); 
        setIconImage(icone1.getImage());
        ImageIcon icone2 = new ImageIcon("skip_forward_16x16.gif"); 
        setIconImage(icone2.getImage());
        ImageIcon icone3 = new ImageIcon("user8_(edit)_16x16.gif"); 
        setIconImage(icone3.getImage());
        
        jb1= new JButton("Voltar",icone1);
        jb2= new JButton("Cadastrar");
        jb3= new JButton("Próximo",icone2);
        
        jb1.setBounds(50,300,120,20);
        jb2.setBounds(200,300,120,20);
        jb3.setBounds(350,300,120,20);
        
        tela.add(jb1);
        tela.add(jb2);
        tela.add(jb3);
        
        
        
        
        setSize(500,400);
        setVisible(true);
        setLocationRelativeTo(null);
        
    } 
    public static void main(String args[]){
        Cadastro app = new Cadastro();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

