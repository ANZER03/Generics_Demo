package org.example;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MetierProduitImpl metierProduit = new MetierProduitImpl();

        metierProduit.add(new Produit(1, "Product1", "Brand1", 10.0, "Description1", 100));
        metierProduit.add(new Produit(2, "Product2", "Brand2", 20.0, "Description2", 200));
        metierProduit.add(new Produit(3, "Product3", "Brand3", 30.0, "Description3", 300));


        boolean app_run = true;

        while (app_run) {
            System.out.println("\n\n###########################");
            System.out.println("1. Afficher la liste des produits.");
            System.out.println("2. Rechercher un produit par son id.");
            System.out.println("3. Ajouter un nouveau produit dans la liste.");
            System.out.println("4. Supprimer un produit par id.");
            System.out.println("5. Quitter ce programme.");

            System.out.println("Enter un option : ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("La liste des produit : ");
                    metierProduit.getAll().forEach(produit -> System.out.println(produit.toString()));
                    break;
                case 2:
                    System.out.println("Enter l'ID de produit : ");
                    long id = scanner.nextLong();
                    Produit produitbyId = metierProduit.findById(id);
                    if (produitbyId == null) {
                        System.out.println("le produit n'est pas exist");
                    } else if (produitbyId.getClass() == Produit.class) {
                        System.out.println(produitbyId.toString());
                    }
                    break;
                case 3:
                    System.out.print("Enter id : ");
                    long id_produit = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Enter nom : ");
                    String nom_produit = scanner.nextLine();

                    System.out.print("Enter marque : ");
                    String marque_produit = scanner.nextLine();

                    System.out.print("Enter prix : ");
                    double prix_produit = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter description : ");
                    String des_produit = scanner.nextLine();

                    System.out.print("Enter nombre en stock : ");
                    int nb_stock_produit = scanner.nextInt();
                    scanner.nextLine();

                    metierProduit.produits.add(new Produit(id_produit, nom_produit, marque_produit, prix_produit, des_produit, nb_stock_produit));
                    System.out.println("le produit est ajoutee");
                    break;
                case 4:
                    int list_taile = metierProduit.produits.size();
                    System.out.println("Enter l'ID de produit : ");
                    long id_delete = scanner.nextLong();
                    metierProduit.delete(id_delete);
                    if (list_taile == metierProduit.produits.size()) {
                        System.out.println("le produit n'est pas exist!!!");
                    } else {
                        System.out.println("le produit avec le ID " + id_delete + " a supprimer");
                    }
                    break;
                case 5:
                    System.out.println("Le programme exit!!!!");
                    app_run = false;

                default:
                    System.out.println("Cette option n'est pas exist");
            }


        }


    }
}
