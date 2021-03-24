package ejercicio2;

public abstract class FiguraGeometrica {
    private String nombre;
    public abstract double area();

    @Override
    public String toString() {
        return "Esta figura es un: " + this.nombre;
    }
}
