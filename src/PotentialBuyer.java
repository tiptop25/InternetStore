import java.util.Set;
import java.util.TreeSet;

/**
 * Created by superova on 04.07.2015.
 */
public class PotentialBuyer implements Comparable<PotentialBuyer> {
    static Set<PotentialBuyer>potentialBuyers = new TreeSet<>();

   private String login;
    private int password;

    public PotentialBuyer(String login, int password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public int compareTo(PotentialBuyer o) {
       int resalt =(this.login.compareTo(login))*11111 + (this.password-o.password)*1111111111;
        return resalt;
    }

    @Override
    public String toString() {
        return "PotentialBuyer{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}'+'\n';
    }

    public boolean addPotentialBuyer(PotentialBuyer potentialBuyer){
        return potentialBuyers.add(potentialBuyer);
    }

    public boolean deletePotentialBuyer(PotentialBuyer potentialBuyer){
        return potentialBuyers.remove(potentialBuyer);
    }
    void showPotentialBuyer(){
        System.out.println(potentialBuyers);
    }


}
