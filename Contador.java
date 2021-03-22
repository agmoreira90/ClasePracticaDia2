

public class Contador {
    private int contador;
    private int incremento;

    public Contador() {
    }

    public Contador(int contador, int incremento) {
        this.contador = contador;
        this.incremento = incremento;
    }

    public int getContador() {
        return this.contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getIncremento() {
        return this.incremento;
    }

    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }
    public int incrementar(){
        return this.contador += this.incremento;
    }

    public int decremento(){
        return this.contador -= this.incremento;
    }
}
