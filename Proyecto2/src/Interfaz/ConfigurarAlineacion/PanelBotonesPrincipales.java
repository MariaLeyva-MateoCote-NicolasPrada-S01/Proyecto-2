package Interfaz.ConfigurarAlineacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PanelBotonesPrincipales extends JFrame implements ActionListener{
    
    private static final String ROTAR = "ROTAR";
	private static final String GUARDAR = "GUARDAR";
	private static final String CANCELAR = "CANCELAR";

    private VentanaConfigurarAlineacion padreAlineacion;

    private JButton btnRotar;
    private JButton btnGuardar;
    private JButton btnCancelar;
    
    
    public PanelBotonesPrincipales(VentanaConfigurarAlineacion padreAlineacion) {
        this.padreAlineacion = padreAlineacion;
    
    }


    @Override
	public void actionPerformed(ActionEvent e) {
		String grito = e.getActionCommand();
		if(grito.equals(ROTAR)) {
            padreAlineacion.rotarJugadores();
		}
		else if(grito.equals(GUARDAR)) {
            padreAlineacion.guardarAlineacion();
		}
        else if(grito.equals(CANCELAR)) {
            padreAlineacion.cancelar();
        }
    }
    


}
