package modulo.uno;

import java.util.Scanner;

public class EjercicioCinco {

    public static void main(String[] args) {
        String[][] datosPersonales = {
            {"Maynor", "Coello", "Electronica", "Gildan Rio Nance"}, 
            {"Gerson", "Cartagena", "Produccion Industrial", "Caracol Knits"},
            {"Jeferson", "Davila", "Produccion Industrial", "Estudiante"},
            {"Kevin", "Rivas", "Electronica", "OHMSA"},
            {"Victor", "Hernandez", "Tecnico en Desarrollo Aplicaciones", "Estudiante"},
        };

        for (String[] companieros : datosPersonales) {
            for (String datos : companieros) {
                System.out.print(datos + " | ");
            }

            System.out.println();
        }
    }
}
