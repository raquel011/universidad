
public class Departamento {
   int id ;
   String nombre;
   String decano;

    public Departamento(int id, String nombre, String decano) {
        this.id = id;
        this.nombre = nombre;
        this.decano = decano;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDecano() {
        return decano;
    }

    public void setDecano(String decano) {
        this.decano = decano;
    }

    @Override
    public String toString() {
        return "Departamento{" + "id=" + id + ", nombre=" + nombre + ", decano=" + decano + '}';
    }
   
   
    
    
}
