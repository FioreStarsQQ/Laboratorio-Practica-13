
/*
 * * Laboratorio Nro 13 - Ejercicio 5: Programa iterativo. Realizar un juego donde se ingrese el nivel de dificultad inicialmente
 *  (valor entre 1 y 5), Luego la computadora genera un aleatorio entre 1 y el nivel de dificultad ingresados, se le pide al jugador 
 * que introduzca un número entre 1 y el nivel de dificultad (ej. 5) tratando de adivinar el número generado por la computadora. 
 * Modo visual.
Al final del juego informar los siguientes datos: nivel de dificultad, número generado, número ingresado y quién ganó el juego, 
el jugador o la computadora.
Antes de salir del programa mostrar la cantidad de juegos que ganó la computadora, la cantidad que ganó el jugador y quién fue 
el ganador considerando todos los juegos realizados (puede haber empate).
 * Autor: Fiorela Clariza Quispe Quispe
 * Colaboró: 
 * Tiempo: 
 */
import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        int nivelDif = 1, numAleatorio, numAdivin, intentos = 0, cantVecesGanadas = 0, cantVecesPerdidas = 0,
                continuacion; // Las variables

        do {
            do {
                // Obteniendo el nivel de dificultad
                nivelDif = Integer
                        .parseInt(JOptionPane.showInputDialog("Ingrese el nivel de dificultad (entre 1 y 5):"));
            } while (!(nivelDif >= 1 && nivelDif <= 5));
            // Seleccionando un número al azar
            numAleatorio = (int) ((Math.random() * nivelDif) + 1);
            // Número con el que se va a comparar el número al azar
            numAdivin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entre 1 y " + nivelDif + ":"));
            // Salida
            if (numAleatorio == numAdivin) {
                JOptionPane.showMessageDialog(null,
                        "El nivel de dificultad fue: " + nivelDif + "\nEl número generado fue: "
                                + numAleatorio + "\nEl número ingresado fue: " + numAdivin
                                + "\n¡Felicidades! Usted adivino el número elegido aleatoriamente por la computadora.");
                cantVecesGanadas++;
            } else {
                JOptionPane.showMessageDialog(null,
                        "El nivel de dificultad fue: " + nivelDif + "\nEl número generado fue: "
                                + numAleatorio + "\nEl número ingresado fue: " + numAdivin
                                + "\nUsted no adivinó el número elegido aleatoriamente por la computadora.");
                cantVecesPerdidas++;

            }
            continuacion = Integer.parseInt(
                    JOptionPane.showInputDialog("¿Desea seguir jugando?\nDigite 1 para continuar y 2 para salir..."));
            intentos++;
        } while (continuacion == 1);
        JOptionPane.showMessageDialog(null, "Cantidad de veces ganadas por:\n- La computadora: " + cantVecesPerdidas
                + "\n- El jugador: " + cantVecesGanadas + "\nLa cantidad de veces que jugó fue: " + intentos);
    }
}