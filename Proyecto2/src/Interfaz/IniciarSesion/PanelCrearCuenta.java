package Interfaz.IniciarSesion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelCrearCuenta extends JPanel implements ActionListener{

    private static final String CANCELAR = "CANCELAR";
	private static final String CONFIRMAR = "CONFIRMAR";

    private JLabel txtBienvenida;
    private JLabel txtUsuario;
    private JLabel txtContrasenia;
    private JLabel txtConfirmar;
    private JTextField txtFUsuario;
    private JPasswordField txtFContrasenia;
    private JPasswordField txtFConfirmarContrasenia;
    private JButton btnCancelar;
    private JButton btnConfirmar;
    
    private VentanaIniciarSesion padreIniciarSesion;

    
    public PanelCrearCuenta(VentanaIniciarSesion ventanaIniciarSesion) {
        
        this.padreIniciarSesion = ventanaIniciarSesion;

        setPreferredSize(new Dimension(1000,600));
        setSize(getPreferredSize());
        setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(new Color(51, 171, 249));

        this.txtBienvenida = new JLabel("Crear Cuenta Nueva");
        txtBienvenida.setFont(new Font("Serif", Font.BOLD, 32));
        txtBienvenida.setForeground(Color.WHITE);
        txtBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
        txtBienvenida.setSize(600,200);
        txtBienvenida.setMaximumSize(new Dimension(600,100));
        txtBienvenida.setAlignmentX(CENTER_ALIGNMENT);

        this.txtUsuario = new JLabel("Nombre usuario:");
        txtUsuario.setMaximumSize(new Dimension(200,50));
        txtUsuario.setAlignmentX(CENTER_ALIGNMENT);
        txtUsuario.setFont(new Font("Serif", Font.PLAIN, 16));
        txtUsuario.setForeground(Color.WHITE);

        this.txtFUsuario = new JTextField();
        txtFUsuario.setSize(200,50);
        txtFUsuario.setMaximumSize(new Dimension(200,30));
        txtFUsuario.setAlignmentX(CENTER_ALIGNMENT);
        txtFUsuario.setBackground(new Color(192,192,192));
        txtFUsuario.setForeground(Color.white);
        txtFUsuario.setBorder(BorderFactory.createLineBorder(Color.black,1));

        this.txtContrasenia = new JLabel("Contrasenia:");
        txtContrasenia.setMaximumSize(new Dimension(200,50));
        txtContrasenia.setAlignmentX(CENTER_ALIGNMENT);
        txtContrasenia.setFont(new Font("Serif", Font.PLAIN, 16));
        txtContrasenia.setForeground(Color.WHITE);

        this.txtFContrasenia = new JPasswordField();
        txtFContrasenia.setSize(200,50);
        txtFContrasenia.setMaximumSize(new Dimension(200,30));
        txtFContrasenia.setAlignmentX(CENTER_ALIGNMENT);
        txtFContrasenia.setBackground(new Color(192,192,192));
        txtFContrasenia.setForeground(Color.white);
        txtFContrasenia.setBorder(BorderFactory.createLineBorder(Color.black,1));

        this.txtConfirmar = new JLabel("Confirmar contrasenia:");
        txtConfirmar.setMaximumSize(new Dimension(200,50));
        txtConfirmar.setAlignmentX(CENTER_ALIGNMENT);
        txtConfirmar.setFont(new Font("Serif", Font.PLAIN, 16));
        txtConfirmar.setForeground(Color.WHITE);

        this.txtFConfirmarContrasenia = new JPasswordField();
        txtFConfirmarContrasenia.setSize(200,50);
        txtFConfirmarContrasenia.setMaximumSize(new Dimension(200,30));
        txtFConfirmarContrasenia.setAlignmentX(CENTER_ALIGNMENT);
        txtFConfirmarContrasenia.setBackground(new Color(192,192,192));
        txtFConfirmarContrasenia.setForeground(Color.white);
        txtFConfirmarContrasenia.setBorder(BorderFactory.createLineBorder(Color.black,1));

        this.btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setAlignmentX(CENTER_ALIGNMENT);
		btnConfirmar.setActionCommand(CONFIRMAR);
		btnConfirmar.addActionListener(this);

        this.btnCancelar = new JButton("Cancelar");
        btnCancelar.setAlignmentX(CENTER_ALIGNMENT);
        btnCancelar.setActionCommand(CANCELAR);
        btnCancelar.addActionListener(this);

        add(txtBienvenida);
        add(Box.createRigidArea(new Dimension(0,100))); 
        add(txtUsuario);
        add(txtFUsuario);
        add(txtContrasenia);
        add(txtFContrasenia);
        add(txtConfirmar);
        add(txtFConfirmarContrasenia);
        add(Box.createRigidArea(new Dimension(0,10))); 
        add(btnConfirmar);
        add(Box.createRigidArea(new Dimension(0,30))); 
        add(btnCancelar);

        setVisible(false);
    }

    public void Limpiar() {
        txtFUsuario.setText("");
        txtFContrasenia.setText("");
        txtFConfirmarContrasenia.setText("");
    }

    @Override
	public void actionPerformed(ActionEvent e) {
		String grito = e.getActionCommand();
		if(grito.equals(CONFIRMAR)) {

            String usuario = new String(txtFUsuario.getText());
            String contrasenia = new String(txtFContrasenia.getPassword());
            String confirmacion = new String(txtFConfirmarContrasenia.getPassword());

            if(usuario.equals("")){
                JOptionPane.showMessageDialog(this, "Ingrese un nombre de usuario");
            }
            else if(contrasenia.equals("") || confirmacion.equals("")){
                JOptionPane.showMessageDialog(this, "La clave o la confirmacion estan vacias");
            }
            else if(contrasenia.equals(confirmacion)){
                padreIniciarSesion.CrearCuenta(txtFUsuario.getText(), contrasenia);
            }
            else{
                JOptionPane.showMessageDialog(this, "La clave no coincide con la confirmacion");
            }
		}
		else if(grito.equals(CANCELAR)) {
            padreIniciarSesion.CambiarPanelInicializar();
		}
    }


}
