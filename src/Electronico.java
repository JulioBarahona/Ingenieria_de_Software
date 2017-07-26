/**
 * Created by Julio on 7/17/2017.
 */
public class Electronico extends Juguete {

  public float calcularPrecio(){
    float precio =this.getVal_uni() + 2*this.getVal_adicional();
    return precio;
  }
}
