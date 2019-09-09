
public class Empleado extends Persona{
     String cargo;

    public Empleado(String DNI, String nombre, int edad, String sexo) {
        super(DNI, nombre, edad, sexo);
    }

    public Empleado(String cargo, String DNI, String nombre, int edad, String sexo) {
        super(DNI, nombre, edad, sexo);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "cargo=" + cargo + '}';
    }
    
}
