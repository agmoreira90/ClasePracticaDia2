import java.time.DateTimeException;
import java.util.GregorianCalendar;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;
    private int horas;
    private int minutos;
    private int segundos;

    public Fecha() {
    }

    public String Fecha(int dia, int mes, int anio) {
        String resultado = validarFecha(dia, (mes-1), anio, 0, 0, 0);
        if (resultado == "") {
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
            resultado = "Fecha creada con Exito";
        }
        return resultado;
    }

    public String Fecha(int dia, int mes, int anio, int horas, int minutos, int segundos) {
        String resultado = validarFecha(dia, (mes-1), anio, horas, minutos, segundos);
        if (resultado == "") {
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
            resultado = "Fecha creada con Exito";
        }
        return resultado;
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getHoras() {
        return this.horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return this.minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return this.segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public Fecha agregarDia() {
        GregorianCalendar fecha = new GregorianCalendar();
        fecha.setLenient(false);
        fecha.set(this.anio, this.mes, this.dia, this.horas, this.minutos, this.segundos);
        fecha.add(5, 1);
        this.dia = fecha.get(5);
        this.mes = fecha.get(2);
        this.anio = fecha.get(1);
        return this;
    }

    private String validarFecha(int dia, int mes, int anio, int horas, int minutos, int segundos) {
        String resultado = "";
        GregorianCalendar fecha = new GregorianCalendar();
        fecha.setLenient(false);
        fecha.set(anio, mes, dia, horas, minutos, segundos);
        try {
            fecha.getTime();
        } catch (Exception e) {
            resultado = "Error al crear Fecha en campo: ";
            switch (e.getLocalizedMessage()) {
                case "DAY_OF_MONTH":
                    resultado += "Dia";
                    break;
                case "YEAR":
                    resultado += "Año";
                    break;
                case "MONTH":
                    resultado += "Mes";
                    break;
                case "HOUR_OF_DAY":
                    resultado += "Horas";
                    break;
                case "MINUTE":
                    resultado += "Minutos";
                    break;
                case "SECOND":
                    resultado += "Segundos";
                    break;
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Fecha: " + this.dia + "/" + this.mes + "/" + this.anio + " Hora:" + dia + ":" + mes + ":" + anio;
    }
}
