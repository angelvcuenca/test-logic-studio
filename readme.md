# Proyecto : GESTIÓN DE SEGUIMIENTO DE CONFERENCIAS

_El siguiente programa permite gestionar las conferencias en el rango de horarios (Dia - Tarde), indicando la disponibilidad de las charlas segun su tiempo establecido._

## Comenzando 🚀

_Estas instrucciones permitirán obtener una idea clara del proyecto del funcionamiento del programa._

* La conferencia tiene múltiples temas, cada uno de los cuales tiene una sesión por la mañana y por la tarde.
* Cada sesión contiene múltiples charlas.
* Las sesiones de mañana comienzan a las 9:00 y deben finalizar a las 12:00, para el almuerzo.
* Las sesiones de la tarde comienzan a la 13:00 y deben finalizar a tiempo para el evento de networking.
* El evento de networking no puede comenzar antes de las 16:00 ni después de las 17:00
* Ningún título de charla tiene números.
* La duración de todas las conversaciones está expresada en minutos (no en horas) o en relámpagos (5 minutos).
* Los presentadores serán muy puntuales; no es necesario que haya intervalos entre sesiones.


### Ejecutar 🔧

_A continuacion se indica una serie de pasos para ejecutar el programa_

_**Paso 1:**_ Ubicarnos en la carpeta

```
\out\artifacts\testJavaLogic_jar>
```

_**Paso 2:**_ Abrir una consola de comandos(CMD) y ejecutar

```
java -jar testJavaLogic.jar
```

_Resultados finales_

```
****-- Conferencia 1--****
- Conferencias Dia -
09:00 AM : Exagerandoen Python -> 45min
09:45 AM : Database Management Fundamentals -> 75min
11:00 AM : Data Visualization in Java -> 45min

12:00 : Almuerzo

- Conferencias Tarde -
01:00 PM : Java Frameworks Comparison -> 60min
02:00 PM : Networking Basics -> 60min
03:00 PM : Mobile App Development Strategies -> 30min
03:30 PM : Introduction to Java -> 60min
05:00 PM : Evento Networking

****-- Conferencia 2--****
- Conferencias Dia -
09:00 AM : NoSQL Database Overview -> 60min
10:00 AM : Web Development Best Practices -> 45min
10:45 AM : Cybersecurity in Java Applications -> 45min

12:00 : Almuerzo

- Conferencias Tarde -
01:00 PM : SQL Optimization Techniques -> 90min
02:30 PM : Advanced Java Techniques -> 90min
04:00 PM : Java for Enterprise Solutions -> 60min
05:00 PM : Evento Networking

****-- Conferencia 3--****
- Conferencias Dia -
09:00 AM : Redacción de pruebas rápidas contra Enterprise Rails -> 60min
10:00 AM : Java Lightning Talks -> 5min

12:00 : Almuerzo

- Conferencias Tarde -
05:00 PM : Evento Networking
```
## Ejecutando pruebas unitarias ⚙️

### Testing: Ningún título de una charla puede tener números. ⌨️

_Las charlas explícitamente deben de ser cadena de caracteres_

```
String cadena = "Prueba cadena"; true
String cadena = "Prueba cadena 123"; false
```

## Construido con 🛠️

* IDE : IntelliJ IDEA
* Java : v.17


## Versionado 📌

Se utilizo [Github](https://github.com) para el versionado. 

## Autor ✒️

* **Angel Cuenca** - *Prueba Práctica Java* 