package Interfaz.ConfigurarAlineacion;

import javax.swing.JFrame;

import java.awt.BorderLayout;

import CoreApp.Contenedores.Jugador;


//TODO terminar los métodos y la visualización de la ventana
public class VentanaConfigurarAlineacion extends JFrame {
    
    private PanelAlineacion panelAlineacion;
    private PanelSuplentes panelSuplentes;
    private PanelBotonesPrincipales panelBotonesPrincipales;
    
    
    public VentanaConfigurarAlineacion(Jugador[] titulares, Jugador[] suplentes) {
    
        setLayout(new BorderLayout());

        setSize(getPreferredSize());


        panelAlineacion = new PanelAlineacion(this, titulares);
        panelSuplentes = new PanelSuplentes(this, suplentes);
        panelBotonesPrincipales = new PanelBotonesPrincipales(this);

        add(panelAlineacion, BorderLayout.WEST);
        add(panelSuplentes, BorderLayout.EAST);
        add(panelBotonesPrincipales, BorderLayout.SOUTH);

    
    }


    public void rotarJugadores() {
    }


    public void guardarAlineacion() {
    }


    public void cancelar() {
    }


    

}
