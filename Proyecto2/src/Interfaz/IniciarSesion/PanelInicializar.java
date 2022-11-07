package Interfaz.IniciarSesion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;

public class PanelInicializar extends JPanel implements ActionListener{
    
    private static final String INICIO = "INICIO";
	private static final String CREAR = "CREAR";
	private static final String SALIR = "SALIR";    

    private VentanaIniciarSesion padreIniciarSesion;

    private JLabel txtBienvenida;
    private JLabel txtUsuario;
    private JLabel txtContrasenia;
    private JTextField txtFieldUsuario;
    private JPasswordField txtFieldContrasenia;
    private JButton btnIniciarSesion;
    private JButton btnCrearCuenta;
    private JButton btnSalir;
    
    
    public PanelInicializar(VentanaIniciarSesion ventanaIniciarSesion) {

        this.padreIniciarSesion = ventanaIniciarSesion;

        setPreferredSize(new Dimension(1000,600));
        setSize(getPreferredSize());
        setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(new Color(51, 171, 249));
        
        this.txtBienvenida = new JLabel("Bienvedio a FUTBOL FANTASIA");
        txtBienvenida.setFont(new Font("Serif", Font.BOLD, 32));
        txtBienvenida.setForeground(Color.WHITE);
        txtBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
        txtBienvenida.setSize(600,200);
        txtBienvenida.setMaximumSize(new Dimension(600,100));
        txtBienvenida.setAlignmentX(CENTER_ALIGNMENT);

        this.txtUsuario = new JLabel("Usuario:");
        txtUsuario.setMaximumSize(new Dimension(200,50));
        txtUsuario.setAlignmentX(CENTER_ALIGNMENT);
        txtUsuario.setFont(new Font("Serif", Font.PLAIN, 16));
        txtUsuario.setForeground(Color.WHITE);

        this.txtFieldUsuario = new JTextField();
        txtFieldUsuario.setSize(200,50);
        txtFieldUsuario.setMaximumSize(new Dimension(200,30));
        txtFieldUsuario.setAlignmentX(CENTER_ALIGNMENT);
        txtFieldUsuario.setBackground(new Color(192,192,192));
        txtFieldUsuario.setForeground(Color.white);
        txtFieldUsuario.setBorder(BorderFactory.createLineBorder(Color.black,1));

        this.txtContrasenia = new JLabel("Contrasenia:");
        txtContrasenia.setMaximumSize(new Dimension(200,50));
        txtContrasenia.setAlignmentX(CENTER_ALIGNMENT);
        txtContrasenia.setFont(new Font("Serif", Font.PLAIN, 16));
        txtContrasenia.setForeground(Color.WHITE);

        this.txtFieldContrasenia = new JPasswordField();
        txtFieldContrasenia.setSize(200,50);
        txtFieldContrasenia.setMaximumSize(new Dimension(200,30));
        txtFieldContrasenia.setAlignmentX(CENTER_ALIGNMENT);
        txtFieldContrasenia.setBackground(new Color(192,192,192));
        txtFieldContrasenia.setForeground(Color.white);
        txtFieldContrasenia.setBorder(BorderFactory.createLineBorder(Color.black,1));

        this.btnIniciarSesion = new JButton("Iniciar Sesion");
        btnIniciarSesion.setAlignmentX(CENTER_ALIGNMENT);
		btnIniciarSesion.setActionCommand(INICIO);
		btnIniciarSesion.addActionListener(this);

        this.btnCrearCuenta = new JButton("Crear Cuenta");
        btnCrearCuenta.setAlignmentX(CENTER_ALIGNMENT);
        btnCrearCuenta.setActionCommand(CREAR);
        btnCrearCuenta.addActionListener(this);

        this.btnSalir = new JButton("Salir");
        btnSalir.setAlignmentX(CENTER_ALIGNMENT);
        btnSalir.setActionCommand(SALIR);
        btnSalir.addActionListener(this);

        add(txtBienvenida);
        add(Box.createRigidArea(new Dimension(0,100))); 
        add(txtUsuario);
        add(txtFieldUsuario);
        add(txtContrasenia);
        add(txtFieldContrasenia);
        add(Box.createRigidArea(new Dimension(0,10))); 
        add(btnIniciarSesion);
        add(Box.createRigidArea(new Dimension(0,10))); 
        add(btnCrearCuenta);
        add(Box.createRigidArea(new Dimension(0,30))); 
        add(btnSalir);

        setVisible(true);

    }

    public void Limpiar() {
        txtFieldContrasenia.setText("");
        txtFieldUsuario.setText("");
    }

    @Override
	public void actionPerformed(ActionEvent e) {
		String grito = e.getActionCommand();
		if(grito.equals(INICIO)) {
            padreIniciarSesion.IniciarSesion(txtFieldUsuario.getText(), new String(txtFieldContrasenia.getPassword()));
		}
		else if(grito.equals(CREAR)) {
            padreIniciarSesion.CambiarPanelCrearCuenta();
		}
        else if(grito.equals(SALIR)) {
            padreIniciarSesion.SalirApp();
        }
    }

}
