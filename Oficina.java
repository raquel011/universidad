
public class Oficina {
int id_off;
String nombre;
String otros;

    public Oficina(int id_off, String nombre, String otros) {
        this.id_off = id_off;
        this.nombre = nombre;
        this.otros = otros;
    }

    public int getId_off() {
        return id_off;
    }

    public void setId_off(int id_off) {
        this.id_off = id_off;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    @Override
    public String toString() {
        return "Oficina{" + "id_off=" + id_off + ", nombre=" + nombre + ", otros=" + otros + '}';
    }

}
