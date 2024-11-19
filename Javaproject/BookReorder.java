//Edrian Badoy
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class BookReorder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        System.out.println("Enter four book titles:");
        for (int i = 1; i <= 4; i++) {
            System.out.print("Book " + i + ": ");
            String book = sc.nextLine().toUpperCase();
            stack.push(book);
        }

        
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        
        System.out.println("New order of books:");
        System.out.println(queue);
        sc.close();
    }
}
