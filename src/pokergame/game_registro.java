package pokergame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class game_registro extends JFrame implements ActionListener{

    JLabel lbltitulo, lblnombre, lblusuario, lblcontraseña,lblimagen,lblmonto;
    JTextField txtnombre, txtusuario,txtmonto;
    JPasswordField txtcontraseña;
    JPanel panel;
    JButton btnregistrar,btnatras,btnmas,btnmenos;
    public static int monto=50;
    int aumento=10;
    
    public game_registro(){
        
        
        setIconImage(new ImageIcon(getClass().getResource("imagenes/icono.png")).getImage());
        
        lblimagen = new JLabel(new ImageIcon(getClass().getResource("imagenes/poker.jpg")));
        lblimagen.setBounds(1,1,1386,796);
        
        lbltitulo = new JLabel(new ImageIcon(getClass().getResource("imagenes/DISEÑO.png")));
        lbltitulo.setBounds(400, 30, 600, 100);

        lblnombre = new JLabel("NOMBRE");
        lblnombre.setBounds(400, 200, 200,30);
        lblnombre.setFont(new Font("verdana", Font.BOLD, 25));
        lblnombre.setForeground(new Color(255,81,0));
        
        lblusuario = new JLabel("USUARIO");
        lblusuario.setBounds(400, 300, 200, 20);
        lblusuario.setFont(new Font("verdana", Font.BOLD, 25));
        lblusuario.setForeground(new Color(255,81,0));

        lblcontraseña = new JLabel("CONTRASEÑA");
        lblcontraseña.setBounds(400, 400, 200, 30);
        lblcontraseña.setFont(new Font("verdana", Font.BOLD, 25));
        lblcontraseña.setForeground(new Color(255,81,0));
        
        lblmonto = new JLabel("MONTO");
        lblmonto.setBounds(400,500,200,30);
        lblmonto.setFont(new Font("comic sans m", Font.BOLD, 25));
        lblmonto.setForeground(new Color(255,81,0));
        
        txtnombre = new JTextField();
        txtnombre.setBounds(700, 200, 200, 30);
        txtnombre.setFont(new Font("comic sans m", Font.BOLD, 20));
        
        
        txtusuario = new JTextField();
        txtusuario.setBounds(700, 300, 200, 30);
        txtusuario.setFont(new Font("comic sans m", Font.BOLD, 20));
        
        txtcontraseña = new JPasswordField();
        txtcontraseña.setBounds(700, 400, 200, 30);
        txtcontraseña.setFont(new Font("comic sans m", Font.BOLD, 20));
        
        txtmonto = new JTextField("$ "+String.valueOf(monto));
        txtmonto.setBounds(700,500,200,30);
        txtmonto.setFont(new Font("comic sans m", Font.BOLD, 20));
        txtmonto.setEditable(false);
        
        btnmas = new JButton("+");
        btnmas.setBounds(910,500,50,30);
        btnmas.setFont(new Font("comic sans m", Font.BOLD, 20));
        btnmas.addActionListener(this);
        
        btnmenos = new JButton("-");
        btnmenos.setBounds(965,500,50,30);
        btnmenos.setFont(new Font("comic sans m", Font.BOLD, 20));
        btnmenos.addActionListener(this);
        
        
        btnregistrar = new JButton("REGISTRAR");
        btnregistrar.setBounds(450,600,200,30);
        btnregistrar.setFont(new Font("comic sans m", Font.BOLD, 20));
        btnregistrar.addActionListener(this);
        
        btnatras = new JButton("ATRAS");
        btnatras.setBounds(700,600,200,30);
        btnatras.setFont(new Font("comic sans m", Font.BOLD, 20));
        btnatras.addActionListener(this);
        

        
        
        
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.add(lbltitulo);
        panel.add(lblnombre);
        panel.add(lblusuario);
        panel.add(lblcontraseña);
        panel.add(lblmonto);      
        panel.add(txtnombre);
        panel.add(txtusuario);
        panel.add(txtmonto);
        panel.add(btnmas);
        panel.add(btnmenos);
        panel.add(btnregistrar);
        panel.add(btnatras);
        panel.add(txtcontraseña);
        panel.add(lblimagen);
        
        
        
        add(panel);
        setExtendedState(MAXIMIZED_BOTH);
        setTitle("BLACK JACK");

    }
   
    
    public static void main(String[] args) {
        game_inicio form1 = new game_inicio();
        form1.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==btnmas){
            monto+=aumento;
            
            txtmonto.setText("$ "+String.valueOf(monto));
            if (monto>=100){
                aumento=20;
                
            }
            if (monto>=200){
                aumento=50;
            }
            if (monto>=500){
                aumento=100;
            }
            
        }
        if(e.getSource()==btnmenos){
            if (monto>50){
            monto-=aumento;
            txtmonto.setText("$ "+String.valueOf(monto));
            }
        }
        if (e.getSource()==btnatras){
            game_inicio form1= new game_inicio();
            this.dispose();
            form1.setVisible(true);
            aumento=10;
        }
        if (e.getSource()==btnregistrar){
            if (validar()){
                agregarRegistro();
                game_iniciar form1=new game_iniciar();
                this.dispose();
                form1.setVisible(true);
                aumento=10;
                
            }
        }
        
            
            
        
    }
    boolean validar(){
        boolean val=false;
        if(txtnombre.getText().isEmpty() || !txtusuario.getText().isEmpty() || !txtcontraseña.getText().isEmpty()){
            val=true;
        }
        else{
            val=false;
            JOptionPane.showMessageDialog(null,"Llene todos los campos, POR FAVOR!!");
        }
        
        return val;
    }
    void agregarRegistro(){
        informacion.nombres.add(txtnombre.getText());
        informacion.usuarios.add(txtusuario.getText());
        informacion.contraseñas.add(txtcontraseña.getText());
        informacion.montos.add(monto);
          
    }
}
