package com.example;

public class Ejercicio8 {
    public static void ejercicio8() {
        System.out.println("Ejercicio 8");
        
        // puede empezar con letra minuscula
        int miVariable = 10;
        // puede empezar con guion bajo
        int _contador = 20;
        // puede empezar con signo de dólar
        double $precio = 99.000;
        // puede tener numeros, siempre y cuando no se inicie con ellos
        String variable123 = "Hola Mundo";

        // nombres invalidos
        // int 123variable; / No puede iniciar con numeros
        // int class; / Es una palabra clave reservada de Java
        // int public; / Es una palabra clave reservada de Java

        System.out.println("El valor de miVariable es: " + miVariable);
        System.out.println("El valor de _contador es: " + _contador);
        System.out.println("El valor de $precio es: " + $precio);
        System.out.println("El valor de variable123 es: " + variable123);
        

    }
}
