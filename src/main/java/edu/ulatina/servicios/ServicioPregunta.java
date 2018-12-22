/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.servicios;

import edu.ulatina.entidades.Pregunta;
import edu.ulatina.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author murip
 */

@ManagedBean(name = "preguntaService")
@ApplicationScoped
public class ServicioPregunta extends HibernateUtil{
    public void insertarPregunta(Pregunta pregunta) throws Exception {
        super.insert(pregunta);
    }

    public List<Pregunta> getAllPreguntas() {
        List<Pregunta> daoAllPreguntas = new ArrayList<>();
        try {
            String jpql = "SELECT t FROM " + Pregunta.class.getSimpleName() + " t";
            daoAllPreguntas= this.getEntityManager().createQuery(jpql, Pregunta.class).getResultList();
            
            if (daoAllPreguntas != null){
                
            
                for (Pregunta b : daoAllPreguntas) {
                    System.out.println(" Nombre con JPQL: " + b.getContenido());
                }
            }
            else{
                System.out.println("Lista no encontrada");
                return null;
            }
            

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error*");
        }
        return daoAllPreguntas;
    }
}
