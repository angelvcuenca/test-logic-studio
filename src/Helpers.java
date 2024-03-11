/**
 * package PACKAGE_NAME; * Created by IntelliJ IDEA.
 * User: Angel CM ( @angelvcuenca )
 * Date: 10/3/2024
 * Time: 17:25
 * Description: Clases de soporte para las demas clases
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helpers {
    public String convertirHoraString(int minutos) {
        int horas = minutos / 60;
        int minuto = minutos % 60;
        return String.format("%02d:%02d", horas, minuto);
    }

    public String convertirHora24a12(String horaConvertir) {
        Date formato12 = null;
        String formato12Horas;
        String respuesta;

        SimpleDateFormat formatoHora = new SimpleDateFormat("hh:mm");
        try {
            formato12 = formatoHora.parse(horaConvertir); // 12 hour
        } catch (ParseException e) {
            e.printStackTrace();
        }

        formato12Horas = formatoHora.format(formato12); // 12

        if (formato12Horas.equals(horaConvertir)) {
            respuesta = formato12Horas + " AM";
        } else {
            respuesta = formato12Horas + " PM";
        }
        return respuesta;


    }
    public  boolean validarCadena(String cadena) {
        // Expresión regular que permite letras, tildes y espacios
        String patron = "^[\\p{L}áéíóúüÁÉÍÓÚÜ\\s]+$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(cadena);
        return matcher.matches();

    }

}
