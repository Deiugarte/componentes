package edu.ulatina.controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import edu.ulatina.servicios.ServicioPersona;
import edu.ulatina.entidades.Persona;


@ManagedBean(name = "loginController")
@SessionScoped
public class LoginController implements Serializable {

    private static final long serialVersionUID = 1L;

    //--------- Restablecer Contrasena" -----------
    private String correo; //SOLO PARA RESTABLECER CONTRASENA, 
    //USAR USER PARA TODO LO DEMAS...

    private String auxPass; // SOLO PARA RESTABLECER CONTRASENA,
    // USAR PASS PARA TODO LO DEMAS...

    private String veriCode = null, code;
    //---------- FIN Restablecer contrasena ---------

    private boolean logeado = false;

    private int intentos = 0; // para bloquear cuenta...
    private String user, pass;
    private String nombre, ape, ape2, naci, sexo, tel, email;
    private boolean estado = false;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void submit() {
    System.out.println("*NOMBRE*: " + nombre);
}
    public String userIsRegistered() throws Exception{
        ServicioPersona sp = new ServicioPersona();
        try{
            sp.getEntityManager();
            if(sp.buscarPorCorreo(this.email).getCorreo() != null){
                return "landing";                
            }
            return "signUp";
          
        } catch(Exception ex){
            System.out.println(ex);
            System.out.println("ERROR*");
        }      
        return "Error";
    }
    public void getDataFromResponse(String response) {
        System.out.println(response);
    }

    public LoginController() {

    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isLogeado() {
        return logeado;
    }

    public void setLogeado(boolean logeado) {
        this.logeado = logeado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getVeriCode() {
        return veriCode;
    }

    public void setVeriCode(String veriCode) {
        this.veriCode = veriCode;
    }

    public String getAuxPass() {
        return auxPass;
    }

    public void setAuxPass(String oldPass) {
        this.auxPass = oldPass;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

}
