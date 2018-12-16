package edu.ulatina.entidades;

import edu.ulatina.entidades.Listacorreo;
import edu.ulatina.entidades.Persona;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-16T13:34:54")
@StaticMetamodel(Correosenviar.class)
public class Correosenviar_ { 

    public static volatile SingularAttribute<Correosenviar, String> contenido;
    public static volatile ListAttribute<Correosenviar, Listacorreo> listacorreos;
    public static volatile SingularAttribute<Correosenviar, String> asunto;
    public static volatile SingularAttribute<Correosenviar, Persona> personaBean;
    public static volatile SingularAttribute<Correosenviar, Integer> idCorreosEnviar;

}