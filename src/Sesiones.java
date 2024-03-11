/**
 * package PACKAGE_NAME; * Created by IntelliJ IDEA.
 * User: Angel CM ( @angelvcuenca )
 * Date: 10/3/2024
 * Time: 18:15
 * Description: Permite crear y insertar charlas a las sesiones de dia y tarde
 */
import java.util.ArrayList;
import java.util.List;

public class Sesiones {
    List<Charlas> charla = new ArrayList<>();
    int tiempoDisponible;

    public Sesiones(int tiempoDisponible) {
        this.tiempoDisponible = tiempoDisponible;
    }
    public void insertarCharla(Charlas charlas) {
        charla.add(charlas);
        tiempoDisponible -= charlas.duracionCharla;
    }
}
