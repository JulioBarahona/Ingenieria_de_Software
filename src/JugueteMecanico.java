/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Ramirez
 */
public class JugueteMecanico extends Juguete {
   
    // Atributos
    private int complejidad;

    // Contructor
    public JugueteMecanico(int id, float val_unit, String marca, int edad_minima, int no_provedor, float val_adicional) {
        super(id, val_unit, marca, edad_minima, no_provedor, val_adicional);
    }
    
    // Calculamos el precio de un juguete
    public float preciofinal (float val_uni, float val_adicional, int complejidad){
     
        float precio = val_uni + (val_adicional*complejidad);
        return precio;
    }
}

