package examen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CuentaBancariaTest {

    @Test
    public void testConstructorYGetters() {
        CuentaBancaria cuenta = new CuentaBancaria("Juan", 100.0);
        assertEquals("Juan", cuenta.getTitular());
        assertEquals(100.0, cuenta.getSaldo());
    }

    @Test
    public void testDepositar() {
        CuentaBancaria cuenta = new CuentaBancaria("Ana", 200.0);
        cuenta.depositar(50.0);
        assertEquals(250.0, cuenta.getSaldo());
    }

    @Test
    public void testRetirar() {
        CuentaBancaria cuenta = new CuentaBancaria("Pedro", 150.0);
        cuenta.retirar(50.0);
        assertEquals(100.0, cuenta.getSaldo());
    }

    @Test
    public void testRetirarCantidadInvalida() {
        CuentaBancaria cuenta = new CuentaBancaria("María", 100.0);
        assertThrows(IllegalArgumentException.class, () -> cuenta.retirar(-50.0));
        assertThrows(IllegalArgumentException.class, () -> cuenta.retirar(150.0));
    }

    @Test
    public void testDepositarCantidadInvalida() {
        CuentaBancaria cuenta = new CuentaBancaria("Carlos", 100.0);
        assertThrows(IllegalArgumentException.class, () -> cuenta.depositar(-50.0));
    }
}