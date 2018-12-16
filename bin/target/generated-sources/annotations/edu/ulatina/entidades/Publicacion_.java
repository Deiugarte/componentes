package edu.ulatina.entidades;

import edu.ulatina.entidades.Multimedia;
import edu.ulatina.entidades.Persona;
import edu.ulatina.entidades.Redsocial;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-16T13:34:54")
@StaticMetamodel(Publicacion.class)
public class Publicacion_ { 

    public static volatile SingularAttribute<Publicacion, Date> fecha;
    public static volatile SingularAttribute<Publicacion, String> contenido;
    public static volatile SingularAttribute<Publicacion, String> titulo;
    public static volatile SingularAttribute<Publicacion, Redsocial> redsocial;
    public static volatile SingularAttribute<Publicacion, Persona> personaBean;
    public static volatile ListAttribute<Publicacion, Multimedia> multimedias;
    public static volatile SingularAttribute<Publicacion, Integer> idPublicacion;

}