package edu.ulatina.entidades;


import edu.ulatina.servicios.ServicioBot;
import edu.ulatina.servicios.ServicioPersona;
import edu.ulatina.servicios.ServicioRol;
import java.util.List;


public class Tester {

	public static void main(String[] args) {
		try {
			//Codigo para actualizar Rol
			ServicioRol sr = new ServicioRol();
			ServicioPersona sp = new ServicioPersona();
			sr.getEntityManager();
			sp.getEntityManager();
			//Rol rol = sr.buscarPorId(3);
			
			Persona persona = new Persona();
			persona.setIdPersona(4);
			persona.setCorreo("example@example.com");
			persona.setNombre("John");
			persona.setApellido("Doe");
			persona.setSegundoApellido("Example");
			
			// Poner ID, nombre, apellidos, correo para que se pueda guardar, no repetir IDS
			//sp.insert(persona);
			
			//Llenar BD primero antes de usar estos metodos
			Persona resultadoPersona = sp.buscarPorCorreo("jean@example.com");
			System.out.println("La persona buscada es: "+resultadoPersona.getNombre());
			//System.out.println("El rol buscado es: "+rol.getNombre());
			//sp.stopEntityManagerFactory();

//		       ServicioBot sb = new ServicioBot();
//                       sb.getEntityManager();
//                       for (ListaBot b : sb.getAllBots()){
//                            //System.out.println(b.getDescripcionBot());
//                            System.out.println(b.getIdBot());
//                            System.out.println(b.getNombreBot());
//                          //  System.out.println(b.getLinkBot());
//                        }


//                        List<ListaBot> resultadoBot = sb.getAllBots();
//                        System.out.println(resultadoBot);
                        
		} catch (

		Exception e) {
			e.printStackTrace();
		}
	}

}
