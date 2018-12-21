
package edu.ulatina.controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "ListaAmigosController")
@SessionScoped
public class ListaAmigosController implements Serializable{
    private String data;

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
    
}
