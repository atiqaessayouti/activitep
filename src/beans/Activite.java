package beans;

import java.util.Date;

public class Activite {
    private int id;
    private String intitule;
    private Date date;
    private String description;

    // Constructeur avec ID
    public Activite(int id, String intitule, Date date, String description) {
        this.id = id;
        this.intitule = intitule;
        this.date = date;
        this.description = description;
    }

    // Constructeur sans ID
    public Activite(String intitule, Date date, String description) {
        this.intitule = intitule;
        this.date = date;
        this.description = description;
    }

    // Supprimer ce constructeur s'il n'est pas nécessaire
    // public Activite(String intitule, String description, Date date) {
    //     throw new UnsupportedOperationException("Not supported yet.");
    // }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return intitule;
    }
}