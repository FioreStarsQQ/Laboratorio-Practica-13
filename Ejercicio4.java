
/*
 * Laboratorio Nro 13 - Ejercicio 4: Dado un rango [m..n] enteros, mostrar la sumatoria sólo de los pares y sólo de los impares. 
 * Confiar que siempre m<=n.
 * Autor: Fiorela Clariza Quispe Quispe
 * Colaboró: 
 * Tiempo: 
 */
import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        int m, n, sumaPares = 0, sumaImpares = 0; // Variables
        Scanner scan = new Scanner(System.in);
        // Entradas
        System.out.print(
                "Bienvenido(a), a continuación ingrese el valor de \"m\" (valor incial del rango): ");
        m = scan.nextInt();
        System.out.print("Ingrese el valor de \"n\" (valor final del rango): ");
        n = scan.nextInt();
        // Sentencia for con condicional
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            } else {
                sumaImpares += i;
            }
        }
        System.out.println("Resultado de la suma de los números pares del rango: " + sumaPares);
        System.out.println("Resultado de la suma de los números impares del rango: " + sumaImpares);
        scan.close();
    }
}