
public class CuentaCorriente {

    private int idCliente;
    private int idCuenta;
    private double saldo;

    public CuentaCorriente(){

    }

    public CuentaCorriente(int idCliente, int idCuenta, double saldo) {
        this.idCliente = idCliente;
        this.idCuenta = idCuenta;
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente cuenta) {
        this.idCliente = cuenta.getIdCliente();
        this.idCuenta = cuenta.getIdCuenta();
        this.saldo = cuenta.getSaldo();
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public int getIdCuenta() {
        return this.idCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public void setSaldo(double saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        }
    }

    public boolean ingreso(double importe){
        boolean isOk = true;
        if (importe > 0){
            this.saldo += importe;
        }{
            isOk = false;
        }
        return isOk;
    }

    public boolean egreso(double importe){
        boolean isOk = true;
        if (importe <= this.saldo) {
            this.saldo -= importe;
        }else{
            isOk = false;
        }
        return isOk;
    }

    public void reintegro(double importe){
        this.ingreso(importe);
    }

    public void transferencia(CuentaCorriente cuenta, double importe){
        boolean isOk = this.egreso(importe);
        if (isOk) {
            cuenta.ingreso(importe);
        }
    }


}
