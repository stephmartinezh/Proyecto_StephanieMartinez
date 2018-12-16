
package proyecto_stephaniemartinez;


public class Jugador2 {
    String nombre;

    public Jugador2(String nombre) {
        this.nombre = nombre;
    }

    public Jugador2() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Jugador2{" + "nombre=" + nombre + '}';
    }
    
    
}
