/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.servicios;

import edu.ulatina.entidades.ListaBot;
import edu.ulatina.util.HibernateUtil;
import java.util.List;

/**
 *
 * @author Luis
 */
public class ServicioBot extends HibernateUtil {

    public void insertarBot(ListaBot bot) throws Exception {
        super.insert(bot);
    }

    public List<ListaBot> getListaBot() {
        String jpql = "SELECT t FROM " + ListaBot.class.getSimpleName() + " t";
        List<ListaBot> listaBot = em.createQuery(jpql, ListaBot.class).getResultList();
        if (listaBot != null) {
            for (ListaBot b : listaBot) {
                System.out.println(" Nombre con JPQL: " + b.getNombreBot());
            }
        } else {
            System.out.println("Lista no encontrada");
            return null;
        }
        return listaBot;

    }
}
