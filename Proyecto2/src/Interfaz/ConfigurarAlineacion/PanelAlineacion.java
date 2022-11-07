package Interfaz.ConfigurarAlineacion;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

import CoreApp.Contenedores.Jugador;

public class PanelAlineacion extends JPanel implements ChangeListener{

    private int rowJugadorSeleccionada;

    private JRadioButton[] btnsSelectJugador;
    ButtonGroup grupoBonotes = new ButtonGroup();
   
    public PanelAlineacion(VentanaConfigurarAlineacion ventanaConfigurarAlineacion, Jugador[] titulares) {
    
        setLayout(new GridLayout(11, 3));

        for (int i = 0; i < titulares.length; i++) {
            Jugador jugadorI = titulares[i];

            JTextField nombreI = new JTextField(jugadorI.getNombre());
            JTextField posicionI = new JTextField(jugadorI.getPosicion());
            JRadioButton btnSelect = new JRadioButton();
            grupoBonotes.add(btnSelect);
            btnsSelectJugador[i] = btnSelect;
            
            btnSelect.addChangeListener(this);

            add(nombreI);
            add(posicionI);
            add(btnSelect);
        }
    
    }

    public void stateChanged(ChangeEvent e) {
        if (btnsSelectJugador[0].isSelected()) {
            rowJugadorSeleccionada = 0;
        }
        else if (btnsSelectJugador[1].isSelected()) {
            rowJugadorSeleccionada = 1;
        }
        else if (btnsSelectJugador[2].isSelected()) {
            rowJugadorSeleccionada = 2;
        }
        else if (btnsSelectJugador[3].isSelected()) {
            rowJugadorSeleccionada = 3;
        }
        else if (btnsSelectJugador[4].isSelected()) {
            rowJugadorSeleccionada = 4;
        }
        else if (btnsSelectJugador[5].isSelected()) {
            rowJugadorSeleccionada = 5;
        }
        else if (btnsSelectJugador[6].isSelected()) {
            rowJugadorSeleccionada = 6;
        }
        else if (btnsSelectJugador[7].isSelected()) {
            rowJugadorSeleccionada = 7;
        }
        else if (btnsSelectJugador[8].isSelected()) {
            rowJugadorSeleccionada = 8;
        }
        else if (btnsSelectJugador[9].isSelected()) {
            rowJugadorSeleccionada = 9;
        }
        else if (btnsSelectJugador[10].isSelected()) {
            rowJugadorSeleccionada = 10;
        }
        else{
            rowJugadorSeleccionada = -1;
        }
    
    }

    public int getRowJugadorSeleccionada() {
        return rowJugadorSeleccionada;
    }


}
