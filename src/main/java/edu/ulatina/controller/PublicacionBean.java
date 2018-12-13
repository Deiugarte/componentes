/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ulatina.controller;

/**
 *
 * @author Pablo Quiros
 */
import com.ulatina.entidades.Persona;
import com.ulatina.entidades.Publicacion;
import com.ulatina.entidades.Redsocial;
import com.ulatina.entidades.Rol;
import com.ulatina.servicios.ServicioPublicacion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext; 
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.RowEditEvent;
import org.primefaces.model.UploadedFile;
@ManagedBean
@SessionScoped

/**
 *
 * @author jean
 */
public class PublicacionBean implements Serializable {
      
      private List < Publicacion > publicacionsList;  
    private List < Publicacion > searchList;  
    private List < Publicacion > searchByRecordNoList;  
    ServicioPublicacion publicacionDao = new ServicioPublicacion();  
    Publicacion publicacion = new Publicacion();  
    Publicacion newpublicacion = new Publicacion();  
    public List < Publicacion > getPublicacions()  
    {  
        publicacionsList = publicacionDao.Allpublicacions();  
        int count = publicacionsList.size();  
        return publicacionsList;  
    }  
    
    
    public void addPublicacion()  
    {  
        try {
        String titulo = newpublicacion.getTitulo(); 
        String contenido = newpublicacion.getContenido();
        
        List<Persona> listaPersonas = new ArrayList<>();
			List<Publicacion> listaPublicacion = new ArrayList<>();
			Persona p = new Persona();
			p.setNombre("Jean");
			p.setApellido("Aguilar");
			p.setContrasena("123456");
			p.setCorreo("josue-marco-10@hotmail.com");
			p.setSegundoApellido("Vega");
			p.setFechaNacimiento("10/05/1996");
			listaPersonas.add(p);
			
		
			
			Publicacion publicacion = new Publicacion();
			publicacion.setTitulo(titulo);
			publicacion.setContenido(contenido);
			publicacion.setFecha("1/10/2018");
			publicacion.setPersonaBean(p);
			
			
			p.setPublicacions(listaPublicacion);
			
			Redsocial redSocial = new Redsocial();
			redSocial.setIdRedSocial(1);
			redSocial.setNombre("Facebook");
			redSocial.setDescripcion("hola");
			publicacion.setRedsocial(redSocial);
			listaPublicacion.add(publicacion);
			
			Rol admin = new Rol();
			admin.setDescripcion("Nuevo Rol");
			admin.setNombre("Admin");
			
			p.setPublicacions(listaPublicacion);
			
			ServicioPublicacion sp = new ServicioPublicacion();
			sp.insert(p);
                        
                        
        
        
        System.out.println("Publicacion successfully saved.");  
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Save Information", "Publicacion successfully saved.");  
        RequestContext.getCurrentInstance().showMessageInDialog(message);  
        newpublicacion = new Publicacion();  
        } catch(Exception e){
            e.printStackTrace();
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error Information", "Publicacion error.");  
            RequestContext.getCurrentInstance().showMessageInDialog(message); 
        }
    } 
    public void deletePublicacion(Publicacion p) {
        ServicioPublicacion sp = new ServicioPublicacion();
			sp.EliminarPublicacion(p.getIdPublicacion());
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
    public Publicacion getPublicacion()  
    {  
        return publicacion;  
    }  
    public void setPublicacion(Publicacion publicacion)  
    {  
        this.publicacion = publicacion;  
    }  
    public Publicacion getNewpublicacion()  
    {  
        return newpublicacion;  
    }  
    public void setNewpublicacion(Publicacion newpublicacion)  
    {  
        this.newpublicacion = newpublicacion;  
    }  
    public List < Publicacion > getPublicacionsList()  
    {  
        return publicacionsList;  
    }  
    public void setPublicacionsList(List < Publicacion > publicacionsList)  
    {  
        this.publicacionsList = publicacionsList;  
    }  
    public List < Publicacion > getSearchList()  
    {  
        return searchList;  
    }  
    public void setSearchList(List < Publicacion > searchList)  
    {  
        this.searchList = searchList;  
    }  
    public List < Publicacion > getSearchByRecordNoList()  
    {  
        return searchByRecordNoList;  
    }  
    public void setSearchByRecordNoList(List < Publicacion > searchByRecordNoList)  
    {  
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
