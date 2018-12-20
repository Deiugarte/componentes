package edu.ulatina.entidades;

import edu.ulatina.entidades.Persona;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-16T13:34:54")
@StaticMetamodel(Pregunta.class)
public class Pregunta_ { 

    public static volatile SingularAttribute<Pregunta, Date> fecha;
    public static volatile SingularAttribute<Pregunta, String> contenido;
    public static volatile SingularAttribute<Pregunta, Persona> persona;
    public static volatile SingularAttribute<Pregunta, String> chatId;
    public static volatile SingularAttribute<Pregunta, Integer> idpregunta;

}