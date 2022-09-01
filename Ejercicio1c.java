/*
    - Laboratorio Nro 13 - Ejercicio 1: Imprimir los valores desde m hasta n enteros. Confiar que siempre m<=n.
    - Autor: Fiorela Clariza Quispe Quispe
    - Colaboró: 
    - Tiempo: 
*/

import java.util.*;

public class Ejercicio1c {
    public static void main(String[] args) {
        int m, n; // Variables
        Scanner scan = new Scanner(System.in);
        // Entradas
        System.out.print(
                "Bienvenido(a), a continuación ingrese el valor de \"m\" (valor incial del rango): ");
        m = scan.nextInt();
        System.out.print("Ingrese el valor de \"n\" (valor final del rango): ");
        n = scan.nextInt();
        System.out.print("Valores del rango establecido:\n\t");
        // Sentencia do-while
        do {
            System.out.print(m + "\t");
            m++;
        } while (m <= n);
        scan.close();
    }
}