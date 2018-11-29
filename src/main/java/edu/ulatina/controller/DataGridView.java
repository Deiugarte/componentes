package edu.ulatina.controller;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mariela Giraldo
 */
@ManagedBean (name = "dataGridView")
@ViewScoped
public class DataGridView implements Serializable {

    private List<Car> cars = new ArrayList<>();
    private Car selectedCar;

    @PostConstruct
    public void init() {
        Car car1 = new Car("Red", "Mateo", 125, 13);
        Car car2 = new Car("Green", "Fecha", 345, 69);
        Car car3 = new Car("Blue", "Deberias", 675, 420);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Car getSelectedCar() {
        return selectedCar;
    }

    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }
    
 }
