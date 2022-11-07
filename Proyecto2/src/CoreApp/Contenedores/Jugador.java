package CoreApp.Contenedores;

public class Jugador extends Identificador{
    
    //Atributes
    private int precio;
    private String posicion;
    
    //Methods
    public int getPrecio() {
        return precio;
    }
    public String getPosicion() {
        return posicion;
    }
    
    
    public Jugador(String nombre, int puntos, String id, int precio, String posicion) {
        super(nombre, puntos, id);
        this.precio = precio;
        this.posicion = posicion;
    }

    


}