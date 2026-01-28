# Luke Broussard
**1/28/26**
**DSA**


## Runtime Complexity

* Set the Problem: benchmarks are gret but for a limited use
* Mathemical approach --> runtime complexity

**Idea**: we can develop functions which describe its runtime complexity
* f(n) - when input is size n, how many operations occur (run time complexity)
* s(n) - how much memory does it use (space time complexity)
* We can get this from an examination of the source code

```
public int LinearSearch(int[] a, int target) {
    // idea: search for target & return index if found, -1 otherwise
    int idx = -1;                               // 1
    for (int i = 0; i < a.length; i++) {       // 1 + 2n
        if (target == a[i]) {                   //n
            idx = i;                            //2
            break;
        }
    }
    return idx;
}                                            // total: 3n + 5

```

**Issues** 
* Counting statements can be tedious/error prone
* must consider multiple cases 

Approxamitions: 1. Drop all constants 2. drop all coefficients
* f(n) ~ n or O(n)
* 3n + 5 is a linear function

## Punchline

* A linear algorithm is one whose runtime is proportional to input size n. Ex: if n doubles, the runtime doubles

Imagine no loops no function calls
Constant # of operations
*Constant* time algorithm, no matter what input you give it it's going to run the same # of operations
O(1)
