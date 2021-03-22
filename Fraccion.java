

public class Fraccion {
    private int dividendo;
    private int divisor;

    public Fraccion() {
    }

    public Fraccion(int dividendo, int divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    public int getDividendo() {
        return this.dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public int getDivisor() {
        return this.divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public static Fraccion sumar(Fraccion f1, Fraccion f2) {
        Fraccion f3 = new Fraccion((f1.dividendo * f2.divisor) + (f1.divisor * f2.dividendo), f1.divisor * f2.divisor);
        return f3;
    }

    public static Fraccion sumar(Fraccion f1, int entero) {
        Fraccion f3 = new Fraccion((f1.dividendo) + (f1.divisor * entero), f1.divisor);
        return f3;
    }

    public static Fraccion restar(Fraccion f1, Fraccion f2) {
        Fraccion f3 = new Fraccion((f1.dividendo * f2.divisor) - (f1.divisor * f2.dividendo), f1.divisor * f2.divisor);
        return f3;
    }

    public static Fraccion restar(Fraccion f1, int entero) {
        Fraccion f3 = new Fraccion((f1.dividendo) - (f1.divisor * entero), f1.divisor);
        return f3;
    }

    public static Fraccion multiplicar(Fraccion f1, Fraccion f2) {
        Fraccion f3 = new Fraccion((f1.dividendo * f2.dividendo), (f1.divisor * f2.divisor));
        return f3;
    }

    public static Fraccion multiplicar(Fraccion f1, int entero) {
        Fraccion f3 = new Fraccion((entero * f1.dividendo), (f1.divisor));
        return f3;
    }

    public static Fraccion dividir(Fraccion f1, Fraccion f2) {
        Fraccion f3 = new Fraccion((f1.dividendo * f2.divisor), (f1.divisor * f2.dividendo));
        return f3;
    }

    public static Fraccion dividir(Fraccion f1, int entero) {
        Fraccion f3 = new Fraccion((f1.dividendo), (f1.divisor * entero));
        return f3;
    }

    @Override
    public String toString() {
        String fraccion = "";
        if (this.divisor != 1) {
            fraccion = "Fraccion{" + this.dividendo + "/ " + this.divisor + '}';
        }else{
            fraccion = "Entero{" + this.dividendo + '}';
        }
        return fraccion;
    }

}
