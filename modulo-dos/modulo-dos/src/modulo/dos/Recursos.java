package modulo.dos;

import java.util.ArrayList;

public class Recursos {

    // Primer Metodo
    public String mensaje() {
        return "Programacion Orientada a Objetos 2022";
    }

    // Segundo Metodo
    public String verificarEdad(int edadRecibida) {
        int edad = edadRecibida;
        String verificacion;
        if (edad >= 21) {
            verificacion = "Mayor de Edad";
        } else {
            verificacion = "Menor de Edad";
        }

        return verificacion;
    }

    // Tercer Metodo
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Cuarto Metodo
    public int[] listaDeNumeros(int numero) {
        int numeroLimite = numero;

        int listaNumeros[] = new int[numeroLimite];

        for (int i = 0; i < numeroLimite; i++) {
            listaNumeros[i] = i + 1;
        }

        return listaNumeros;
    }
}
