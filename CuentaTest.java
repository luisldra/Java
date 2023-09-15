import org.junit.jupiter.api.Test;

import pruebasUnitarias.Cuenta;

import static org.junit.jupiter.api.Assertions.*;

public class CuentaTest {
    
    @Test
    void testRetirarMontoMenor() {
        // Configurar (Arrange)
        Cuenta cuenta = new Cuenta(200000);
        boolean resultadoEsperado = true;

        double resultadoEsperadoSaldo = 150000;

        // Ejecutar (Act)
        boolean resultado = cuenta.retirar(50000);

        double resultadoSaldo = cuenta.getSaldo();

        // Verificar (Assert)
        assertEquals(resultadoEsperado,resultado);

        assertEquals(resultadoEsperadoSaldo, resultadoSaldo);
    }

    @Test
    void testRetirarMontoIgual() {
        // Configurar (Arrange)
        Cuenta cuenta = new Cuenta(200000);
        boolean resultadoEsperado = true;

        double resultadoEsperadoSaldo = 0;

        // Ejecutar (Act)
        boolean resultado = cuenta.retirar(200000);

        double resultadoSaldo = cuenta.getSaldo();

        // Verificar (Assert)
        assertEquals(resultadoEsperado,resultado);

        assertEquals(resultadoEsperadoSaldo, resultadoSaldo);
    }

    @Test
    void testRetirarMontoMayor() {
        // Configurar (Arrange)
        Cuenta cuenta = new Cuenta(200000);
        boolean resultadoEsperado = false;

        double resultadoEsperadoSaldo = 200000;

        // Ejecutar (Act)
        boolean resultado = cuenta.retirar(200001);

        double resultadoSaldo = cuenta.getSaldo();

        // Verificar (Assert)
        assertEquals(resultadoEsperado,resultado);

        assertEquals(resultadoEsperadoSaldo, resultadoSaldo);
    }

    @Test
    void testRetirarSinSaldo() {
        // Configurar (Arrange)
        Cuenta cuenta = new Cuenta(0);
        boolean resultadoEsperado = false;

        double resultadoEsperadoSaldo = 0;

        // Ejecutar (Act)
        boolean resultado = cuenta.retirar(50000);

        double resultadoSaldo = cuenta.getSaldo();

        // Verificar (Assert)
        assertEquals(resultadoEsperado,resultado);

        assertEquals(resultadoEsperadoSaldo, resultadoSaldo);
    }

    @Test
    void testRetirarMontoNegativo() {
        // Configurar (Arrange)
        Cuenta cuenta = new Cuenta(200000);
        boolean resultadoEsperado = false;

        double resultadoEsperadoSaldo = 200000;

        // Ejecutar (Act)
        boolean resultado = cuenta.retirar(-50000);

        double resultadoSaldo = cuenta.getSaldo();

        // Verificar (Assert)
        assertEquals(resultadoEsperado,resultado);

        assertEquals(resultadoEsperadoSaldo, resultadoSaldo);
    }

    @Test
    void testRetirarSaldoNegativo() {
        // Configurar (Arrange)
        Cuenta cuenta = new Cuenta(-200000);
        boolean resultadoEsperado = false;

        double resultadoEsperadoSaldo = 0;

        // Ejecutar (Act)
        boolean resultado = cuenta.retirar(50000);

        double resultadoSaldo = cuenta.getSaldo();

        // Verificar (Assert)
        assertEquals(resultadoEsperado,resultado);

        assertEquals(resultadoEsperadoSaldo, resultadoSaldo);
    }
}
