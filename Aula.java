
public class Aula {
  int id_aula;
  String nombre;
  int numSilla;

    public Aula(int id_aula, String nombre, int numSilla) {
        this.id_aula = id_aula;
        this.nombre = nombre;
        this.numSilla = numSilla;
    }

    public int getId_aula() {
        return id_aula;
    }

    public void setId_aula(int id_aula) {
        this.id_aula = id_aula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumSilla() {
        return numSilla;
    }

    public void setNumSilla(int numSilla) {
        this.numSilla = numSilla;
    }

    @Override
    public String toString() {
        return "Aula{" + "id_aula=" + id_aula + ", nombre=" + nombre + ", numSilla=" + numSilla + '}';
    }
  
}
