/******************************************************************************
 * Name:          Luke Broussard
 * Email:         brousl0@sewanee.edu
 * Project:       Project 0, Q2
 * Course:        CS 320: Data Structures and Algorithms
 * * Description:   Compares performance between primitive vs generic stacks 
 ******************************************************************************/

import edu.princeton.cs.algs4.*;

public class StackComparisons {

    // DoublingRatio version for primitive stack (ints)
    public static double timeTrialPrimitive(int n) {

        FixedCapacityStackOfInts stack = new FixedCapacityStackOfInts(n);

        Stopwatch timer = new Stopwatch();
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }
        for (int i = 0; i < n; i++) {
            stack.pop();
        }

        return timer.elapsedTime();
    }

    // DoublingRatio version for generic stack (Integer objects)
    public static double timeTrialGeneric(int n) {
        FixedCapacityStack<Integer> stack = new FixedCapacityStack<>(n);
        Stopwatch timer = new Stopwatch();
        for (int i = 0; i < n; i++) {
            stack.push(i);      
        }
        for (int i = 0; i < n; i++) {
            stack.pop();    
        }

        return timer.elapsedTime();
    }

    public static void main(String[] args) {
        int originalN = 1000000; // using 1 million as starting point
        double prevPrim = timeTrialPrimitive(originalN / 2);
        double prevGen = timeTrialGeneric(originalN / 2);

        StdOut.printf("%-10s %-15s %-15s %-10s\n", "N", "Primitives", "Generics", "Difference");
        StdOut.println("--------------------------------------------------------------");

        for (int n = originalN; n <= 32000000; n += n) {
            double timePrim = timeTrialPrimitive(n);
            double timeGen = timeTrialGeneric(n);
            
            // difference shows how many times slower the Generic stack is than the Primitive type one
            double difference = timeGen / timePrim; 
            StdOut.printf("%-10d %-15.3f %-15.3f %-10.2f\n", n, timePrim, timeGen, difference);
        }
    }
}