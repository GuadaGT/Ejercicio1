package com.company;

public class BibliotecaMatematica {
    // Función que devuelve true si el número es capicúa y false en caso contrario
    public static boolean esCapicua(int numero) {
        String numeroString = Integer.toString(numero);
        return numeroString.equals(new StringBuilder(numeroString).reverse().toString());
    }

    // Función que devuelve true si el número es primo y false en caso contrario
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Función que devuelve la potencia de una base elevada a un exponente
    public static double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    // Función que cuenta el número de dígitos de un número entero
    public static int digitos(int numero) {
        return Integer.toString(numero).length();
    }

    // Función que quita n dígitos por detrás de un número
    public static int quitaPorDetras(int numero, int n) {
        return numero / (int) Math.pow(10, n);
    }

    // Función que quita n dígitos por delante de un número
    public static int quitaPorDelante(int numero, int n) {
        String numeroString = Integer.toString(numero);
        return Integer.parseInt(numeroString.substring(n));
    }

    // Función que añade un dígito al final de un número
    public static int pegaPorDetras(int numero, int digito) {
        return numero * 10 + digito;
    }

    // Función que añade un dígito al principio de un número
    public static int pegaPorDelante(int numero, int digito) {
        String numeroString = Integer.toString(numero);
        return Integer.parseInt(digito + numeroString);
    }

    // Función que pega dos números para formar uno
    public static int juntaNumeros(int numero1, int numero2) {
        String numero1String = Integer.toString(numero1);
        String numero2String = Integer.toString(numero2);
        return Integer.parseInt(numero1String + numero2String);
    }
}
