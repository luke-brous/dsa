import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class IterableStrings {
    public static void main(String[] args) {
        
        StdOut.println("Please enter a string");  
        String input = StdIn.readLine();
    

        // This doesn't work because String is not Iterable
        // for (char s : input) {
        //     StdOut.println(s);
        // }

        // One way to iterate over characters in a string is to change it to a char array
        for (char s : input.toCharArray()) {
            StdOut.println(s);
        }




    }
    
}
