/**
 * Created by Julio on 7/17/2017.
 */

import java.util.ArrayList;

public class Controlador{

    private ArrayList<Juguete> listaJuguete;
    private Controlador instancia;

    private Controlador(){
      listaJuguete = new ArrayList<Juguete>();
    }
    public Controlador getInstancia(){
      if(instancia==null)
        this.instancia = new Controlador();
      return instancia;
    }

    public void agregarJugete(Juguete woody){
      this.listaJuguete.add(woody);
    }
    public boolean eliminarJuguete(Juguete buzz){
      return this.listaJuguete.remove(buzz);
    }

    public boolean modificarJuguete(Juguete slinky){
      for(int x=0;x<listaJuguete.size();x++){
        if(listaJuguete.get(x).getId()==slinky.getId()){
          listaJuguete.set(x, slinky);
          return true;
        }
      }
      return false;
    }

    public Juguete buscarJuguete(int idJuguete){
      for(Juguete rex: listaJuguete){
        if(rex.getId()==idJuguete){
          return rex;
        }
      }
      return null;
    }

    public float obtenerJugueteMasCaro(){
      float precio=0;
      Juguete buzz= new Juguete();
      for(Juguete rex: listaJuguete){
        if(rex instanceof Mecanico){//Juguete Mecanico
          if(precio<((Mecanico)rex).calcularPrecio()){
            precio=((Mecanico)rex).calcularPrecio();
            buzz=rex;
          }
        }else if(rex instanceof Electronico){//Juguete Electronico
          if(precio<((Electronico)rex).calcularPrecio()){
            precio=((Electronico)rex).calcularPrecio();
            buzz=rex;
          }
        }
      }
      return buzz.getId();
    }
    public void agregarProveedor(){}


}
