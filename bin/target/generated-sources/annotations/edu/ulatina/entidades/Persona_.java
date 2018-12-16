package edu.ulatina.entidades;

import edu.ulatina.entidades.Correosenviar;
import edu.ulatina.entidades.ListaBot;
import edu.ulatina.entidades.Pregunta;
import edu.ulatina.entidades.Publicacion;
import edu.ulatina.entidades.Rol;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-16T13:34:54")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile ListAttribute<Persona, ListaBot> listaBots;
    public static volatile SingularAttribute<Persona, Date> fechaNacimiento;
    public static volatile ListAttribute<Persona, Correosenviar> correosenviars;
    public static volatile SingularAttribute<Persona, String> segundoApellido;
    public static volatile SingularAttribute<Persona, String> nombre;
    public static volatile ListAttribute<Persona, Rol> rols;
    public static volatile SingularAttribute<Persona, String> apellido;
    public static volatile SingularAttribute<Persona, String> correo;
    public static volatile SingularAttribute<Persona, String> fbToken;
    public static volatile ListAttribute<Persona, Pregunta> preguntas;
    public static volatile SingularAttribute<Persona, String> sexo;
    public static volatile SingularAttribute<Persona, String> telefono;
    public static volatile SingularAttribute<Persona, Integer> idPersona;
    public static volatile ListAttribute<Persona, Publicacion> publicacions;

}