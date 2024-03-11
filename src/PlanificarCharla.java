/**
 * package PACKAGE_NAME; * Created by IntelliJ IDEA.
 * User: Angel CM ( @angelvcuenca )
 * Date: 10/3/2024
 * Time: 17:49
 */

    public class PlanificarCharla {

    Sesiones SessionesDia = new Sesiones(Conferencias.TIEMPO_JORNADA_DIA);
    Sesiones SessionesTarde = new Sesiones(Conferencias.TIEMPO_JORNADA_TARDE);

    public boolean insertarCharla(Charlas charlas) {

        if (SessionesDia.tiempoDisponible >= charlas.duracionCharla) {
            SessionesDia.insertarCharla(charlas);
            return true;
        } else if (SessionesTarde.tiempoDisponible >= charlas.duracionCharla) {
            SessionesTarde.insertarCharla(charlas);
            return true;
        }
        return false;

    }
}

