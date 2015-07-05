import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by superova on 03.07.2015.
 */
public class Main {
    public static void main(String[] args) {

        Warehouse warehouse1 = new Warehouse(1,"Promzona","Ivanov");
        Warehouse warehouse2 = new Warehouse(2,"Center","Petrov");




        Product product1 = new Product(Maker.BASHTANKA,NameOfProduct.MILK,UnitOfMeasure.LITER_1,new Date(),10,8,100);
        Product product2 = new Product(Maker.ABK,NameOfProduct.MILK,UnitOfMeasure.LITER_05,new Date(),5,8,150);
        Product product3 = new Product(Maker.ABK,NameOfProduct.FLOUR,UnitOfMeasure.KG,new Date(),6,360,3000);
        Product product4 = new Product(Maker.BASHTANKA,NameOfProduct.GEESE,UnitOfMeasure.KG,new Date(),70,30,50);
        Product product5 = new Product(Maker.BASHTANKA,NameOfProduct.MILK,UnitOfMeasure.LITER_05,new Date(),6,8,130);
        Product product6 = new Product(Maker.ABK,NameOfProduct.FLOUR,UnitOfMeasure.KG,new Date(),15,200,300);
        Product product7= new Product(Maker.ABK,NameOfProduct.FLOUR,UnitOfMeasure.KG,new Date(),15,200,300);
        Product product8= new Product(Maker.ABK,NameOfProduct.RICE,UnitOfMeasure.KG,new Date(),25,5000,350);


        warehouse1.addProduct(product1);
        warehouse1.addProduct(product2);
        warehouse2.addProduct(product3);
        warehouse1.addProduct(product4);
        warehouse1.addProduct(product5);
        warehouse2.addProduct(product6);
        warehouse2.addProduct(product7);
        warehouse2.addProduct(product8);

        warehouse1.showProducts();
        warehouse2.showProducts();

        PotentialBuyer potentialBuyer1 =new PotentialBuyer("ererer",12345);
        PotentialBuyer potentialBuyer2 =new PotentialBuyer("fgfgfgfg",45876);
        PotentialBuyer potentialBuyer3 =new PotentialBuyer("eghdfjk",6576767);
        PotentialBuyer potentialBuyer4 =new PotentialBuyer("erere",1234);

        potentialBuyer1.addPotentialBuyer(potentialBuyer1);
        potentialBuyer1.addPotentialBuyer(potentialBuyer2);
        potentialBuyer1.addPotentialBuyer(potentialBuyer3);
        potentialBuyer1.addPotentialBuyer(potentialBuyer4);

        potentialBuyer1.showPotentialBuyer();

        Order order1 = new Order(potentialBuyer1,new Date(),NameOfProduct.FLOUR,Maker.BASHTANKA,UnitOfMeasure.LITER_1, 10,5,50);




    }
}
