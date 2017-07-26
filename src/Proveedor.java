import java.util.ArrayList;

/**
 * Created by Julio on 7/17/2017.
 */
public class Proveedor {
    private int id_Proveedor;
    private ArrayList<Juguete> toysManufactured = new ArrayList<Juguete>();

    public int getId_Proveedor() {
        return id_Proveedor;
    }

    public void setId_Proveedor(int id_Proveedor) {
        this.id_Proveedor = id_Proveedor;
    }

    public ArrayList<Juguete> getToysManufactured() {
        return toysManufactured;
    }

    public void setToysManufactured(ArrayList<Juguete> toysManufactured) {
        this.toysManufactured = toysManufactured;
    }

    public void addNewToy(){

    }
}
