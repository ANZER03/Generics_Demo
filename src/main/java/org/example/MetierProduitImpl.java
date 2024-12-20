package org.example;
import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit> {
    public ArrayList<Produit> produits = new ArrayList<>();

    @Override
    public void add(Produit pr) {
        this.produits.add(pr);
    }
    @Override
    public List getAll() {
        return produits;
    }
    @Override
    public Produit findById(long id) {
        for (Produit produit : produits) {
            if (produit.id == id) {
                return produit;
            }
        }
        return null;
    }
    @Override
    public void delete(long id) {
        this.produits.removeIf(produit -> produit.id == id);
    }

    public MetierProduitImpl() {

    }
}
