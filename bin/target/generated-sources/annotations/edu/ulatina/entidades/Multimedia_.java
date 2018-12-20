package edu.ulatina.entidades;

import edu.ulatina.entidades.Publicacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-16T13:34:54")
@StaticMetamodel(Multimedia.class)
public class Multimedia_ { 

    public static volatile SingularAttribute<Multimedia, Integer> idmultimedia;
    public static volatile SingularAttribute<Multimedia, String> url;
    public static volatile ListAttribute<Multimedia, Publicacion> publicacions;

}