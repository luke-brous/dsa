/******************************************************************************
 * Name:          Luke Broussard
 * Email:         brousl0@sewanee.edu
 * Project:       Project 0, Q3
 * Course:        CS 320: Data Structures and Algorithms
 * * Description:   Compares performance between array-based vs linked-list stacks 
 ******************************************************************************/



import edu.princeton.cs.algs4.*;

public class ListvsArray{
    public static void main(String[] args) {
        int n = 10000000; // 10 million operations
        
        // Test ResizingArrayStack 
        ResizingArrayStack<Integer> arrayStack = new ResizingArrayStack<>();
        Stopwatch t1 = new Stopwatch();

        for (int i = 0; i < n; i++) {
            arrayStack.push(i);
        }
        double timeArray = t1.elapsedTime();

        // Test LinkedStack 
        LinkedStack<Integer> listStack = new LinkedStack<>();
        Stopwatch t2 = new Stopwatch();

        for (int i = 0; i < n; i++) {   
            listStack.push(i);
        }
        double timeList = t2.elapsedTime();

        StdOut.printf("Array Stack: %.4f s\n", timeArray);
        StdOut.printf("Linked Stack: %.4f s\n", timeList);
        StdOut.printf("Ratio (List/Array): %.2f\n", timeList/timeArray);
        StdOut.println("This means that the linked list stack is " + (timeList/timeArray) + " times slower than the array stack for push operations.");
    }
}