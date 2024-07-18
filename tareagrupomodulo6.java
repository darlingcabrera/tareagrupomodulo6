// Superclase Persona
abstract class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void mostrarInfo();
}

// Subclase Doctor
class Doctor extends Persona {
    private String especialidad;

    public Doctor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

   
    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Especialidad: " + especialidad);
    }
}

// Subclase Deportista
class Deportista extends Persona {
    private String deporte;

    public Deportista(String nombre, int edad, String deporte) {
        super(nombre, edad);
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

  
    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Deporte: " + deporte);
    }
}

// Clase principal
public class tareagrupomodulo6 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Juan Pérez", 45, "Cardiología");
        Deportista deportista = new Deportista("Ana Gómez", 23, "Atletismo");

        doctor.mostrarInfo();
        System.out.println();
        deportista.mostrarInfo();
    }
}
