package tareamodulocuatro;

public class Main {

    public static void main(String[] args) {

        RealMadrid rm = new RealMadrid();
        Barcelona bl = new Barcelona();
        Liverpool lp = new Liverpool();

        // Parte I
        Futbolista futbolista = new Futbolista();
        futbolista.setNombre("Gerard Neuer");
        futbolista.setEdad(20);
        futbolista.setEquipoActual("Alemania");
        
        System.out.println(futbolista.getNombre());
        System.out.println(futbolista.getEdad());
        System.out.println(futbolista.getEquipoActual());
        
        // Parte II
        // Real Madrid
        System.out.print("Equipo: " + rm.getEquipo());
        System.out.println(" / Capitan: " + rm.getCapitan());

        // Barcelona
        System.out.print("Equipo: " + bl.getEquipo());
        System.out.println(" / Capitan: " + bl.getCapitan());

        // Liverpool
        System.out.print("Equipo: " + lp.getEquipo());
        System.out.println(" / Capitan: " + lp.getCapitan());
    }

}
