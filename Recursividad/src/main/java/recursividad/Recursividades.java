package recursividad;

public class Recursividades {
    
    public int calcularFactorial(int num) {
        // Caso base o condición de salida
        if (num == 0) {
            return 1;
        }
        
        // Caso general
        return num * calcularFactorial(num - 1);
    }
}