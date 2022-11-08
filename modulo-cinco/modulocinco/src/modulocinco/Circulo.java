package modulocinco;

public class Circulo extends Formas {

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String Dibujar() {
        return "Circulo";
    }

    public double CalcularRadio(float dia) {
        double diametro = dia;

        double radio = diametro / 2;

        return radio;

    }

}
