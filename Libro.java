

public class Libro {

    private String titulo;
    private String autor;
    private int isbn;
    private int nroSocio;

    public Libro() {
    }

    public Libro(String titulo, String autor, int isbn, int nroSocio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.nroSocio = nroSocio;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return this.isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNroSocio() {
        return this.nroSocio;
    }

    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }

    public boolean prestamo(int nroSocio){
        boolean isOk = true;
        if (this.nroSocio == 0 ){
            this.setNroSocio(nroSocio);
        } else {
            isOk = false;
        }
        return isOk;
    }

    public void devolucion(){
        this.setNroSocio(0);
    }

    @Override
    public String toString() {
        return titulo + ", " + isbn + ", " + autor ;
    }
}
