package AtividadeEntrega;

import javax.swing.*;
import java.awt.*;
import java.text.*;
import javax.swing.text.*;

public class Cadastro extends JFrame {
    
    JLabel jlbtitulo,jlbnome, jlbidade, jlbtel, jlbcelular, jlbcpf, jlbendereco, jlbcep, jlbestado;
    JTextField jtfnome, jtfidade, jtfendereco, jtfestado;
    JFormattedTextField jftftel, jftfcelular, jftfcpf, jftfcep;
    MaskFormatter mftel, mfcelular, mfcpf, mfcep;
    JButton jb1,jb2,jb3;
   
    Cadastro(){
        super("Cadastro de Clientes");
        Container tela = getContentPane();
        setLayout(null);
        
        
        jlbtitulo = new JLabel("Cadastro de Clientes");
        jlbnome = new JLabel("Nome:");
        jlbidade = new JLabel("Idade:");
        jlbtel = new JLabel("Telefone:");
        jlbcelular = new JLabel("Celular:");
        jlbcpf = new JLabel("CPF:");
        jlbendereco = new JLabel("Endereço:");
        jlbcep = new JLabel("CEP:");
        jlbestado = new JLabel("Estado:");
        
        jlbtitulo.setFont(new Font("Arial",Font.BOLD,16));
        jlbnome.setFont(new Font("Arial",Font.BOLD,14));
        jlbidade.setFont(new Font("Arial",Font.BOLD,14));
        jlbtel.setFont(new Font("Arial",Font.BOLD,14));
        jlbcelular.setFont(new Font("Arial",Font.BOLD,14));
        jlbcpf.setFont(new Font("Arial",Font.BOLD,14));
        jlbendereco.setFont(new Font("Arial",Font.BOLD,14));
        jlbcep.setFont(new Font("Arial",Font.BOLD,14));
        jlbestado.setFont(new Font("Arial",Font.BOLD,14));
        
        jlbtitulo.setForeground(Color.blue);
        
        jlbtitulo.setBounds(125,5,250,20);
        jlbnome.setBounds(50,50,60,20);
        jlbidade.setBounds(50,80,60,20);
        jlbtel.setBounds(50,110,80,20);
        jlbcelular.setBounds(50,140,80,20);
        jlbcpf.setBounds(50,170,60,20);
        jlbendereco.setBounds(50,200,80,20);
        jlbcep.setBounds(50,230,60,20);
        jlbestado.setBounds(50,260,60,20);
                
        tela.add(jlbtitulo);
        tela.add(jlbnome);
        tela.add(jlbidade);
        tela.add(jlbtel);
        tela.add(jlbcelular);
        tela.add(jlbcpf);
        tela.add(jlbendereco);
        tela.add(jlbcep);
        tela.add(jlbestado);
        
        
        
        jtfnome = new JTextField();        
        jtfidade = new JTextField();
        jtfestado = new JTextField();
        jtfendereco = new JTextField();
        
        jtfnome.setBounds(150,50,250,20);
        jtfidade.setBounds(150,80,25,20);
        jtfendereco.setBounds(150,200,250,20);
        jtfestado.setBounds(150,260,20,20);
        
        
        tela.add(jtfnome);
        tela.add(jtfidade);
        tela.add(jtfestado);
        tela.add(jtfendereco);
        
        
        
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
        
        jftfcelular = new JFormattedTextField(mfcelular);
        jftfcep = new JFormattedTextField(mfcep);
        jftfcpf = new JFormattedTextField(mfcpf);
        jftftel = new JFormattedTextField(mftel);
        
        jftftel.setBounds(150,110,90,20);
        jftfcelular.setBounds(150,140,95,20);
        jftfcpf.setBounds(150,170,95,20);
        jftfcep.setBounds(150,230,70,20);
        
        tela.add(jftftel);
        tela.add(jftfcpf);
        tela.add(jftfcep);
        tela.add(jftfcelular);
        
        
        
        ImageIcon icone1 = new ImageIcon("sign-in.png"); 
        setIconImage(icone1.getImage());
        ImageIcon icone2 = new ImageIcon("sign-out.png"); 
        setIconImage(icone2.getImage());
        
        jb1= new JButton("Voltar",icone2);
        jb2= new JButton("Cadastrar");
        jb3= new JButton("Próximo",icone1);
        
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

