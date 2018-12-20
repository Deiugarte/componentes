package edu.ulatina.entidades;

import edu.ulatina.entidades.Publicacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-16T13:34:54")
@StaticMetamodel(Redsocial.class)
public class Redsocial_ { 

    public static volatile SingularAttribute<Redsocial, String> descripcion;
    public static volatile SingularAttribute<Redsocial, Integer> idRedSocial;
    public static volatile SingularAttribute<Redsocial, String> nombre;
    public static volatile ListAttribute<Redsocial, Publicacion> publicacions;

}