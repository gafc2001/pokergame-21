package pokergame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class game_inicio extends JFrame implements ActionListener {

    JButton btniniciar,btnregistrar;
    JLabel lbltitulo, lblimagen, lblimagen2;
    JPanel panel;

    public game_inicio() {

        /*lbltitulo = new JLabel("POKER GAME");
        lbltitulo.setBounds(400,100,600,100);
        lbltitulo.setFont(new Font("comic sans m", Font.BOLD,80));
        lbltitulo.setForeground(java.awt.Color.WHITE);*/
        setIconImage(new ImageIcon(getClass().getResource("imagenes/icono.png")).getImage());
        lblimagen = new JLabel(new ImageIcon(getClass().getResource("imagenes/poker.jpg")));
        lblimagen.setBounds(1, 1, 1386, 796);

        lblimagen2 = new JLabel(new ImageIcon(getClass().getResource("imagenes/blackjack.png")));
        lblimagen2.setBounds(410, 80, 540, 387);

        btniniciar = new JButton("INICIAR SESION");
        btniniciar.setBounds(325, 570, 300, 40);
        btniniciar.setFont(new Font("comic sans m", Font.BOLD, 20));
        btniniciar.addActionListener(this);
        
        btnregistrar = new JButton("REGISTAR");
        btnregistrar.setBounds(725, 570, 300, 40);
        btnregistrar.setFont(new Font("comic sans m", Font.BOLD, 20));
        btnregistrar.addActionListener(this);

        panel = new JPanel();
        panel.setLayout(null);
        panel.add(btniniciar);
        panel.add(btnregistrar);
        panel.add(lblimagen2);
        panel.add(lblimagen);

        add(panel);

        this.setExtendedState(MAXIMIZED_BOTH);
        setTitle("BLACK JACK");

        //setSize(1500,1080);
        setLocationRelativeTo(this);
        panel.setLayout(null);
        

    }

    public static void main(String[] args) {
        game_inicio form1 = new game_inicio();
        form1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btniniciar){
            game_iniciar form2= new game_iniciar();
            this.dispose();
            form2.setVisible(true);

        }
        if(e.getSource() == btnregistrar){
            game_registro form3= new game_registro();
            this.dispose();
            form3.setVisible(true);
        }

    }

}
