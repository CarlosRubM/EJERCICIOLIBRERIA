public class Libro {

    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String ISBN;
    private String genero;

    public Libro(String titulo, String autor, int añoPublicacion, String ISBN, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.ISBN = ISBN;
        this.genero = genero;
    }
}
