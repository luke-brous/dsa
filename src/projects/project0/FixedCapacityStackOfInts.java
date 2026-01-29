/******************************************************************************
 * Name:          Luke Broussard
 * Email:         brousl0@sewanee.edu
 * Project:       Project 0, Q1
 * Course:        CS 320: Data Structures and Algorithms
 * * Description:   Implements a fixed-capacity stack for primitive int types. 
 ******************************************************************************/

import edu.princeton.cs.algs4.*;

import java.util.Iterator;
import java.util.NoSuchElementException;


public class FixedCapacityStackOfInts {
    private int[] a;
    private int N;

    public FixedCapacityStackOfInts(int capacity) {
        a = new int[capacity];
    }

    public boolean isEmpty() { return N == 0; }
    public void push(int item) { a[N++] = item; }
    public int pop() { return a[--N]; }
}