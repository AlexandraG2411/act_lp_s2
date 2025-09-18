package com.example;

public class Ejercicio7 {
    public static void ejercicio7() {
        System.out.println("Ejercicio 7");
        
        String nombre = "Juan";
        String apellido = "Pérez";
        int edad = 20;

        String nombreCompleto = nombre + " " + apellido;
        String saludo ="Hola " .concat(nombreCompleto);
        String mensajeEdad = "Tengo " + edad + " años";

        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Saludo: " + saludo);
        System.out.println("Mensaje de edad: " + mensajeEdad);
        
    }
}
