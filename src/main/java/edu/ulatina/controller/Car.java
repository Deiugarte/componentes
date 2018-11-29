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
public class Car {
    
    private String color;
    private String year;
    private int id;
    private int price;

    public Car() {

    }

    public Car(String color, String year, int id, int price) {
        this.color = color;
        this.year = year;
        this.id = id;
        this.price = price;
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
}
