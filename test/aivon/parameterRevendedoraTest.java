package aivon;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

/*Querido profe: tuve complicaciones con este punto, me tope con ambiguedades que lanzaba el metodo, intente corregirlo pero el tiempo 
apremia. Por lo que: 
conclusion: modele el test asumiendo el manejo de error mediante excepcion en lugar de valores de retorno como -1
 */

/*Posterior a la devolucion del examen lo estudiare otra vez para sacarme la duda, saludos*/

@RunWith(Parameterized.class)
public class parameterRevendedoraTest {

    private double monto;
    private double saldoInicial;
    private double saldoEsperado;

    public parameterRevendedoraTest(
            double monto,
            double saldoInicial,
            double saldoEsperado) {

        this.monto = monto;
        this.saldoInicial = saldoInicial;
        this.saldoEsperado = saldoEsperado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> tomarDatos() {

        return Arrays.asList(new Object[][]{

            {300.5, 3333.0, 3032.5},

            {500.0, 8199.5, 7699.5},

            {9999.0, 1111.0, -1.0}
        });
    }

    @Test
    public void testRetirarDinero() {

        Revendedor cuenta =
                new Revendedor(
                        1,
                        "Ana",
                        "1111",
                        saldoInicial
                );

        try {

            cuenta.retirarDinero(monto);

            assertEquals(
                    saldoEsperado,
                    cuenta.getSaldoCuenta(),
                    0.2
            );

        } catch (Exception e) {

            fail("Su cuenta no tiene saldo.");
        }
    }
}