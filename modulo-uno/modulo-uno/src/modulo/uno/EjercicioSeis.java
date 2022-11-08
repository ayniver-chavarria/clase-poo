package modulo.uno;

import java.util.Scanner;

public class EjercicioSeis {

    public static void main(String[] args) {

        String nombre = "Ayniver Jaquelin Chavarria", estado;
        float nota = 85;
        
        if(nota >= 70){
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }
        
        System.out.println("Nombre estudiante: " + nombre);
        System.out.println("Nota: " + nota);
        System.out.println("Estado: " + estado);
        
    }
}
