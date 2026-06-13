/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package aivon;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author franc
 */
public class RevendedorTest {
    
    private Revendedor revCuenta;
    private Revendedor rev2;
    private Revendedor rev3;

private static int i = 1;
    
    public RevendedorTest() {
    }
    
   @BeforeClass
   public static void setUpClass() {

    System.out.println(
            "Fecha de transaccion: 2024-06-08"
    );
}
    
   @AfterClass
public static void tearDownClass() {

    System.out.println(
            "FIN de la transaccion"
    );
}
    
    @Before
public void setUp() {

    revCuenta =
        new Revendedor(
            1,
            "Ana",
            "1111",
            9000
        );

    rev2 =
        new Revendedor(
            2,
            "Maria",
            "2222",
            5000
        );

    rev3 =
        new Revendedor(
            3,
            "Laura",
            "3333",
            9000
        );
}
   @After
public void tearDown() {

    System.out.println(
        "Transaccion "
        + i++
        + " > El monto en cuenta es "
        + revCuenta.getSaldoCuenta()
    );
}


@Test(expected = Exception.class)


//PUNTO B---------------------------------------------------

public void testRetirarFallo() throws Exception {

    revCuenta.retirarDinero(88000.0);
}
//PUNTO C---------------------------------------------------
@Test
public void testRetirarExito() throws Exception {

    revCuenta.retirarDinero(1000.0);

    assertEquals(
            8000.0,
            revCuenta.getSaldoCuenta(),
            0.2
    );
}
//PUNTO D---------------------------------------------------
@Test
public void testDepositarDinero() {

    /* pide assertNull(revCuenta) pero luego utiliza revCuenta.
     * Se reemplaza por assertNotNull(revCuenta).*/
    assertNotNull(revCuenta);

    revCuenta.depositarDinero(2000.0);

    assertEquals(
            11000.0,
            revCuenta.getSaldoCuenta(),
            0.2
    );
}
//PUNTO E-----------------------------------------------------------
@Test
public void testTransferirCuentaNoNula() throws Exception {

    /*
     * profe encontre otra inconsistencia en el parcial, hay como una contradiccion a mi entender, por lo cual 
    reemplazo algunas sentencias para que el algoritmo sea funcional
     * solicita assertNull(rev2), pero luego utiliza rev2.
     * Se reemplaza por assertNotNull(rev2).
     */
    assertNotNull(rev2);

    revCuenta.transferirDinero(
            rev2,
            1000.0
    );

    assertEquals(
            8000.0,
            revCuenta.getSaldoCuenta(),
            0.2
    );

    assertEquals(
            6000.0,
            rev2.getSaldoCuenta(),
            0.2
    );
}

//PUNTO F----------------------------------------------------------
@Test
public void testSiempreFalla() {

    fail("Este test debe fallar por orden de juanjo");
}


//PUNTO G-----------------------------------------------------------

@Test
public void testDolarMEP1() {

    assertEquals(
            "1300",
            revCuenta.convertirMoneda("1300")
    );
}

//PUNTO H-----------------------------------------------------------

@Test
public void testDolarMEP2() {

    /* El enunciado exige FALLA.
     * Se compara contra un valor distinto.*/
     

    assertEquals(
            "1300",
            revCuenta.convertirMoneda("1300 U$S")
    );
}

//PUNTO I ----------------------------------------------------------

@Test
public void testMismaRevendedora() {

    assertSame(
            "Las cuentas son diferentes",
            revCuenta,
            rev3
    );
}

//PUNTO J --------------------------------------------------------

@Test(timeout = 60)
public void testPagoDemorado()
        throws InterruptedException {

    /*El enunciado es inconsistente.
     * Se usO 100 ms para garantizar timeout, ya que el enunnciado me resutlo confuso*/
     

    revCuenta.pagoDemorado(100);
}



}
