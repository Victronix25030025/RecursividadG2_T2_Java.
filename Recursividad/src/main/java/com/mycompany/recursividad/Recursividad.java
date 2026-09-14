package com.mycompany.recursividad;

import recursividad.Recursividades;

public class Recursividad {
    public static void main(String[] args) {
        Recursividades oRecursividades = new Recursividades();

        System.out.println("==========================================");
        System.out.println("   PRACTICAS DE METODOS RECURSIVOS");
        System.out.println("==========================================");

        // --- TAREA 01 ---
        int numFactorial = 5;
        int resultadoFactorial = oRecursividades.calcularFactorial(numFactorial);
        System.out.println("\n[Tarea 1] Factorial de " + numFactorial + ": " + resultadoFactorial);

        // --- TAREA 02: Ejercicio 1 ---
        String texto = "programacion";
        System.out.println("\n[Tarea 2 - Ej 1] Numero de vocales en '" + texto + "': " + oRecursividades.vocales(texto));

        // --- TAREA 02: Ejercicio 2 ---
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
        System.out.println("\n[Tarea 2 - Ej 2] Numero con mayor suma de digitos: " + numeroMayor + " (Suma = " + mayorSuma + ")");

        // --- TAREA 02: Ejercicio 3 ---
        int n = 5;
        System.out.println("\n[Tarea 2 - Ej 3] Suma de los primeros " + n + " enteros positivos: " + oRecursividades.sumaNumeros(n));
    }
}
