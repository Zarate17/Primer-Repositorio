package mipackage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
    void testIngresar() throws Exception {
        Account Cuenta = new Account(); 
        double dinero = 1000;
        Cuenta.ingresar(dinero);
        double ingreso = 100;
        Cuenta.ingresar(ingreso);
        double obtenido = Cuenta.getBalance(); 
        double esperado = 1100; 
        assertEquals(obtenido,esperado); 
        //fail("Not yet implemented");
    }
	
    @Test
    void testRetirar() throws Exception {
        Account Cuenta = new Account(); 
        double dinero = 1000; 
        Cuenta.ingresar(dinero);
        double retirada = 100; 
        Cuenta.retirar(retirada);
        double obtenido = Cuenta.getBalance(); 
        double esperado = 900; 
        assertEquals(obtenido, esperado); 
        //fail("Not yet implemented");
    }
}