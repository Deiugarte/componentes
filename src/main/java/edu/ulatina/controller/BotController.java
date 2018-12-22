package edu.ulatina.controller;

import edu.ulatina.servicios.ServicioBot;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
//import org.primefaces.PrimeFaces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Luis
 */
@ManagedBean(name = "botController")
@ViewScoped
public class BotController implements Serializable {

    private Bot selectedBot;
    private String idBot;
    private String nombreBot;
    private String descripcionBot;
    private String persona_idPersona;
    private String linkBot;
    private List<Bot> bots = new ArrayList();
    ServicioBot BotDao = new ServicioBot();
    Bot bot = new Bot();
    private String Key;
    // private List<Bot> filteredBots = new ArrayList<>();


    /*@PostConstruct;
    public void init() {
        bots = new BotService().listAllBots();
        //filteredBots = bots;
    }

    /*public void pageRefresh() {
        PrimeFaces.current().executeScript("location.reload();");
    }*/
    public String getIdBot() {
        return idBot;
    }

    public void setIdBot(String idBot) {
        this.idBot = idBot;
    }

    public String getNombreBot() {
        return nombreBot;
    }

    public void setNombreBot(String nombreBot) {
        this.nombreBot = nombreBot;
    }

    public String getDescripcionBot() {
        return descripcionBot;
    }

    public void setDescripcionBot(String descripcionBot) {
        this.descripcionBot = descripcionBot;
    }

    public String getPersona_idPersona() {
        return persona_idPersona;
    }

    public void setPersona_idPersona(String persona_idPersona) {
        this.persona_idPersona = persona_idPersona;
    }

    public String getLinkBot() {
        return linkBot;
    }

    public void setLinkBot(String linkBot) {
        this.linkBot = linkBot;
    }

    public List<Bot> getBots() {
        return bots;
    }

    public void setBots(List<Bot> bots) {
        this.bots = bots;
    }

    /* public List<Bot> getFilteredBots() {
        return filteredBots;
    }

    public void setFilteredBots(List<Bot> filteredBots) {
        this.filteredBots = filteredBots;
    }*/
    public Bot getSelectedBot() {
        return selectedBot;
    }

    public void setSelectedBot(Bot selectedBot) {
        this.selectedBot = selectedBot;
    }

    public String getKey() {
        return Key;
    }

    public void setToken(String Key) {
        this.Key = Key;
    }

public void manejoToken() throws IOException {
        FacesContext fc = FacesContext.getCurrentInstance();
 
        if (bot.validarToken(Key)) {
            
            
            
                /*if (!bot.getNombreBot().isEmpty()) {
                    nombre = user.getNombre().toUpperCase().substring(0, 1) + user.getNombre().substring(1);
                } else {
                    nombre = user.getNombre();
                }
                if (!user.getApellido().isEmpty()) {
                    apellido = user.getApellido().toUpperCase().substring(0, 1) + user.getApellido().substring(1);
                } else {
                    apellido = user.getApellido();
                }
                telefono = user.getTelefono();
                fc.getApplication().getNavigationHandler().handleNavigation(fc, null, "bienvenida.xhtml?faces-redirect=true");
*/
        } else {
            fc.getCurrentInstance().addMessage("mensajes",
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!",
                            "Token Invalido"));
        }
    }
}
