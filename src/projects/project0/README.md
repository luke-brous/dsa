Project 
Name: Luke Broussard
Date: January 28, 2026
Class: CS 320

Program Descriptions
- DoublingRatio.java: A test client that measures how long it takes to run the ThreeSum and ThreeSumFast algorithm. It doubles the input size each time to show the performance ratio. 
- StackComparisons.java: Another test client used to compare the run time between the primitve type stack and generic type stack. 
- ListvsArray.java: Also a test client used to compare the runtime of a linked list based stack against a 
array based stack.
- FixedCapacityStackOfInts.java: Implemented FixedCapacityStackofString.java from the text book except using normal
int type instead of generics.

Compile + Run

ThreeSum + TSFast (note you have to change the code to run TSFast)

javac -cp .:algs4.jar DoublingRatio.java
java -cp .:algs4.jar DoublingRatio

Stack Comparison

javac -cp .:algs4.jar StackComparisons.java
java -cp .:algs4.jar StackComparisons

List vs Array

javac -cp .:algs4.jar ListvsArray.java
java -cp .:algs4.jar ListvsArray

Problems

In order to run TSFast I had to increase the max number constant in doubling ratio so
there would be no duplicates, or else it would hit a duplicate and throw an error.
FixedCapacityStack also threw a warning flag.






StackBench.java: A custom benchmarking tool I wrote to compare different stack implementations. It measures the time difference between primitive int stacks vs. generic Integer stacks (autoboxing) and array-based stacks vs. linked-list stacks.FixedCapacityStackOfInts.java: A non-generic stack implementation that handles only primitive int types to avoid Java's autoboxing overhead.FixedCapacityStack.java: The standard textbook generic stack used as a baseline for comparison.How to Compile and RunI used the algs4.jar library for these programs. Since the library is located two levels up from my project folder, I used the following commands:1. ThreeSum ExperimentBashjavac -cp .:../../algs4.jar DoublingRatio.java
java -cp .:../../algs4.jar DoublingRatio
2. Stack BenchmarksBashjavac -cp .:../../algs4.jar StackBench.java
java -cp .:../../algs4.jar StackBench
Known Problems & BugsThreeSumFast Duplicates: The ThreeSumFast algorithm in the provided library throws an IllegalArgumentException if the input array contains duplicate integers. To fix this, I modified DoublingRatio.java to generate random integers across a massive range (negative 1 billion to positive 1 billion). This makes the chance of a duplicate practically zero so the test can finish without crashing.Jitter in Ratios: In the DoublingRatio output, the first few ratios (for small $N$) are sometimes inconsistent. This is because the execution time is so close to 0.0 seconds that the measurement isn't perfectly precise until $N$ gets larger.Unchecked Warnings: When compiling FixedCapacityStack.java, the compiler gives a "Note: unchecked or unsafe operations." This is expected behavior for the textbook implementation of generic arrays in Java and does not affect the program's results.