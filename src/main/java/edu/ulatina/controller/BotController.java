package edu.ulatina.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
//import org.primefaces.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mariela Giraldo
 */
@ManagedBean(name = "botController")
@ViewScoped
public class BotController implements Serializable {

    //private List<Bot> cars = new ArrayList<>();
    private Bot selectedBot;
    private String idBot;
    private String nombreBot;
    private String descripcionBot;
    private String persona_idPersona;
    private String linkBot;
    private List<Bot> bots = new ArrayList<>();
    // private List<Bot> filteredBots = new ArrayList<>();

    /* @PostConstruct
    public void init() {
        Bot car1 = new Bot("Red", "Mateo", 125, 13);
        Bot car2 = new Bot("Green", "Fecha", 345, 69);
        Bot car3 = new Bot("Blue", "Deberias", 675, 420);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
    }*/
    @PostConstruct
    public void init() {
        bots = new BotService().listAllBots();
        //filteredBots = bots;
    }

    /*public void pageRefresh() {
        PrimeFaces.current().executeScript("location.reload();");
    }*/
    public void addBot() {
        Bot b = new Bot();
        b.setIdBot(idBot);
        b.setNombreBot(nombreBot);
        b.setDescripcionBot(descripcionBot);
        b.setPersona_idPersona(persona_idPersona);
        b.setLinkBot(linkBot);
        new BotService().addBot(b);
        // PrimeFaces.current().executeScript("PF('dlgBot').hide()");
        idBot = "";
        nombreBot = "";
        descripcionBot = "";
        persona_idPersona = "";
        linkBot = "";
        init();
        //pageRefresh();
    }

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

}
