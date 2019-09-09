
public class Profesor extends Persona{

    public Profesor(String DNI, String nombre, int edad, String sexo) {
        super(DNI, nombre, edad, sexo);
    }
    String especialidad;
    String categoria;

    public Profesor(String especialidad, String categoria, String DNI, String nombre, int edad, String sexo) {
        super(DNI, nombre, edad, sexo);
        this.especialidad = especialidad;
        this.categoria = categoria;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Profesor{" + "especialidad=" + especialidad + ", categoria=" + categoria + '}';
    }
    
    
}
