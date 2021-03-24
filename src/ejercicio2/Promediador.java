package ejercicio2;

public class Promediador {
    public static double areaPromedio(FiguraGeometrica[] arr) {
        double sum = 0;
        for (FiguraGeometrica f: arr) {
            sum += f.area();
        }
        return sum/arr.length;
    }
}
