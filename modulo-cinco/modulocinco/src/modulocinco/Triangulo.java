package modulocinco;

public class Triangulo extends Formas {

    private double angulo;

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    @Override
    public String Dibujar() {
        return "Triangulo";
    }

    public double CalcularArea(double ba, double alt) {
        double base = ba, altura = alt;

        double area = (base * altura) / 2;

        return area;

    }

}
