package pokergame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;


public class game_play extends JFrame implements ActionListener, MouseListener {

    JLabel lblficha1, lblficha2, lblficha3, lblficha4, lblapuesta, lblmonto, lblimagen,lblficha5, lblficha6, lblficha7, lblficha8;
    JLabel lblcarta1, lblcarta2, lblcarta3, lblcarta4, lblcarta5, lblcarta6, lblcarta7, lblcarta8;
    JLabel lblnombre, lblusuaro, lbltotal1, lbltotal2;
    JTextField txtapuesta, txtmonto, txtnombre, txtusuario;
    JPanel panel, panel2;
    JButton btnlimpiar, btnapostar, btnpedir, btnplantar, btnmenu;
    int apuesta = 0;
    int temp = 1;
    int intentos = 1;
    int total1 = 0;
    int total2 = 0;

    public game_play() {
        
        
        setIconImage(new ImageIcon(getClass().getResource("imagenes/icono.png")).getImage());

        setExtendedState(MAXIMIZED_BOTH);
        setTitle("BLACK JACK");

        lblimagen = new JLabel(new ImageIcon(getClass().getResource("imagenes/poker.jpg")));
        lblimagen.setBounds(1, 1, 1386, 796);

        lblnombre = new JLabel("NOMBRE");
        lblnombre.setBounds(30, 10, 200, 30);
        lblnombre.setFont(new Font("verdana", Font.BOLD, 20));

        lblusuaro = new JLabel("USUARIO");
        lblusuaro.setBounds(30, 60, 200, 30);
        lblusuaro.setFont(new Font("verdana", Font.BOLD, 20));

        txtnombre = new JTextField(informacion.nombre);
        txtnombre.setBounds(220, 10, 220, 40);
        txtnombre.setFont(new Font("verdana", Font.BOLD, 20));
        txtnombre.setEditable(false);

        txtusuario = new JTextField(informacion.usuario);
        txtusuario.setBounds(220, 60, 220, 40);
        txtusuario.setFont(new Font("verdana", Font.BOLD, 20));
        txtusuario.setEditable(false);

        lbltotal1 = new JLabel("0");
        lbltotal1.setBounds(35, 240, 80, 80);
        lbltotal1.setFont(new Font("verdana", Font.BOLD, 40));
        lbltotal1.setForeground(Color.white);

        lbltotal2 = new JLabel("0");
        lbltotal2.setBounds(1250, 240, 80, 80);
        lbltotal2.setFont(new Font("verdana", Font.BOLD, 40));
        lbltotal2.setForeground(Color.white);

        lblcarta1 = new JLabel(new ImageIcon(getClass().getResource("imagenes/as-corazones.jpg")));
        lblcarta1.setBounds(170, 200, 101, 139);
        lblcarta1.hide();

        lblcarta2 = new JLabel(new ImageIcon(getClass().getResource("imagenes/as-corazones.jpg")));
        lblcarta2.setBounds(280, 200, 101, 139);
        lblcarta2.hide();

        lblcarta3 = new JLabel(new ImageIcon(getClass().getResource("imagenes/as-corazones.jpg")));
        lblcarta3.setBounds(390, 200, 101, 139);
        lblcarta3.hide();

        lblcarta4 = new JLabel(new ImageIcon(getClass().getResource("imagenes/as-corazones.jpg")));
        lblcarta4.setBounds(500, 200, 101, 139);
        lblcarta4.hide();

        lblcarta5 = new JLabel(new ImageIcon(getClass().getResource("imagenes/as-corazones.png")));
        lblcarta5.setBounds(720, 200, 101, 139);
        lblcarta5.hide();

        lblcarta6 = new JLabel(new ImageIcon(getClass().getResource("imagenes/as-corazones.jpg")));
        lblcarta6.setBounds(830, 200, 101, 139);
        lblcarta6.hide();

        lblcarta7 = new JLabel(new ImageIcon(getClass().getResource("imagenes/as-corazones.jpg")));
        lblcarta7.setBounds(940, 200, 101, 139);
        lblcarta7.hide();

        lblcarta8 = new JLabel(new ImageIcon(getClass().getResource("imagenes/as-corazones.jpg")));
        lblcarta8.setBounds(1050, 200, 101, 139);
        lblcarta8.hide();

        lblficha1 = new JLabel(new ImageIcon(getClass().getResource("imagenes/ficha-20.png")));
        lblficha1.setBounds(10, 530, 100, 100);
        lblficha1.addMouseListener(this);

        lblficha2 = new JLabel(new ImageIcon(getClass().getResource("imagenes/ficha-50.png")));
        lblficha2.setBounds(110, 530, 100, 100);
        lblficha2.addMouseListener(this);

        lblficha3 = new JLabel(new ImageIcon(getClass().getResource("imagenes/ficha-100.png")));
        lblficha3.setBounds(210, 530, 100, 100);
        lblficha3.addMouseListener(this);

        lblficha4 = new JLabel(new ImageIcon(getClass().getResource("imagenes/ficha-200.png")));
        lblficha4.setBounds(310, 530, 100, 100);
        lblficha4.addMouseListener(this);
        
        lblficha5 = new JLabel(new ImageIcon(getClass().getResource("imagenes/ficha-20.png")));
        lblficha5.setBounds(10, 530, 100, 100);
        lblficha5.hide();


        lblficha6 = new JLabel(new ImageIcon(getClass().getResource("imagenes/ficha-50.png")));
        lblficha6.setBounds(110, 530, 100, 100);
        lblficha6.hide();


        lblficha7 = new JLabel(new ImageIcon(getClass().getResource("imagenes/ficha-100.png")));
        lblficha7.setBounds(210, 530, 100, 100);
        lblficha7.hide();


        lblficha8 = new JLabel(new ImageIcon(getClass().getResource("imagenes/ficha-200.png")));
        lblficha8.setBounds(310, 530, 100, 100);
        lblficha8.hide();

        lblapuesta = new JLabel("APUESTA");
        lblapuesta.setBounds(50, 430, 200, 40);
        lblapuesta.setFont(new Font("verdana", Font.BOLD, 20));

        lblmonto = new JLabel("MONTO");
        lblmonto.setBounds(50, 480, 200, 40);
        lblmonto.setFont(new Font("verdana", Font.BOLD, 20));

        txtapuesta = new JTextField("$ 0");
        txtapuesta.setBounds(200, 430, 200, 40);
        txtapuesta.setFont(new Font("comic sans m", Font.BOLD, 20));
        txtapuesta.setEditable(false);

        txtmonto = new JTextField("$ " + String.valueOf(informacion.monto));
        txtmonto.setBounds(200, 480, 200, 40);
        txtmonto.setFont(new Font("comic sans m", Font.BOLD, 20));
        txtmonto.setEditable(false);

        btnlimpiar = new JButton("LIMPIAR");
        btnlimpiar.setBounds(110, 650, 200, 40);
        btnlimpiar.addActionListener(this);
        btnlimpiar.setFont(new Font("comic sans m", Font.BOLD, 20));
        btnlimpiar.setBorder(null);
        btnlimpiar.setBackground(new Color(255,135,0));
        btnlimpiar.addMouseListener(this);

        btnapostar = new JButton("APOSTAR");
        btnapostar.setBounds(500, 650, 200, 40);
        btnapostar.addActionListener(this);
        btnapostar.setFont(new Font("comic sans m", Font.BOLD, 20));
        btnapostar.setBorder(null);
        btnapostar.setBackground(new Color(255,135,0));
        btnapostar.addMouseListener(this);

        btnpedir = new JButton("PEDIR CARTA");
        btnpedir.setBounds(700, 650, 200, 40);
        btnpedir.addActionListener(this);
        btnpedir.setFont(new Font("comic sans m", Font.BOLD, 20));
        btnpedir.setEnabled(false);
        btnpedir.setBorder(null);
        btnpedir.setBackground(new Color(255,135,0));
        btnpedir.addMouseListener(this);
        btnpedir.setForeground(Color.BLACK);

        btnplantar = new JButton("PLANTARSE");
        btnplantar.setBounds(900, 650, 200, 40);
        btnplantar.addActionListener(this);
        btnplantar.setFont(new Font("comic sans m", Font.BOLD, 20));
        btnplantar.setEnabled(false);
        btnplantar.setBorder(null);
        btnplantar.setBackground(new Color(255,135,0));
        btnplantar.addMouseListener(this);

        btnmenu = new JButton("MENU");
        btnmenu.setBounds(1150, 650, 200, 40);
        btnmenu.addActionListener(this);
        btnmenu.setFont(new Font("comic sans m", Font.BOLD, 20));
        btnmenu.setBorder(null);
        btnmenu.setBackground(new Color(255,135,0));
        btnmenu.addMouseListener(this);

        panel = new JPanel();
        panel.setLayout(null);

        //agregando imagenes de las cartas de poker
        panel.add(lblcarta1);
        panel.add(lblcarta2);
        panel.add(lblcarta3);
        panel.add(lblcarta4);
        panel.add(lblcarta5);
        panel.add(lblcarta6);
        panel.add(lblcarta7);
        panel.add(lblcarta8);

        //fichas de 20,50,100 y 200 dolares
        panel.add(lblficha1);
        panel.add(lblficha2);
        panel.add(lblficha3);
        panel.add(lblficha4);
        
        panel.add(lblficha5);
        panel.add(lblficha6);
        panel.add(lblficha7);
        panel.add(lblficha8);

        panel.add(lblnombre);
        panel.add(lblusuaro);
        panel.add(lblmonto);
        panel.add(lblapuesta);
        panel.add(lbltotal1);
        panel.add(lbltotal2);
        panel.add(txtapuesta);
        panel.add(txtmonto);
        panel.add(txtnombre);
        panel.add(txtusuario);

        //Botones
        panel.add(btnlimpiar);
        panel.add(btnapostar);
        panel.add(btnpedir);
        panel.add(btnplantar);
        panel.add(btnmenu);
        panel.add(lblimagen);

        add(panel);

    }

