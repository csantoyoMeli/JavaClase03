package ejercicio3;

public class main {
    public static void main(String[] args) {

        System.out.println("******** Personas *******");
        Persona[] personas = new Persona[6];
        personas[0] = new Persona("Lisa", 2314545);
        personas[1] = new Persona("David", 1452365);
        personas[2] = new Persona("Anny", 12128934);
        personas[3] = new Persona("Julian", 982376);
        personas[4] = new Persona("Zeke", 698741);
        personas[5] = new Persona("Hann", 982753);

        for (Persona p : personas) {
            System.out.println("Nombre: " + p.getNombre() + " | DNI: " + p.getDni());
        }
        System.out.println("------- Después del ordenamiento -------");
        SortUtil.ordenar(personas);
        for (Persona p : personas) {
            System.out.println("Nombre: " + p.getNombre() + " | DNI: " + p.getDni());
        }

        System.out.println("******** Celulares *******");

        Celular[] celulares = new Celular[6];
        celulares[0] = new Celular(321584, "Cristian");
        celulares[1] = new Celular(984912, "Sofía");
        celulares[2] = new Celular(124512, "Luz");
        celulares[3] = new Celular(346246, "Dan");
        celulares[4] = new Celular(464783, "Joshua");
        celulares[5] = new Celular(784525, "Marcos");

        for (Celular c : celulares) {
            System.out.println("Número: " + c.getNumero() + " | Titular: " + c.getTitular());
        }
        System.out.println("------- Después del ordenamiento -------");
        SortUtil.ordenar(celulares);
        for (Celular c : celulares) {
            System.out.println("Número: " + c.getNumero() + " | Titular: " + c.getTitular());
        }
    }
}
