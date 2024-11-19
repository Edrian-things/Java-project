//Edrian Badoy
//BSCS 301
// A-F	Linear recursion
import java.util.*;

class Factorial {
    static int factorial(int x) {
        if(x == 0){
            return 1;
        }else{
            return x * factorial(x - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number to compute the Factorial: ");
        int x = sc.nextInt();

        System.out.println("The Factorial of " + x  + " is " + factorial(x) + ".");

        sc.close();
    }
}

        
