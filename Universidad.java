
import java.util.Scanner;


public class Universidad {
   
    
    int indice;
    int id_uni;
    String nombre;
    String ruc;
    String ciuda;

    public Universidad(int id_uni, String nombre, String ruc, String ciuda) {
        this.id_uni = id_uni;
        this.nombre = nombre;
        this.ruc = ruc;
        this.ciuda = ciuda;
    }

    Universidad() {
      
    }

    public int getId_uni() {
        return id_uni;
    }

    public void setId_uni(int id_uni) {
        this.id_uni = id_uni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getCiuda() {
        return ciuda;
    }

    public void setCiuda(String ciuda) {
        this.ciuda = ciuda;
    }
    public void agregarUni(){
            Scanner leer=new  Scanner(System.in);
         
         System.out.print("ingrese id:");
         id_uni =leer.nextInt();
         this.setId_uni(id_uni);
         
          System.out.print("ingrese nombre:");
          nombre =leer.next();
           this.setNombre(nombre);
         
           System.out.print("ingrese ruc:");
             ruc =leer.next();
             this.setRuc(ruc);
             
            System.out.print("ingrese ciudad:");
            ciuda=leer.next();
            this.setCiuda(ciuda);
    
    }

 @Override
    public String toString() {
        return "Universidad{" + "id_uni=" + id_uni + ", nombre=" + nombre + ", ruc=" + ruc + ", ciuda=" + ciuda + '}';
    }
    
    
}
