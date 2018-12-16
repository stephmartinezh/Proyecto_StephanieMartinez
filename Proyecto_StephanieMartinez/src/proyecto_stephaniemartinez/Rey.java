package proyecto_stephaniemartinez;

public class Rey extends Piezas {

    int x;
    int y;
    int xFinal;
    int yFinal;
    boolean condicion;

    public Rey(int x, int y, int xFinal, int yFinal, String nombre, int turno) {
        super(nombre, turno);
        this.x = x;
        this.y = y;
        this.xFinal = xFinal;
        this.yFinal = yFinal;
    }

    public int getxFinal() {
        return xFinal;
    }

    public void setxFinal(int xFinal) {
        this.xFinal = xFinal;
    }

    public int getyFinal() {
        return yFinal;
    }

    public void setyFinal(int yFinal) {
        this.yFinal = yFinal;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean Validacion() {
        return condicion;
    }
}
