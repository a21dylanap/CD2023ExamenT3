package examen;
/**
 * Creamos las variables para la cuenta bancaria
 */
public class CuentaBancaria {
    private String titular;
    private double saldo;

    /**
     * Creamos el constructor con parametros
     * @param titular
     * @param saldoInicial
     */
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    /**
     * Getter de titular, obtiene el titular
     * @return
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Getter de saldo, obtiene el saldo
     * @return
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo para depositar dinero, que en el caso de que la cantidad sea mayor a cero se sume al saldo, en caso contrario nos saldra una exception de que el valor tiene que ser mayor a cero
     * @param cantidad
     */
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            throw new IllegalArgumentException("La cantidad a depositar debe ser mayor que cero.");
        }
    }

    /**
     * Metodo para retirar dinero, que en caso de que la cantidad sea mayor a cero y que a su vez sea menor o igual al saldo pues lo resta.En caso de que no sea así salta una exception
     * @param cantidad
     */
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            throw new IllegalArgumentException("No se puede retirar la cantidad especificada.");
        }
    }
}