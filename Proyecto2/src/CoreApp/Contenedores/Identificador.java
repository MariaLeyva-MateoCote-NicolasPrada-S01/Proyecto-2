package CoreApp.Contenedores;

public abstract class Identificador {
    protected String nombre;
    protected int puntos;
    protected String id;
    
    public String getNombre() {
        return nombre;
    }
    public int getPuntos() {
        return puntos;
    }
    public String getId() {
        return id;
    }
    
    public Identificador(String nombre, int puntos, String id) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.id = id;
    }

    
}
