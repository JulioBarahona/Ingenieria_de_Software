/**
 * Created by Julio on 7/17/2017.
 */
public class Juguete {
    private int id;
    private float val_uni;
    private float valorFinal;
    private String marca;
    private int edad_minima;
    private int id_Proveedor;
    private float val_adicional;

    public Juguete(){

        id=0;
        val_uni= 0;
        marca="";
        edad_minima=0;
        id_Proveedor=0;
        val_adicional=0;
        valorFinal = 0;

    }
    public Juguete(int id, float val_uni, String marca, int edad_minima, int id_Proveedor, float val_adicional){
        this.id=id;
        this.val_uni=val_uni;
        this.marca=marca;
        this.edad_minima=edad_minima;
        this.id_Proveedor=id_Proveedor;
        this.val_adicional=val_adicional;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getVal_uni() {
        return val_uni;
    }

    public void setVal_uni(float val_uni) {
        this.val_uni = val_uni;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getEdad_minima() {
        return edad_minima;
    }

    public void setEdad_minima(int edad_minima) {
        this.edad_minima = edad_minima;
    }

    public float getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(float valorFinal) {
        this.valorFinal = valorFinal;
    }

    public float getVal_adicional() {
        return val_adicional;
    }

    public void setVal_adicional(float val_adicional) {
        this.val_adicional = val_adicional;
    }
    public int getId_Proveedor() {
        return id_Proveedor;
    }

    public void setId_Proveedor(int id_Proveedor) {
        this.id_Proveedor = id;
    }
}
