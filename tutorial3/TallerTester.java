package tutorial3;

import javax.persistence.*;
import java.util.*;

public class TallerTester {
    public static void main(String[] args) {
        
        //Ens conectem a la nostra base de dades
        EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("$objectdb/db/p2.odb");
        EntityManager em = emf.createEntityManager();

        //Creem els objectes a la base de dades vehicle i propietari
        em.getTransaction().begin();
       
        Vehicle v1 = new Vehicle("Lamborhini", 20000, new Date(02-1-2018), true);
        Propietari p1 = new Propietari("Pepito", 30000, new Date(01-1-2018), true);
            
        em.persist(v1);
        em.persist(p1);
        em.getTransaction().commit();

        // Find the number of Point objects in the database:
        Query q1 = em.createQuery("SELECT v1 FROM Vehicle v1");
        System.out.println("Datos vehiculo: " + q1.getResultList());

        // Find the average X value:
        Query q2 = em.createQuery("SELECT p1 FROM Propietari p1");
        System.out.println("Datos propietario: " + q2.getResultList());

        // Retrieve all the Point objects from the database:
        //TypedQuery<Point> query =
        //    em.createQuery("SELECT p FROM Point p", Point.class);
        //List<Point> results = query.getResultList();
       // for (Point p : results) {
        //    System.out.println(p);
        //}

        // Close the database connection:
        em.close();
        emf.close();
    }
}