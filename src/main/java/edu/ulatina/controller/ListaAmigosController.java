
package edu.ulatina.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "ListaAmigosController")
@SessionScoped
public class ListaAmigosController implements Serializable{
    private List<String> personaInfo=new ArrayList<>();
    private List<List> lstPersonas=new ArrayList<>();

    public List<String> getPersonaInfo() {
        return personaInfo;
    }

    public void setPersonaInfo(List<String> personaInfo) {
        this.personaInfo = personaInfo;
    }

    public List<List> getLstPersonas() {
        return lstPersonas;
    }

    public void setLstPersonas(List<List> lstPersonas) {
        this.lstPersonas = lstPersonas;
    }
    
    

    

    
    
    
    
}
