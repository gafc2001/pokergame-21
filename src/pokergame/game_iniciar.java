package pokergame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class game_iniciar extends JFrame implements ActionListener {

    private JLabel lbltitulo, lblusuario, lblcontraseña, lblimagen, lblnombre, lblmonto;
    private JTextField txtusuario, txtnombre, txtmonto;
    private JPasswordField txtcontraseña;
    private JPanel panel;
    private JButton btnmas, btnmenos, btnvalidar, btneditar, btnguardar, btnjugar, btnatras;
    int monto;

    public game_iniciar() {

        setIconImage(new ImageIcon(getClass().getResource("imagenes/icono.png")).getImage());

        lblimagen = new JLabel(new ImageIcon(getClass().getResource("imagenes/poker.jpg")));
        lblimagen.setBounds(1, 1, 1386, 796);

        lbltitulo = new JLabel(new ImageIcon(getClass().getResource("imagenes/titulo2.png")));
        lbltitulo.setBounds(350, 30, 685, 75);

        lblusuario = new JLabel("USUARIO");
        lblusuario.setBounds(400, 200, 300, 30);
        lblusuario.setFont(new Font("verdana", Font.BOLD, 30));
        lblusuario.setForeground(new Color(255, 81, 0));

        txtusuario = new JTextField();
        txtusuario.setBounds(700, 200, 300, 30);
        txtusuario.setFont(new Font("comic sans m", Font.BOLD, 30));

        lblcontraseña = new JLabel("CONTRASEÑA");
        lblcontraseña.setBounds(400, 300, 300, 30);
        lblcontraseña.setFont(new Font("verdana", Font.BOLD, 30));
        lblcontraseña.setForeground(new Color(255, 81, 0));

        txtcontraseña = new JPasswordField();
        txtcontraseña.setBounds(700, 300, 300, 30);
        txtcontraseña.setFont(new Font("comic sans m", Font.BOLD, 30));

        lblnombre = new JLabel("NOMBRE");
        lblnombre.setBounds(400, 400, 300, 30);
        lblnombre.setFont(new Font("comic sans m", Font.BOLD, 30));
        lblnombre.setForeground(new Color(255, 81, 0));
        lblnombre.hide();

        txtnombre = new JTextField();
        txtnombre.setBounds(700, 400, 300, 30);
        txtnombre.setFont(new Font("comic sans m", Font.BOLD, 30));
        txtnombre.setEditable(false);
        txtnombre.hide();

        lblmonto = new JLabel("MONTO");
        lblmonto.setBounds(400, 500, 300, 30);
        lblmonto.setFont(new Font("verdana", Font.BOLD, 30));
        lblmonto.setForeground(new Color(255, 81, 0));
        lblmonto.hide();

        txtmonto = new JTextField("$ 0");
        txtmonto.setBounds(700, 500, 300, 30);
        txtmonto.setFont(new Font("comic sans m", Font.BOLD, 30));
        txtmonto.setEditable(false);
        txtmonto.hide();

        btnmas = new JButton("+");
        btnmas.setBounds(1010, 500, 50, 30);
        btnmas.setFont(new Font("comic sans m", Font.BOLD, 20));
        btnmas.addActionListener(this);
        btnmas.hide();

        btnmenos = new JButton("-");
        btnmenos.setBounds(1065, 500, 50, 30);
        btnmenos.setFont(new Font("comic sans m", Font.BOLD, 20));
        btnmenos.addActionListener(this);
        btnmenos.hide();

        btnvalidar = new JButton("VALIDAR");
        btnvalidar.setBounds(350, 600, 150, 25);
        btnvalidar.setFont(new Font("comic sans m", Font.BOLD, 20));
        btnvalidar.addActionListener(this);

        btneditar = new JButton("EDITAR");
        btneditar.setBounds(525, 600, 150, 25);
        btneditar.setFont(new Font("comic sans m", Font.BOLD, 20));
        btneditar.addActionListener(this);
        btneditar.setEnabled(false);

        btnguardar = new JButton("GUARDAR");
        btnguardar.setBounds(700, 600, 150, 25);
        btnguardar.setFont(new Font("comic sans m", Font.BOLD, 20));
        btnguardar.addActionListener(this);
        btnguardar.setEnabled(false);

        btnjugar = new JButton("JUGAR");
        btnjugar.setBounds(875, 600, 150, 25);
        btnjugar.setFont(new Font("comic sans m", Font.BOLD, 20));
        btnjugar.addActionListener(this);
        btnjugar.setEnabled(false);

        btnatras = new JButton("ATRAS");
        btnatras.setBounds(1150, 600, 150, 25);
        btnatras.setFont(new Font("comic sans m", Font.BOLD, 20));
        btnatras.addActionListener(this);

        panel = new JPanel();
        panel.setLayout(null);
        panel.add(lbltitulo);
        panel.add(lblusuario);
        panel.add(txtusuario);
        panel.add(lblcontraseña);
        panel.add(txtcontraseña);
        panel.add(lblnombre);
        panel.add(txtnombre);
        panel.add(lblmonto);
        panel.add(txtmonto);
        panel.add(btnmas);
        panel.add(btnmenos);
        panel.add(btnvalidar);
        panel.add(btneditar);
        panel.add(btnguardar);
        panel.add(btnjugar);
        panel.add(btnatras);
        panel.add(lblimagen);

        add(panel);
        setExtendedState(MAXIMIZED_BOTH);
        setTitle("BLACK JACK");

    }

    public static void main(String[] args) {
        game_iniciar form1 = new game_iniciar();
        form1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnmas) {
            monto += 10;
            txtmonto.setText("$ " + String.valueOf(monto));
        }
        if (e.getSource() == btnmenos) {
            monto -= 10;
            txtmonto.setText("$ " + String.valueOf(monto));
        }
        if (e.getSource() == btnvalidar) {
            if (validar()) {

                txtnombre.setText(String.valueOf(informacion.nombre));
                monto = informacion.monto;
                txtmonto.setText(String.valueOf("$ " + informacion.monto));             
                ActivarDesactivar(true);
                btnmenos.hide();
                btnmas.hide();
            }
        }
        if (e.getSource() == btneditar) {
            ActivarDesactivar(true);
        }
        if (e.getSource() == btnjugar) {
            game_play form4 = new game_play();
            this.dispose();
            form4.setVisible(true);

        }
        if (e.getSource() == btnguardar) {
            guardar();
            ActivarDesactivar(false);

        }
        if (e.getSource() == btnatras) {
            game_inicio form1 = new game_inicio();
            this.dispose();
            form1.setVisible(true);
        }

    }

    void ActivarDesactivar(boolean estado) {
        if (estado) {
            lblnombre.show();
            lblmonto.show();
            txtnombre.show();
            txtmonto.show();
            btneditar.setEnabled(true);
            btnguardar.setEnabled(true);
            btnjugar.setEnabled(true);
            txtnombre.setEditable(true);
            txtusuario.setEditable(true);
            txtcontraseña.setEditable(true);
            txtmonto.setEditable(true);
            btnmas.show();
            btnmenos.show();
            btnmenos.setEnabled(true);
            btnmas.setEnabled(true);
        } else {
            txtnombre.setEditable(false);
            txtusuario.setEditable(false);
            txtcontraseña.setEditable(false);
            txtmonto.setEditable(false);
            btnmas.setEnabled(false);
            btnmenos.setEnabled(false);
        }
    }

    boolean validar() {
        boolean val = false;
        int indice = informacion.usuarios.indexOf(txtusuario.getText());
        if (indice != -1 && informacion.contraseñas.get(indice).equals(txtcontraseña.getText())) {
            informacion.nombre = informacion.nombres.get(indice);
            informacion.usuario = informacion.usuarios.get(indice);
            informacion.monto = informacion.montos.get(indice);
            val = true;
        } else {
            JOptionPane.showMessageDialog(null, "USUARIO O CONTRASEÑA INCORRECTA");
        }
        return val;

    }

    void guardar() {
        if (txtnombre.getText().isEmpty() || !txtusuario.getText().isEmpty() || !txtcontraseña.getText().isEmpty()) {
            int indice = informacion.usuarios.indexOf(txtusuario.getText());
            informacion.nombres.set(indice, txtnombre.getText());
            informacion.usuarios.set(indice, txtnombre.getText());
            informacion.contraseñas.set(indice, txtnombre.getText());
            informacion.montos.set(indice, monto);
            informacion.nombre = txtnombre.getText();
            informacion.usuario = txtusuario.getText();
            informacion.monto = monto;
            JOptionPane.showMessageDialog(null, "LOS DATOS FUERON GUARDADOS CON EXITO");
            btnmas.hide();
            btnmenos.hide();

        } else {

            JOptionPane.showMessageDialog(null, "Llene todos los campos, POR FAVOR!!");
        }
    }

}
