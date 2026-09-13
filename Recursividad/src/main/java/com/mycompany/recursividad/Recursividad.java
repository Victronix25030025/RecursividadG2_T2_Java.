package com.mycompany.recursividad;

import recursividad.Recursividades;

public class Recursividad {
    public static void main(String[] args) {
        Recursividades oRecursividades = new Recursividades();

        System.out.println("=== TAREA 02: EJERCICIOS DE RECURSIVIDAD ===");

        // 1. Prueba contar vocales
        String texto = "programacion";
        System.out.println("\n1. Numero de vocales en '" + texto + "': " + oRecursividades.vocales(texto));

        // 2. Prueba suma de dígitos (encontrar el número con la suma mayor)
        int[] numeros = {123, 99, 456, 81};
        int mayorSuma = -1;
        int numeroMayor = 0;

        for (int num : numeros) {
            int suma = oRecursividades.sumaDigitos(num);
            if (suma > mayorSuma) {
                mayorSuma = suma;
                numeroMayor = num;
            }
        }
        System.out.println("2. El numero con la mayor suma de digitos es: " + numeroMayor + " (Suma = " + mayorSuma + ")");

        // 3. Prueba suma de n enteros
        int n = 5;
        System.out.println("3. Suma de los primeros " + n + " enteros: " + oRecursividades.sumaNumeros(n));
    }
}
