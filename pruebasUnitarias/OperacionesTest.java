package pruebasUnitarias;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OperacionesTest {
    @Test
    void testDividirPositivos() throws Exception {
        // Configurar (Arrange)
        Operaciones operar = new Operaciones();
        double resultadoEsperado = 5;

        // Ejecutar (Act)
        double resultado = operar.dividir(10, 2);

        // Verificar (Assert)
        assertEquals(resultadoEsperado,resultado);
    }

    @Test
    void testDividirPorCero() {
        // Configurar (Arrange)
        Operaciones operar = new Operaciones();

        // Ejecutar (Act) y Verificar (Assert)
        assertThrows(Exception.class,
                ()->operar.dividir(500,0));
    }
}
