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
    
   private String color;
    private String year;
    private int id;
    private int price;
    private String idBot;
    private String nombreBot;
    private String descripcionBot;
    private String linkBot;

    public Bot() {

    }

    public Bot(String color, String year, int id, int price,String idBot, String nombreBot, String descripcionBot, String linkBot) {
        this.color = color;
        this.year = year;
        this.id = id;
        this.price = price;
        this.idBot = idBot;
        this.nombreBot = nombreBot;
        this.descripcionBot = descripcionBot;
        this.linkBot = linkBot;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public String getLinkBot() {
        return linkBot;
    }

    public void setLinkBot(String linkBot) {
        this.linkBot = linkBot;
    }
}
