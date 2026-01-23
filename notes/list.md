# Luke Broussard
**1/23/26**
**DSA**


# List ADT

**public interface List<item>**{  
    void add(Item x); // append  
    void add (Item x, int idx);  
    void remove(Item x, int x);  
    Item get(int);  
}

**public class ArrayList<item> implement List<item>** {  
    add()  

}


Add the parameter to a class definition  

<Item> is a type parameter that indicates a generic type (generics)  

public class LinkedList *implements List* {  
    private class Node{  // inner class  
        .  
        .  
        .  
    }  
    private Node first;  
    private int count;  
    // constructor..  

}

Versions of Linked List
* Singly Linked List
* Double Linked List  

Last node always points to Null

Keep track of first to replace first, samething for the last.  
How do you get to the middle?

#### Throw an exception if you haven't implemented or don't want to implement
add more versions of exceptions 

public add(Object x, int idx){  
    throw new Exception("not implemented yet");  
}
```
public void addLast(Object x) {  //adds at end  
    Node newNode = new Node();
    newNode.item = x;  
    newNode.next = null;  

    // case 1: empty list  
    if (last == null){  
        first = newNode;
        last = newNode;
        
    }  
    // case 2: non-empty list 
    last.next = new Node;
    last = newNode;  
    count++;  


}

public void addFirst(Object x) {  
    Node newNode = new Node();    
    newNode.item = x;  
    newNode.next = first;  
    first = newNode;  
    count++;  
    if(last == null) last = first;  

}

```
