package modulo.tres;

public class Main {

    public static void main(String[] args) {
        
        Ingeniero ingeniero = new Ingeniero();
        ingeniero.setNombre("Ayniver Jaquelin");
        ingeniero.setApellido("Chavarria Padilla");
        ingeniero.setEdad(20);
        ingeniero.setEspecialidad("Produccion Industrial");
        ingeniero.setAniosExperiencia(1);
        
        System.out.println("Nombre: " + ingeniero.getNombre());
        System.out.println("Apellido: " + ingeniero.getApellido());
        System.out.println("Edad: " + ingeniero.getEdad());
        System.out.println("Especialidad: " + ingeniero.getEspecialidad());
        System.out.println("Experiencia (anios): " + ingeniero.getAniosExperiencia());
        
    }
}
