package proyecto_stephaniemartinez;

public abstract class Piezas {

    String nombre;
    int turno;

    public Piezas(String nombre, int turno) {
        this.nombre = nombre;
        this.turno = turno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public abstract boolean Validacion();

}
