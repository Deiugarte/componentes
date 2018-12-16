package edu.ulatina.entidades;

import edu.ulatina.entidades.Correo;
import edu.ulatina.entidades.Correosenviar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-16T13:34:54")
@StaticMetamodel(Listacorreo.class)
public class Listacorreo_ { 

    public static volatile SingularAttribute<Listacorreo, String> descripcion;
    public static volatile ListAttribute<Listacorreo, Correo> correos;
    public static volatile ListAttribute<Listacorreo, Correosenviar> correosenviars;
    public static volatile SingularAttribute<Listacorreo, String> nombre;
    public static volatile SingularAttribute<Listacorreo, Integer> idListaCorreos;

}