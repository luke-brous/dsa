import edu.princeton.cs.algs4.*; // The * imports everything in the library
import java.util.*;


public class StackWhileLoop {

    public static void main(String[] args) {

        Stack<String> stk = new Stack<String>();
        
        // reference I used https://www.geeksforgeeks.org/java/stack-iterator-method-in-java-with-example/
        
        Iterator<String> cnt = stk.iterator(); 

        while (cnt.hasNext()) {
            String s = cnt.next();
            StdOut.println(s);
        }
    }
    
}
