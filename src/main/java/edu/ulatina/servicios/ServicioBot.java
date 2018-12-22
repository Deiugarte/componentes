
package edu.ulatina.servicios;

import edu.ulatina.entidades.ListaBot;
import edu.ulatina.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "servicioBot")
@ApplicationScoped
public class ServicioBot extends HibernateUtil {

    public void insertarBot(ListaBot bot) throws Exception {
        super.insert(bot);
    }

    
    public List<ListaBot> getAllBots() {
        List<ListaBot> daoAllBots = new ArrayList<>();
        try {
            String jpql = "SELECT t FROM " + ListaBot.class.getSimpleName().toUpperCase() + " t";
            daoAllBots= this.getEntityManager().createQuery(jpql, ListaBot.class).getResultList();
            
            if (daoAllBots != null){
                
            
                for (ListaBot b : daoAllBots) {
                    System.out.println(" Nombre con JPQL: " + b.getNombreBot());
                }
            }
            else{
                System.out.println("Lista no encontrada");
                return null;
            }
            

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error*");
        }
        return daoAllBots;
    }
}