/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.servicios;

import edu.ulatina.entidades.RedSocial;
import edu.ulatina.util.HibernateUtil;

/**
 *
 * @author jean
 */
public class ServicioRedSocial extends HibernateUtil {

    public void insertarPersona(RedSocial red) throws Exception {
        super.insert(red);
    }

    public RedSocial buscarPorNombre(String nombre) throws Exception {
        RedSocial red = (RedSocial) super.getEm().createNamedQuery("RedSocial.findByNombre").setParameter("nombre", new String(nombre))
                .getSingleResult();
        return red;
    }
}
