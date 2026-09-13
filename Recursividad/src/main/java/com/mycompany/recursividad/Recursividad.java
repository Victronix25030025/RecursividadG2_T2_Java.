package com.mycompany.recursividad;

import recursividad.Recursividades;

public class Recursividad {
    public static void main(String[] args) {
        System.out.println("Métodos recursivos");
        System.out.println("\n\nCalcular factorial de 5");
        
        Recursividades oRecursividades = new Recursividades();
        int resultado = oRecursividades.calcularFactorial(5);
        
        System.out.println("Factorial de 5: " + resultado);
    }
}

