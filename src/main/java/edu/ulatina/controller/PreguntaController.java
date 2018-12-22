/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.controller;

import edu.ulatina.entidades.Pregunta;
import edu.ulatina.servicios.ServicioPregunta;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author murip
 */

@ManagedBean(name = "preguntaController")
@SessionScoped
public class PreguntaController implements Serializable{
    
    private Pregunta pregunta;
    private List<Pregunta> listaPregunta;
    @ManagedProperty("#{preguntaService}")
    private ServicioPregunta servicioPregunta;
    
    @PostConstruct
    public void init() {
        listaPregunta = servicioPregunta.getAllPreguntas();
    }

    public PreguntaController() {
    }

    public PreguntaController(Pregunta pregunta, List<Pregunta> listaPregunta, ServicioPregunta servicioPregunta) {
        this.pregunta = pregunta;
        this.listaPregunta = listaPregunta;
        this.servicioPregunta = servicioPregunta;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public List<Pregunta> getListaPregunta() {
        //listaPregunta = servicioPregunta.getAllPreguntas();
        return listaPregunta;
    }

    public void setListaPregunta(List<Pregunta> listaPregunta) {
        this.listaPregunta = listaPregunta;
    }

    public ServicioPregunta getServicioPregunta() {
        return servicioPregunta;
    }

    public void setServicioPregunta(ServicioPregunta servicioPregunta) {
        this.servicioPregunta = servicioPregunta;
    }
    
    
    
}
