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

    public Mecanico(int complejidad) {
        this.complejidad = complejidad;
    }

    public void setValorFinal(float valorUnitario,int complejidad, float valorAdicional) {
        float valorFinal = valorUnitario + complejidad* valorAdicional;
        super.setValorFinal(valorFinal);

    }

    public Mecanico(
            int id, float val_uni, String marca, int edad_minima,
            int id_Proveedor, float val_adicional, int complejidad) {
        super(id, val_uni, marca, edad_minima, id_Proveedor, val_adicional);
        this.complejidad = complejidad;
    }
}
