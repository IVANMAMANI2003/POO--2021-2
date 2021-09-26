/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;
import entidad.Persona;
import java.util.*;
/**
 *
 * @author HP
 */

public class ImplPersona {
    
    List<Persona> lis=new ArrayList<>();
    private int id;
    public void create(Persona p){
        id=id+1;
        p.setId(id);
        lis.add(p);
    }
    public List<Persona> list(){
    return lis;
    }
    
    public void delete (int id){
        for(Persona  ps : lis){
        if(id==ps.getId()){
            System.out.print("eliminado"+ps.getNombres());
            lis.remove(ps);
        }
    }
    }
    
}
