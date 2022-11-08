package modulocinco;

public class Linea extends Formas {

    private double largo;

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String Dibujar() {
        return "Linea";
    }

}
