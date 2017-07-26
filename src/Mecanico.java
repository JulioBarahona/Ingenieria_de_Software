/**
 * Created by Julio on 7/17/2017.
 */
public class Mecanico extends Juguete {
    private int complejidad;

    public float calcularPrecio(){
      float precio =this.getVal_uni() + this.getVal_adicional()*this.getComplejidad();
      return precio;
    }

    public int getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(int complejidad) {
        this.complejidad = complejidad;
    }
}
