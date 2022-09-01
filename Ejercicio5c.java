import javax.swing.*;

public class Ejercicio5c {
    public static void main(String[] args) {
        int nivelDif, numAleatorio, numAdivin, cantVecesGanadas = 0, cantVecesPerdidas = 0,
                continuacion = 1, intentos; // Las variables

        for (intentos = 0; continuacion == 1; intentos++) {
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
        }
        JOptionPane.showMessageDialog(null, "Cantidad de veces ganadas por:\n- La computadora: " + cantVecesPerdidas
                + "\n- El jugador: " + cantVecesGanadas + "\nLa cantidad de veces que jugó fue: "
                + intentos);
    }
}