package Interfaz.ConfigurarAlineacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import CoreApp.Contenedores.Jugador;

public class PanelSuplentes extends JPanel implements ActionListener{

    private JTextField[] txtNombres;
    private JTextField[] txtPosiciones;
    private JRadioButton[] rbSeleccionarJugador; 
    
    public PanelSuplentes(VentanaConfigurarAlineacion ventanaConfigurarAlineacion, Jugador[] suplentes) {
    }
    
}
