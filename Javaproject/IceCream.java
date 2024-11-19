//Edrian Badoy
//BSCS 301
//Ice Cream flavors
import java.util.LinkedList;
public class IceCream {
    public static void main(String[] args) {
        LinkedList<String> Icecreamflavors = new LinkedList<>();

        String[] Flavors = {"Cookies & Cream", "Mango", "Hershey's", "Oreo"};
        for (String icecream: Flavors){
            Icecreamflavors.add(icecream);
        }
        System.out.println("My Favorite Ice Cream Flavors are: " + Icecreamflavors);
    }
}