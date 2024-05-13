public class Main {

    public static void main(String[] args) {

        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Película: Matrix");

        int fechaLanzamiento = 1999;
        boolean incluidoPlan = true;
        double notaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja.
                La mejor película del fun del milenio.
                Fue lanzada en:
                """ +  fechaLanzamiento;

        System.out.println(sinopsis);

        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);
    }
}