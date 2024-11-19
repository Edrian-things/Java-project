 //Edrian Badoy
import java.util.*;

public class StudentList {
    public static void main(String[] args) {
        Map<String, String> student = new HashMap<>();
         Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 3; i++){
            System.out.println("Enter student number " + i);
            String StuNum = sc.nextLine();

            System.out.println("Enter first name " + i);
            String Fname = sc.nextLine();
            student.put(StuNum, Fname);
        }

        System.out.println("\nStudent List:");
        for(Map.Entry <String, String> entry : student.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        String thirdKey = (String) student.keySet().toArray()[2];
        student.remove(thirdKey);

        System.out.println("Enter your student number:");
        String myStuNum = sc.nextLine();
        
        System.out.println("Enter first name:");
        String myFname = sc.nextLine();
        student.put(myStuNum, myFname);

        System.out.println("\nUpdated Student List:");
        for(Map.Entry <String, String> entry : student.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        sc.close();
    }   
}
