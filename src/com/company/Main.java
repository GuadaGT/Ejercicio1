package com.company;
import java.util.Scanner;

import static com.company.BibliotecaMatematica.*;

public class Main {
    public static void main(String[] args) {
        //Crea una biblioteca de funciones matemáticas que contenga las siguientes funciones. Recuerda
        //que puedes usar unas dentro de otras si es necesario.
        //1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso
        //contrario, el número será de 5 cifras.
        //2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
        //3. potencia: Dada una base y un exponente devuelve la potencia.
        //4. digitos: Cuenta el número de dígitos de un número entero.
        //5. quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
        //6. quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).
        //7. pegaPorDetras: Añade un dígito a un número por detrás.
        //8. pegaPorDelante: Añade un dígito a un número por delante.
        //9. juntaNumeros: Pega dos números para formar uno.
        //Haz en el método principal una menu que permita utilizar estas funciones y si eligen 0 terminar la apliación.
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nMenú");
            System.out.println("1. Comprobar si un número es capicua");
            System.out.println("2. Comprobar si un número es primo");
            System.out.println("3. Calcular la potencia de un numero");
            System.out.println("4. Contar el numero de dígitos de un numero");
            System.out.println("5. Quitar digitos por detrás de un numero");
            System.out.println("6. Quitar digitos por delante de un numero");
            System.out.println("7. Anyadir un digito por detrás de un numero");
            System.out.println("8. Anyadir un digito por delante de un numero");
            System.out.println("9. Unir dos numeros");
            System.out.println("0. Salir");
            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Introduce un número de 5 cifras: ");
                    int num1 = sc.nextInt();
                    if (BibliotecaMatematica.esCapicua(num1)) {
                        System.out.println(num1 + " es capicúa");
                    } else {
                        System.out.println(num1 + " no es capicúa");
                    }
                    break;
                case 2:
                    System.out.print("Introduce un número: ");
                    int num2 = sc.nextInt();
                    if (BibliotecaMatematica.esPrimo(num2)) {
                        System.out.println(num2 + " es primo");
                    } else {
                        System.out.println(num2 + " no es primo");
                    }
                    break;
                case 3:
                    System.out.print("Introduce la base: ");
                    double base = sc.nextDouble();
                    System.out.print("Introduce el exponente: ");
                    int exponente = sc.nextInt();
                    System.out.println(base + "^" + exponente + " = " + BibliotecaMatematica.potencia(base, exponente));
                    break;
                case 4:
                    System.out.print("Introduce un número: ");
                    int numero3 = sc.nextInt();
                    System.out.println(numero3 + " tiene " + BibliotecaMatematica.digitos(numero3) + " dígitos");
                    break;
                case 5:
                    System.out.print("Introduce un número: ");
                    int numero4 = sc.nextInt();
                    System.out.print("Introduce el número de dígitos a quitar por detrás: ");
                    int n1 = sc.nextInt();
                    System.out.println("El número resultante es " + BibliotecaMatematica.quitaPorDetras(numero4, n1));
                    break;
                case 6:
                    System.out.print("Introduce un número: ");
                    int numero5 = sc.nextInt();
                    System.out.print("Introduce el número de dígitos a quitar por delante: ");
                    int n2 = sc.nextInt();
                    System.out.println("El número resultante es " + BibliotecaMatematica.quitaPorDelante(numero5, n2));
                    break;
                case 7:
                    System.out.print("\nIntroduce un número: ");
                    int numeroDetras2 = sc.nextInt();
                    System.out.print("Introduce el dígito que quieres añadir por detrás: ");
                    int digitoDetras = sc.nextInt();
                    System.out.println("El número resultante es " + pegaPorDetras(numeroDetras2, digitoDetras));
                    break;
                case 8:
                    System.out.print("\nIntroduce un número: ");
                    int numeroDelante2 = sc.nextInt();
                    System.out.print("Introduce el dígito que quieres añadir por delante: ");
                    int digitoDelante = sc.nextInt();
                    System.out.println("El número resultante es " + pegaPorDelante(numeroDelante2, digitoDelante));
                    break;
                case 9:
                    System.out.print("\nIntroduce el primer número: ");
                    int numero1 = sc.nextInt();
                    System.out.print("Introduce el segundo número: ");
                    int numero2 = sc.nextInt();
                    System.out.println("El número resultante es " + juntaNumeros(numero1, numero2));
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 0);
    }

}
