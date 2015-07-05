import java.util.Date;

/**
 * Created by superova on 03.07.2015.
 */

enum NameOfProduct{MILK,GEESE,RICE, FLOUR};
enum Maker{BASHTANKA,ABK,};
enum UnitOfMeasure { LITER_1,LITER_05,KG};

public class Product implements Comparable<Product> {


    Maker maker;
  public   NameOfProduct nameOfProduct;
    UnitOfMeasure unitOfMeasure;
     Date deliveryDate;
     int unitPrice;
     int storageLife;
     int quantity;


    public Product(Maker maker, NameOfProduct nameOfProduct,
                   UnitOfMeasure unitOfMeasure, Date dateManufacture, int unitPrice, int storageLife, int quantity) {
        this.maker = maker;
        this.nameOfProduct = nameOfProduct;
        this.unitOfMeasure = unitOfMeasure;
        this.deliveryDate = dateManufacture;
        this.unitPrice = unitPrice;
        this.storageLife = storageLife;
        this.quantity = quantity;
    }



    @Override
    public int compareTo(Product product) {
        int resalt =(this.nameOfProduct.compareTo(product.nameOfProduct))*11111 + (this.maker.compareTo(product.maker))*1111 +
                ( this.unitOfMeasure.compareTo(product.unitOfMeasure))*111111 + ((this.unitPrice - product.unitPrice))*111111111;
        if (resalt == 0)product.quantity = product.quantity + quantity;

        return resalt;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maker=" + maker +
                ", nameOfProduct=" + nameOfProduct +
                ", unitOfMeasure=" + unitOfMeasure +
                ", deliveryDate=" + deliveryDate +
                ", unitPrice=" + unitPrice +
                ", storageLife=" + storageLife +
                ", quantity=" + quantity +
                '}'+'\n';
    }
}
