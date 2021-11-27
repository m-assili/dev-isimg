package ex2;

import java.util.ArrayList;
import java.util.List;

public class Pharmacy {
    private String name;
    private String address;
    private Client[] clients;
    private int nbClient;
    private Product[] products;
    private int nbProduct;
    private Purchase[] purchases;
    public static final int MAX_CLIENT=1000;
    public static final int MAX_PRODUCT=1000;
    public static final int MAX_PURCHASE=10000;
    public Pharmacy(String name, String address) {
        this.name = name;
        this.address = address;
        this.clients = new Client[MAX_CLIENT];
        this.products = new Product[MAX_PRODUCT];
        this.purchases = new Purchase[MAX_PURCHASE];
    }
    private void addClient(Client client){
        if(exist(client)==-1)
            clients[nbClient++]=client;
    }
    private int exist(Client client){
        for (int i = 0; i < nbClient; i++)
            if(clients[i].getCnamID()==client.getCnamID())
                return i;
        return -1;
    }
    private int exist(String refProduct){
        for (int i = 0; i < nbProduct; i++) {
            if(products[i].getReference().equals(refProduct))
                return i;
        }
        return -1;
    }

    public void addProduct(Product... product){
        for (Product p : product)
            if(this.exist(p.getReference())==-1)
                this.products[nbProduct++]=p;
    }
    private boolean updateProduct(String product,int quantity){
        boolean updated=false;
        for (int i = 0; i < nbProduct; i++) {
            if(products[i].getReference().equals(product)) {
                products[i].setQuantity(products[i].getQuantity() - quantity);
                updated = true;
            }
        }
        return updated;
    }
    public void addPurchase(Client client,String product,int quantity){

        int existClient = this.exist(client);
        int existProduct = this.exist(product);
        if(existProduct == -1)
            System.out.println(product+"Cette référence de produit n'existe pas !!!");
        else
            if(products[existProduct].getQuantity()<quantity)
                System.out.println("Quantité en stock est insuffisante !!!");
            else
                if(existClient==-1) {
                    this.addClient(client);
                    this.updateProduct(product,quantity);
                    purchases[(int) Purchase.counter] = new Purchase(client,products[existProduct],quantity );
                    System.out.println("Opération d'achat réussit ***");
                }

    }
    public void displayClients(){
        for(Client client:clients)
            if(client!=null)
                client.displayClient();
    }
    public void displayProducts(){
        for (Product product:products) {
            if(product!=null)
                product.display();
        }
    }
    public void displayPurchases(){
        for(Purchase purchase : purchases)
            if(purchase!=null)
                purchase.display();
        }
    public double getTotal(){
        double total = 0;
        for (Purchase purchase : purchases)
            if(purchase!=null)
                total += purchase.getPurchaseAmount();
        return total;
    }
    public void display(){
        System.out.println("******* Client List *****************");
        this.displayClients();
        System.out.println("******* Product List *****************");
        this.displayProducts();
        System.out.println("******* Purchase List *****************");
        this.displayPurchases();
        System.out.println("\n \n \t\t ******* Total Purchases="+this.getTotal());
    }
}
