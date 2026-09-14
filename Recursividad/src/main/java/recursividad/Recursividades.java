package recursividad;

public class Recursividades {
    
    // --- TAREA 01: Factorial ---
    public int calcularFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * calcularFactorial(num - 1);
    }

    // --- TAREA 02: Ejercicio 1 - Contar vocales ---
    public int vocales(String cadena) {
        if (cadena.isEmpty()) {
            return 0;
        }
        char c = Character.toLowerCase(cadena.charAt(0));
        int esVocal = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
        return esVocal + vocales(cadena.substring(1));
    }

    // --- TAREA 02: Ejercicio 2 - Sumar los dígitos de un número ---
    public int sumaDigitos(int numero) {
        if (numero < 10) {
            return numero;
        }
        return (numero % 10) + sumaDigitos(numero / 10);
    }

    // --- TAREA 02: Ejercicio 3 - Sumar los primeros n enteros positivos ---
    public int sumaNumeros(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumaNumeros(n - 1);
    }
}