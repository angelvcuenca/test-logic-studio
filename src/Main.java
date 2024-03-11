/**
 * Created by IntelliJ IDEA.
 * User: Angel CM ( @angelvcuenca )
 * Date: 10/3/2024
 * Time: 17:09
 */

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {
        Conferencias conferencias = new Conferencias();

        List<Charlas> listaCharlas = new ArrayList<>();
        listaCharlas.add(new Charlas("Redacción de pruebas rápidas contra Enterprise Rails", 60));
        listaCharlas.add(new Charlas("Exagerandoen Python", 45));
        listaCharlas.add(new Charlas("Introduction to Java", 60));
        listaCharlas.add(new Charlas("Advanced Java Techniques", 90));
        listaCharlas.add(new Charlas("Web Development Best Practices", 45));
        listaCharlas.add(new Charlas("Mobile App Development Strategies", 30));
        listaCharlas.add(new Charlas("Java Lightning Talks", 5));
        listaCharlas.add(new Charlas("Database Management Fundamentals", 75));
        listaCharlas.add(new Charlas("SQL Optimization Techniques", 90));
        listaCharlas.add(new Charlas("NoSQL Database Overview", 60));
        listaCharlas.add(new Charlas("Data Visualization in Java", 45));
        listaCharlas.add(new Charlas("Networking Basics", 60));
        listaCharlas.add(new Charlas("Cybersecurity in Java Applications", 45));
        listaCharlas.add(new Charlas("Java Frameworks Comparison", 60));
        listaCharlas.add(new Charlas("Java for Enterprise Solutions", 60));

        conferencias.agendaConferencia(listaCharlas);
        conferencias.imprimirHorario();
    }
}
