import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * package PACKAGE_NAME; * Created by IntelliJ IDEA.
 * User: Angel CM ( @angelvcuenca )
 * Date: 10/3/2024
 * Time: 19:55
 */
class HelpersTest {
    Helpers helpers = new Helpers();
    @Test
    void validarCadenaTest1() {
        String cadena = "Prueba cadena ";
        Assertions.assertTrue(helpers.validarCadena(cadena));
    }
    @Test
    void validarCadenaTest2() {
        String cadenaNumero = "Esto prueba de cadena 12";
        Assertions.assertTrue(helpers.validarCadena(cadenaNumero));
    }


}