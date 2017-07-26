/**
 * Created by Julio on 7/17/2017.
 */
public class Electronico extends Juguete {

    public void setValorFinal(float valorUnitario,float valorAdicional) {
        float valorFinal = valorUnitario + 2* valorAdicional;
        super.setValorFinal(valorFinal);

    }

    public Electronico() {
    }

    public Electronico(int id, float val_uni, String marca, int edad_minima, int id_Proveedor, float val_adicional) {
        super(id, val_uni, marca, edad_minima, id_Proveedor, val_adicional);
    }
}
