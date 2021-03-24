package ejercicio2;

public class Circulo extends FiguraGeometrica {
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.pow(radio, 2) * Math.PI;
    }
}
