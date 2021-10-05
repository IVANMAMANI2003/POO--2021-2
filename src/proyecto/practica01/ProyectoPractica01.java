
package proyecto.practica01;

import entidad.Persona;
import implementacion.*;
import java.util.Scanner;

public class ProyectoPractica01 {
    Scanner teclado= new Scanner(System.in);
    public static void datos(){
        ImplPersona Ip = new ImplPersona();
        Persona p1=new Persona();
        String nombre;
        p1.setNombres(" Ivan ");
        p1.setAp_paterno("Mamani ");
        p1.setAp_materno("Merma ");
        p1.setSexo("  M  ");


        Persona p2 = new Persona();
        p2.setNombres(" Luis ");
        p2.setAp_paterno("Quispe ");
        p2.setAp_materno("Ortiz ");
        p2.setSexo("  M  ");    

        Persona p3 =new Persona();
        p3.setNombres(" Pedro ");
        p3.setAp_paterno(" Gomez ");
        p3.setAp_materno(" Fujimori ");
        p3.setSexo("  M  ");  

        Ip.create(p1);
        Ip.create(p2);
        Ip.create(p3);

        for(Persona p : Ip.list()){
        System.out.println("");
        System.out.print(p.getId());
        System.out.print(p.getNombres());
        System.out.print(p.getAp_paterno());
        System.out.print(p.getAp_materno());
        System.out.print(p.getSexo());
        }
}
    public static void delete(){
        Scanner teclado= new Scanner(System.in);
                
        datos();
        ImplPersona Ip = new ImplPersona();
        for(Persona p : Ip.list()){
        System.out.println("");
        System.out.print(p.getId());
        System.out.print(p.getNombres());
        System.out.print(p.getAp_paterno());
        System.out.print(p.getAp_materno());
        System.out.print(p.getSexo());
        }
        int idEliminar;
        System.out.println("\ningrese el id de los datos a eliminar");
        idEliminar=teclado.nextInt();
        Ip.delete(idEliminar);
        System.out.println("despues de eliminar");
        for(Persona p : Ip.list()){
        System.out.println("");
        System.out.print(p.getId());
        System.out.print(p.getNombres());
        System.out.print(p.getAp_paterno());
        System.out.print(p.getAp_materno());
        System.out.print(p.getSexo());
        }
    }
    
    public static void datosE(){
        Scanner teclado= new Scanner(System.in);
        ImplPersona Ip = new ImplPersona();
        String id;
        String nombres;
        String Ap_paterno;
        String Ap_materno;
        int Sexo;
        System.out.println("ingrese el nombre");
        nombres= teclado.nextLine();
        System.out.println("ingrese el apellido paterno");
        Ap_paterno= teclado.nextLine();
        System.out.println("ingrese el apellido materno");
        Ap_materno= teclado.nextLine();
        System.out.println("ingrese el sexo");
        Sexo= teclado.nextInt();
        

        System.out.println(nombres+" "+ Ap_paterno+" "+ Ap_materno+"  ...... "+Sexo);
    }
            
    public static void menumain(){
                Scanner teclado= new Scanner(System.in);
        ImplPersona Ip = new ImplPersona();
        Persona p1=new Persona();
        int opcion=0;
        
        do{
            System.out.println("1 listar");
            System.out.println("2 eliminar");
            System.out.println("3 crear");
            System.out.println("1ingrese la opcion ");
            opcion = teclado.nextInt();
            //opt= input.nextLine();
            switch(opcion){
                
            case 1:
                datos();
            break;
            case 2:
                delete();
                break;
            case 3:
                datosE();
                break;
            }
        }while (opcion!=0);  
        
    }
    public  static void main(String[] args) {
        // TODO code application logic here
        menumain();
    
    }


    
}
