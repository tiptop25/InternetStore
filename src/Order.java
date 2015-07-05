import java.util.ArrayList;
import java.util.Date;

/**
 * Created by superova on 05.07.2015.
 */
public class Order {
    static ArrayList<Order> userBasket = new ArrayList<>();

    PotentialBuyer user;
    Date datePurchases;
    NameOfProduct nameOfProduct;
    Maker maker;
    UnitOfMeasure unitOfMeasure;
    int   unitPrice;
    int sale;
    int sum;

    public Order(PotentialBuyer user, Date datePurchases, NameOfProduct nameOfProduct,
                 Maker maker, UnitOfMeasure unitOfMeasure, int unitPrice, int sale, int sum) {
        this.user = user;
        this.datePurchases = datePurchases;
        this.nameOfProduct=  nameOfProduct;
        this.maker = maker;
        this.unitOfMeasure = unitOfMeasure;
        this.unitPrice = unitPrice;
        this.sale = sale;
        this.sum = sum;

    }

    @Override
    public String toString() {
        return "Order{" +
                "user=" + user +
                ", datePurchases=" + datePurchases +
                ", nameOfProduct='" +nameOfProduct + '\'' +
                ", maker=" + maker +
                ", unitOfMeasure=" + unitOfMeasure +
                ", unitPrice=" + unitPrice +
                ", sale=" + sale +
                ", sum=" + sum +
                '}';
    }

    public ArrayList<Order> addToBasket(Order order) {
        if (userBasket.add(order)) {
            for (Product temp : Warehouse.products ) {
                if (temp. nameOfProduct.equals(this.nameOfProduct) && temp.unitOfMeasure.equals(this.unitOfMeasure)&&
                        temp.maker.equals(this.maker)) {
                    if (temp.quantity >= sale) {
                      temp.quantity -=  sale;
                    }
                    else {
                        System.out.println("Not is" + this.nameOfProduct + " " + this.unitOfMeasure+" "+this.maker );

                    }
                }
            }
        }
        sum = unitPrice * sale;
        return userBasket;
    }




}
