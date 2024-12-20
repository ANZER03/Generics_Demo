package org.example;

public class Produit {

    public long id;
    public String nom;
    public String marque;
    public double prix;
    public String description;
    public int nb_stock;

    public Produit() {

    }

    public Produit(long id, String nom, String marque, double prix, String description, int nb_stock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nb_stock = nb_stock;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", description='" + description + '\'' +
                ", nb_stock=" + nb_stock +
                '}';
    }


}
