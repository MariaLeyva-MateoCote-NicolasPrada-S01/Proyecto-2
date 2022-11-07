package Interfaz.IniciarSesion;

import javax.swing.JFrame;

public class VentanaIniciarSesion extends JFrame{
    
    private PanelInicializar panelInicializar;
    private PanelCrearCuenta panelCrearCuenta;
    
    public VentanaIniciarSesion() {
    
        setSize(1000,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        this.panelInicializar = new PanelInicializar(this);
        this.panelCrearCuenta = new PanelCrearCuenta(this);

        add(panelInicializar);
        add(panelCrearCuenta);
    
        setVisible(true);
    }

    private void ComprabarInicioSesion() {

    }

    public void IniciarSesion(String usuario, String contrasenia) {
        
    }

    private void ComprabarCrearCuenta() {
        
    }

    public void CrearCuenta(String usuario, String contrasenia) {

    }

    public void SalirApp() {
        System.exit(0);
    }

    public void CambiarPanelCrearCuenta() {
        panelInicializar.setVisible(false);
        panelInicializar.Limpiar();
        panelCrearCuenta.setVisible(true);
    }
    
    public void CambiarPanelInicializar() {
        panelCrearCuenta.setVisible(false);
        panelCrearCuenta.Limpiar();
        panelInicializar.setVisible(true);
    }


    public static void main(String[] args) {
        VentanaIniciarSesion ventanaIniciarSesion = new VentanaIniciarSesion();
    }


}
