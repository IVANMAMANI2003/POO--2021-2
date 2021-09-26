/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author HP
 */
public class Persona {
    private int id;
    private String Nombres;
    private String Ap_paterno;
    private String Ap_materno;
    private String sexo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getAp_paterno() {
        return Ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.Ap_paterno = ap_paterno;
    }

    public String getAp_materno() {
        return Ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.Ap_materno = ap_materno;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