    public static void main(String[] args) {
        game_play form4 = new game_play();
        form4.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnlimpiar) {
            txtapuesta.setText("$ 0");
            informacion.monto += apuesta;
            apuesta = 0;
            txtmonto.setText("$ " + (informacion.monto));
        }
        if (e.getSource() == btnapostar) {
            if (apuesta > 30) {
                btnapostar.setEnabled(false);
                btnpedir.setEnabled(true);
                btnplantar.setEnabled(true);
                btnlimpiar.setEnabled(false);
                lblficha1.hide();
                lblficha2.hide();
                lblficha3.hide();
                lblficha4.hide();
                lblficha5.show();
                lblficha6.show();
                lblficha7.show();
                lblficha8.show();
            } else {
                JOptionPane.showMessageDialog(null, "La apuesta debe ser mayor a 30,\n queremos robarte tu plata");
            }

        }

        if (e.getSource() == btnpedir) {
            numRandom form4 = new numRandom();
            int x = form4.NumRandom();
            total1 += x;
            String carta = form4.carta(x);
            if (intentos == 1) {
                lblcarta1.show();
                lblcarta1.setIcon(new ImageIcon(getClass().getResource(carta)));
                lbltotal1.setText(String.valueOf(total1));
            }
            if (intentos == 2) {
                lblcarta2.show();
                lblcarta2.setIcon(new ImageIcon(getClass().getResource(carta)));
                lbltotal1.setText(String.valueOf(total1));
            }
            if (intentos == 3) {
                lblcarta3.show();
                lblcarta3.setIcon(new ImageIcon(getClass().getResource(carta)));
                lbltotal1.setText(String.valueOf(total1));
            }
            if (intentos == 4) {
                lblcarta4.show();
                lblcarta4.setIcon(new ImageIcon(getClass().getResource(carta)));
                lbltotal1.setText(String.valueOf(total1));
            }

            intentos++;
            if (total1 == 21) {
                ganar();
                resetear();
                System.out.println("1");

            } else if (total1 > 21) {
                perder();
                resetear();
                System.out.println("2");
            }
        }
        if (e.getSource() == btnplantar) {
            jugarComputadora();
            System.out.println("3");
        }
        if (e.getSource() == btnmenu) {
            game_inicio form1 = new game_inicio();
            form1.setVisible(true);
            this.dispose();
        }
    }

    @Override
    public void mouseClicked(MouseEvent m) {

        if (m.getSource() == lblficha1) {
            if (informacion.monto > 20) {
                apuesta += 20;
                informacion.monto -= 20;
                txtapuesta.setText("$ " + String.valueOf(apuesta));
                txtmonto.setText("$ " + String.valueOf(informacion.monto));
            }
        }
        if (m.getSource() == lblficha2) {
            if (informacion.monto > 50) {
                apuesta += 50;
                informacion.monto -= 50;
                txtapuesta.setText("$ " + String.valueOf(apuesta));
                txtmonto.setText("$ " + String.valueOf(informacion.monto));
            }
        }
        if (m.getSource() == lblficha3) {
            if (informacion.monto > 100) {
                apuesta += 100;
                informacion.monto -= 100;
                txtapuesta.setText("$ " + String.valueOf(apuesta));
                txtmonto.setText("$ " + String.valueOf(informacion.monto));
            }
        }
        if (m.getSource() == lblficha4) {
            if (informacion.monto > 200) {
                apuesta += 200;
                informacion.monto -= 200;
                txtapuesta.setText("$ " + String.valueOf(apuesta));
                txtmonto.setText("$ " + String.valueOf(informacion.monto));
            }
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()==btnlimpiar){
            btnlimpiar.setBackground(new Color(255,180,0));
        }
        if(e.getSource()==btnapostar){
            btnapostar.setBackground(new Color(255,180,0));
        }
        if(e.getSource()==btnpedir){
            btnpedir.setBackground(new Color(255,180,0));
        }
        if(e.getSource()==btnplantar){
            btnplantar.setBackground(new Color(255,180,0));
        }
        if(e.getSource()==btnmenu){
            btnmenu.setBackground(new Color(255,180,0));
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource()==btnlimpiar){
            btnlimpiar.setBackground(new Color(255,135,0));
        }
        if(e.getSource()==btnapostar){
            btnapostar.setBackground(new Color(255,135,0));
        }
        if(e.getSource()==btnpedir){
            btnpedir.setBackground(new Color(255,135,0));
        }
        if(e.getSource()==btnplantar){
            btnplantar.setBackground(new Color(255,135,0));
        }
        if(e.getSource()==btnmenu){
            btnmenu.setBackground(new Color(255,135,0));
        }


    }

    void jugarComputadora() {
        numRandom form4 = new numRandom();
        int x = form4.NumRandom();
        String carta = form4.carta(x);
        for (int i = 1; i < 4; i++) {
            x = form4.NumRandom();
            total2 += x;
            carta = form4.carta(x);
            if (i == 1) {
                lblcarta5.show();
                lblcarta5.setIcon(new ImageIcon(getClass().getResource(carta)));
                lbltotal2.setText(String.valueOf(total2));
            }
            if (i == 2) {
                lblcarta6.show();
                lblcarta6.setIcon(new ImageIcon(getClass().getResource(carta)));
                lbltotal2.setText(String.valueOf(total2));
            }
            if (i == 3) {
                lblcarta7.show();
                lblcarta7.setIcon(new ImageIcon(getClass().getResource(carta)));
                lbltotal2.setText(String.valueOf(total2));
            }
            if (i == 4) {
                lblcarta8.show();
                lblcarta8.setIcon(new ImageIcon(getClass().getResource(carta)));
                lbltotal2.setText(String.valueOf(total2));
            }

        }
        if (total2 < 21) {
            if (total1 > total2) {
                ganar();
                resetear();
                System.out.println("5");
            } else if (total1 == total2) {
                JOptionPane.showMessageDialog(null, "EMPATE");
                informacion.monto += apuesta;
                apuesta = 0;
                txtapuesta.setText("$ 0");
                txtmonto.setText("$ " + informacion.monto);
                resetear();
                System.out.println("6");
            } else {
                perder();
                resetear();
                System.out.println("7");
            }
        } else if (total2 == 21) {
            perder();
            resetear();
            System.out.println("8");
        } else {
            ganar();
        }
        ocultarCartas();
    }

    void resetear() {
        btnlimpiar.setEnabled(true);
        btnapostar.setEnabled(true);
        btnpedir.setEnabled(false);
        btnplantar.setEnabled(false);
        lbltotal1.setText("0");
        lbltotal2.setText("0");
        total1 = 0;
        total2 = 0;
        intentos = 1;
        lblficha1.show();
        lblficha2.show();
        lblficha3.show();
        lblficha4.show();
        lblficha5.hide();
        lblficha6.hide();
        lblficha7.hide();
        lblficha8.hide();
    }

    void ganar() {
        JOptionPane.showMessageDialog(null, "GANO ESTA RONDA");
        txtapuesta.setText("$ 0");
        informacion.monto += apuesta * 2;
        txtmonto.setText("$ " + informacion.monto);
        ocultarCartas();
        resetear();
        apuesta = 0;
    }

    void perder() {
        JOptionPane.showMessageDialog(null, "PERDIO ESTA RONDA RONDA");
        txtapuesta.setText("$ 0");
        ocultarCartas();
        apuesta = 0;
        resetear();
    }

    void ocultarCartas() {
        lblcarta1.hide();
        lblcarta2.hide();
        lblcarta3.hide();
        lblcarta4.hide();
        lblcarta5.hide();
        lblcarta6.hide();
        lblcarta7.hide();
        lblcarta8.hide();
        
    }

}
























//Gustavo Farfan Coraje