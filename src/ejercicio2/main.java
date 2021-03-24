package ejercicio2;

public class main {
    public static void main(String[] args) {
        FiguraGeometrica[] arrF = new FiguraGeometrica[4];
        arrF[0] = new Circulo(2);
        arrF[1] = new Triangulo(5, 7);
        arrF[2] = new Rectangulo(2, 4);
        arrF[3] = new Rectangulo(5, 5);

        System.out.println(Promediador.areaPromedio(arrF));
    }
}
