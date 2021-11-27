package ex2;

public class Main {
    public static void main(String[]args){
        Pharmacy pharmacy = new Pharmacy("ISIMG","Univ City");
        Product p1 = new ParaProduct("C001",12.0,1000,"Cosmetic");
        Product p2 = new Drug("D001",9.0,1000,true,false);
        Product p3 = new ParaProduct("C002",15.0,1000,"Cosmetic");
        Product p4 = new ParaProduct("H001",22.0,200,"Hands");
        pharmacy.addProduct(p1,p2,p3,p4);

        Client cl = new Client("Anonymous","Anonymous", 97233566L);
        cl.displayClient();

        Purchase purchase = new Purchase(cl,p1,4);
        purchase.display();
        pharmacy.addPurchase(cl,p1.getReference(),20);
        pharmacy.display();
        Client cl2 = new Client("Anonymous","Anonymous", 97233566L);
        Purchase purchase2 = new Purchase(cl2,p2,4);
        pharmacy.addPurchase(cl2,p2.getReference(),22);
        pharmacy.display();
        pharmacy.displayProducts();

    }
}
