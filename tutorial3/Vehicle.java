package tutorial3;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Vehicle implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id @GeneratedValue
    private long id;
    
    private Propietari propietari;
    private String marca;
    private int cost_reparacio;
    private Date data;
    private boolean es_reparable;

    public Vehicle() {
    }

    Vehicle(String marca, int cost_reparacio , Date data,
            boolean es_reparable, Propietari propietari) {
        this.marca = marca;
        this.cost_reparacio = cost_reparacio;
        this.data = data;
        this.es_reparable = es_reparable;    
        this.propietari = propietari;
    }

    public Long getId() {
        return id;
    }

    public int getCostReparacio() {
         return this.cost_reparacio;
    }
    
    public String getMarca(){
        return this.marca;
    }

    public Date getData() {
         return this.data;
    }
    
    public boolean getEsReparable(){
        return this.es_reparable;
    }
    
    public Propietari getPropietari(){
        return this.propietari;
    }

    @Override
    public String toString() {
        return String.format("Marca: " + marca + " Cost reparacio: " + cost_reparacio + "  Data: "
        + data + " es reparable: " + es_reparable);
    }
}