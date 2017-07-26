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

    public void agregarProveedor(){}


}
/*
        if(woody instanceof Mecanico){//Juguete Mecanico
          this.listaJuguete.add(woody);
        }else if(woody instanceof Electronico){//Juguete Electronico
          this.listaJuguete.add(woody);
        }
*/
