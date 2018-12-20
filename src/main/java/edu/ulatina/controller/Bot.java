package edu.ulatina.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mariela Giraldo
 */
public class Bot {

    private String idBot;
    private String nombreBot;
    private String descripcionBot;
    private String persona_idPersona;
    private String linkBot;

    public Bot() {

    }

    public Bot(String idBot, String nombreBot, String descripcionBot, String persona_idPersona, String linkBot) {
        this.idBot = idBot;
        this.nombreBot = nombreBot;
        this.descripcionBot = descripcionBot;
        this.persona_idPersona = persona_idPersona;
        this.linkBot = linkBot;
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
}
