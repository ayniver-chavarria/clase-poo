package modulo.uno;

public class EjercicioTres {

    public static void main(String[] args) {
        int m = 6, t = 1, k = -10;
        boolean primeraExpresion, segundaExpresion, terceraExpresion;

        primeraExpresion = m > t;
        System.out.println("Resultado primera expresion: " + primeraExpresion);

        segundaExpresion = t / k == -5;
        System.out.println("Resultado segunda expresion: " + segundaExpresion);

        terceraExpresion = (m + t == 7) || (m - t == 5);
        System.out.println("Resultado tercerca expresion: " + terceraExpresion);
        
    }
}
