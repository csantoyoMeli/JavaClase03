package ejercicio2;

public class Triangulo extends FiguraGeometrica{
    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base*altura/2;
    }
}
