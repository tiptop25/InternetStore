import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

/**
 * Created by superova on 03.07.2015.
 */
public class Warehouse {

  static   Set<Product> products = new TreeSet<Product>();

    Vector<Warehouse> warehouses =new Vector<>();

   int namber;
   String Location;
    String ResponsiblePerson;


    public Warehouse(int namber, String location, String responsiblePerson) {
        this.namber = namber;
        Location = location;
        ResponsiblePerson = responsiblePerson;
    }
    public Warehouse(){

    }


    @Override
    public String toString() {
        return "Warehouse{" +
                "namber=" + namber +
                ", Location='" + Location + '\'' +
                ", ResponsiblePerson='" + ResponsiblePerson + '\'' +
                '}';
    }

    public  boolean addProduct(Product product){
           return products.add(product);
    }
    public boolean deleteProduct(Product product) {

        return products.remove(product);
    }
    public void showProducts() {

        System.out.println(products);
    }
    public boolean addWarehouse(Warehouse warehouse){
        return warehouses.add(warehouse);
    }

    public void showWarehouse() {

        System.out.println(warehouses);
    }
}
