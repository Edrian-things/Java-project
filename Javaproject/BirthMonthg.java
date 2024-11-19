//Edrian Badoy
import java.util.*;
public class BirthMonthg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> group1 = new HashSet<>();
        Set<String> group2 = new HashSet<>();
        Set<String> self   = new HashSet<>();
        
        for(int i = 1; i <=3; i++ ){
            System.out.println("Enter birth month " + i);
            String m1 = sc.nextLine();
            group1.add(m1);
        }

        for(int i = 4; i <=6; i++){
            System.out.println("Enter birth month " + i);
            String m2 = sc.nextLine();
            group2.add(m2);
        }
        System.out.println("\nGroup 1 birth months " + group1 );
        System.out.println("Group 2 birth months " + group2 );

        System.out.println("Enter your birth month");
        String m3 = sc.nextLine().trim();
        self.add(m3);

        Set<String> union = new HashSet<>(group1);
        union.addAll(group2);
        System.out.println("\nUnion:" + union);

        Set<String> Intersection = new HashSet<>(group1);
        Intersection.retainAll(group2);
        System.out.println("\nIntersection:" + Intersection);

        Set<String> Difference = new HashSet<>(group1);
        Difference.removeAll(group2);
        System.out.println("\nIntersection:" + Difference);

        if(group1.contains(m3) ||   group2.contains(m3)){
            System.out.println("\nYou have the same birth month with one of your classmate.");
        }else{
            System.out.println("\nYou don't have a same birht month any of your classmate.");
        }


        sc.close();
    } 
}