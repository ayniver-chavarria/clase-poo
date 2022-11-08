package modulo.dos;

public class Main {

    public static void main(String[] args) {

        // Instancia de objeto de la clase Recursos
        Recursos objetoRecursos = new Recursos();

        // Primer Metodo
        System.out.println("Primer metodo - Mensaje: " + objetoRecursos.mensaje());

        // Segundo Metodo
        int edad = 10;
        System.out.println("Segundo metodo - Mayor o Menor de Edad: " + objetoRecursos.verificarEdad(edad));

        // Tercer Metodo
        System.out.println("Tercer metodo - Multiplicacion de dos numeros enteros: " + objetoRecursos.multiplicar(20, 40));

        // Cuarto Metodo
        System.out.println("Cuarto Metodo - Lista de Numeros de 1 al X");
        int listaNumeros[] = objetoRecursos.listaDeNumeros(30);

        for (int listaNumero : listaNumeros) {
            System.out.println(listaNumero);
        }
    }

}
