package modulocinco;

public class Cuadrado extends Formas {

    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String Dibujar() {
        return "Cuadrado";
    }

    public double CalcularArea(double l1, double l2) {
        double ladoUno = l1, ladoDos = l2;

        double area = ladoUno * ladoDos;

        return area;
    }
}
