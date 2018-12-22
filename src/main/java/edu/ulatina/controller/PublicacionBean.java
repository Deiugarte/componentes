/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.controller;

import edu.ulatina.entidades.Publicacion;
import edu.ulatina.entidades.RedSocial;
import edu.ulatina.servicios.ServicioPersona;
import edu.ulatina.servicios.ServicioPublicacion;
import edu.ulatina.servicios.ServicioRedSocial;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author jean
 */
@ManagedBean
@SessionScoped

/**
 *
 * @author jean
 */
public class PublicacionBean implements Serializable {

    private List< Publicacion> publicacionsList;
    private List< Publicacion> searchList;
    private List< Publicacion> searchByRecordNoList;
    ServicioPublicacion publicacionDao = new ServicioPublicacion();
    Publicacion publicacion = new Publicacion();
    Publicacion newpublicacion = new Publicacion();
    Publicacion selectedPublicacion = new Publicacion();

    public Publicacion getSelectedPublicacion() {
        return selectedPublicacion;
    }

    public void setSelectedPublicacion(Publicacion selectedPublicacion) {
        this.selectedPublicacion = selectedPublicacion;
    }

    public List< Publicacion> getPublicacions() {
        publicacionsList = publicacionDao.Allpublicacions();
        int count = publicacionsList.size();
        return publicacionsList;
    }

    public void addPublicacion() {
        try {
            String titulo = newpublicacion.getTitulo();
            String contenido = newpublicacion.getContenido();
            Date date = newpublicacion.getFecha();

            ServicioPersona servicioPersona = new ServicioPersona();
            ServicioRedSocial servicioRed = new ServicioRedSocial();
            servicioPersona.getEntityManager();
            servicioRed.getEntityManager();
            publicacionDao.getEntityManager();

            RedSocial redSocial = new RedSocial();

            redSocial.setNombre("Facebook");
            redSocial.setDescripcion("hola");
            publicacion.setRedsocial(redSocial);
            
            publicacion.setTitulo(titulo);
            publicacion.setContenido(contenido);
            publicacion.setFecha(date);
            publicacion.setPersonaBean(servicioPersona.buscarPorCorreo("proyecto2ulatina@gmail.com"));
            publicacion.setRedsocial(servicioRed.buscarPorNombre("Facebook"));
            //publicacion.setIdPublicacion(3);
            System.out.println(publicacion);

            publicacionDao.insert(publicacion);

            System.out.println("Publicacion successfully saved.");
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Save Information", "Publicacion successfully saved.");
            RequestContext.getCurrentInstance().showMessageInDialog(message);
            newpublicacion = new Publicacion();
        } catch (Exception e) {
            e.printStackTrace();
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error Information", "Publicacion error.");
            RequestContext.getCurrentInstance().showMessageInDialog(message);
        }
    }

    public void updatePublicacion(Publicacion publicacion) {
        try {
            String Name = publicacion.getTitulo();
            FacesMessage message1 = new FacesMessage(FacesMessage.SEVERITY_INFO, "Name", Name);
            RequestContext.getCurrentInstance().showMessageInDialog(message1);
            //publicacionDao.update(publicacion);  
            System.out.println("Publicacion Info successfully saved.");
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Save Information", "Publicacion updated successfully .");
            RequestContext.getCurrentInstance().showMessageInDialog(message);
            publicacion = new Publicacion();
        } catch (Exception e) {

        }
    }

    public void onRowSelect(SelectEvent event) {

        Publicacion publicacionSelected = ((Publicacion) event.getObject());
    }

    /*
    public void changePublicacion(Publicacion publicacion)  
    {  
        this.publicacion = publicacion;  
    }  
    public void UpdatePublicacion(Publicacion publicacion)  
    {  
        String Name = publicacion.getTitulo();  
        FacesMessage message1 = new FacesMessage(FacesMessage.SEVERITY_INFO, "Name", Name);  
        RequestContext.getCurrentInstance().showMessageInDialog(message1);  
        publicacionDao.update(publicacion);  
        System.out.println("Publicacion Info successfully saved.");  
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Save Information", "Publicacion updated successfully .");  
        RequestContext.getCurrentInstance().showMessageInDialog(message);  
        publicacion = new Publicacion();  
    }  
    public void deletePublicacion(Publicacion publicacion)  
    {  
        String Name = publicacion.getTitulo();  
        //FacesMessage message3= new FacesMessage(FacesMessage.SEVERITY_INFO, "Delete Item",contactName);  
        // RequestContext.getCurrentInstance().showMessageInDialog(message3);  
        publicacionDao.delete(publicacion);  
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Delete", "Record deleted successfully");  
        RequestContext.getCurrentInstance().showMessageInDialog(message);  
    }  
    /*public void searchbyRecordno()  
    {  
        searchByRecordNoList = publicacionDao.SearchByRecordNo(publicacion.getRecordNo());  
        int count = searchByRecordNoList.size();  
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Number of Record Selected:", Integer.toString(count));  
        RequestContext.getCurrentInstance().showMessageInDialog(message);  
    }  */
    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public Publicacion getNewpublicacion() {
        return newpublicacion;
    }

    public void setNewpublicacion(Publicacion newpublicacion) {
        this.newpublicacion = newpublicacion;
    }

    public List< Publicacion> getPublicacionsList() {
        return publicacionsList;
    }

    public void setPublicacionsList(List< Publicacion> publicacionsList) {
        this.publicacionsList = publicacionsList;
    }

    public List< Publicacion> getSearchList() {
        return searchList;
    }

    public void setSearchList(List< Publicacion> searchList) {
        this.searchList = searchList;
    }

    public List< Publicacion> getSearchByRecordNoList() {
        return searchByRecordNoList;
    }

    public void setSearchByRecordNoList(List< Publicacion> searchByRecordNoList) {
        this.searchByRecordNoList = searchByRecordNoList;
    }
    /*public void onRowEdit(RowEditEvent event)  
    {  
        FacesMessage msg = new FacesMessage(" Edited Record No", ((Publicacion) event.getObject()).getRecordNo());  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
        Publicacion editedpublicacion = (Publicacion) event.getObject();  
        publicacionDao.update(editedpublicacion);  
    }  
    public void onCancel(RowEditEvent event)  
    {  
        FacesMessage msg = new FacesMessage("Edit Cancelled");  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
        publicacionsList.remove((Publicacion) event.getObject());  
    }  */

}
