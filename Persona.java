
public class Persona {
   String DNI;
   String nombre;
   int edad;
   String sexo;

    public Persona(String DNI, String nombre, int edad, String sexo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + '}';
    }

 
 
   
   
   
}
