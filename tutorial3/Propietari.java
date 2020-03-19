package tutorial3;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Propietari implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id @GeneratedValue
    private long id;

    private String nom;
    private int presupost;
    private Date data_donar_cotxe;
    private boolean es_urgent;

    public Propietari() {
    }

    Propietari(String nom, int presupost , Date data_donar_cotxe,
            boolean es_urgent) {
        this.nom = nom;
        this.presupost = presupost;
        this.data_donar_cotxe = data_donar_cotxe;
        this.es_urgent = es_urgent;     
    }

    public Long getId() {
        return id;
    }

    public int getCostReparacio() {
         return this.presupost;
    }

    public Date getData() {
         return this.data_donar_cotxe;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public boolean getEsUrgent(){
        return this.es_urgent;
    }
    
    @Override
    public String toString() {
        return String.format("Nom: " + nom + " Presupost: " + presupost + "  Data: "
        + data_donar_cotxe + " es urgent: " + es_urgent);
    }
}