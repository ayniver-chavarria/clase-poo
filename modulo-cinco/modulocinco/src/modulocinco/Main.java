package modulocinco;

public class Main {

    public static void main(String[] args) {

        // Circulo
        Circulo cir = new Circulo();
        cir.setColor("Rojo");
        cir.setRadio(cir.CalcularRadio(50));
        System.out.println(cir.Dibujar());
        System.out.println("Color del circulo: " + cir.getColor());
        System.out.println("Radio del circulo: " + cir.getRadio());
        
        // Linea
        System.out.println("");
        Linea li = new Linea();
        li.setColor("Negro");
        li.setLargo(10);
        System.out.println(li.Dibujar());
        System.out.println("Largo de linea: " + li.getLargo());
        System.out.println("Color de linea: " + li.getColor());

        // Triangulo
        System.out.println("");
        Triangulo trian = new Triangulo();
        trian.setColor("Verde");
        trian.setAngulo(43);
        double areaTriangulo = trian.CalcularArea(50, 25);
        System.out.println(trian.Dibujar());
        System.out.println("Angulo de triangulo: " + trian.getAngulo());
        System.out.println("Color del triangulo: " + trian.getColor());
        System.out.println("Area del triangulo: " + areaTriangulo);

        // Cuadrado
        System.out.println("");
        Cuadrado cuad = new Cuadrado();
        cuad.setColor("Amarillo");
        cuad.setArea(cuad.CalcularArea(20, 20));
        System.out.println("Color del cuadrado: " + cuad.getColor());
        System.out.println("Area del cuadrado: " + cuad.getArea());

    }

}
