/**
 * package PACKAGE_NAME; * Created by IntelliJ IDEA.
 * User: Angel CM ( @angelvcuenca )
 * Date: 10/3/2024
 * Time: 17:40
 * Description: Clases que permite gestionar las conferencias
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Conferencias {
    public static final int HORA_INICIO_CONFERENCIA_DIA = 540; // 9:00 AM en minutos
    public static final int TIEMPO_JORNADA_DIA = 180; // Jornada  de mañana en minutos 3 HORAS
    public static final int TIEMPO_JORNADA_TARDE = 240; // Jornada tarde en minutos 4 HORAS
    public static final int HORA_INICIO_CONFERENCIA_TARDE = 780; // 1:00 PM en minutos
    public static final int HORA_INICIO_NETWORKING = 1020; // 5:00 PM en minutos
    Helpers helpers = new Helpers();

    List<PlanificarCharla> pistas = new ArrayList<>();

    public void agendaConferencia(List<Charlas> propuestas) {

        PlanificarCharla charlas= new PlanificarCharla();
        Collections.shuffle(propuestas);

        for (Charlas charla : propuestas) {
            //valida cadena de texto
            if(helpers.validarCadena(charla.tituloCharla)){

                if (!charlas.insertarCharla(charla)) {
                    pistas.add(charlas);
                    charlas = new PlanificarCharla();
                    charlas.insertarCharla(charla);
                }
            }else{
                System.out.println("* Todos los titulos debe contener solamente letras");
                System.out.println("Los siguientes titulos se encuentran incorrectos ");
                System.out.println(" - Charla --> "+ charla.tituloCharla);
                System.exit(0);
            }

        }

        if (!charlas.SessionesDia.charla.isEmpty() || !charlas.SessionesTarde.charla.isEmpty()) {
            pistas.add(charlas);
        }
    }

    public void imprimirHorario() {
        int numeroPista = 1;
        for (PlanificarCharla pistas : pistas) {
            System.out.println("****-- Conferencia " + numeroPista + "--****");
            System.out.println("- Conferencias Dia -");
            imprimirConferencias(pistas.SessionesDia, HORA_INICIO_CONFERENCIA_DIA);
            System.out.println("\n" + "12:00 : Almuerzo" + "\n");
            System.out.println("- Conferencias Tarde -");
            imprimirConferencias(pistas.SessionesTarde, HORA_INICIO_CONFERENCIA_TARDE);
            System.out.println(helpers.convertirHora24a12(helpers.convertirHoraString(HORA_INICIO_NETWORKING)) + " : Evento Networking " + "\n");
            numeroPista++;
        }
    }

    private void imprimirConferencias(Sesiones session, int horaConferencia) {
        for (Charlas charlas : session.charla) {
            String horaConvertida = helpers.convertirHoraString(horaConferencia);
            System.out.println(helpers.convertirHora24a12(horaConvertida) + " : " + charlas.tituloCharla + " -> " + charlas.duracionCharla + "min");
            horaConferencia += charlas.duracionCharla;
        }
    }


}
