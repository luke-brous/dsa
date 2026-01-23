# Luke Broussard
**1/21/26**
**DSA**

## Core Concepts

* **Package:** A named collection of classes (e.g., `Alg4.jar`).
* **Interface:** A reference type acting as a contract. Defines *what* methods a class must implement, not *how*.
* **Collection ADT:** An object holding a collection of other objects.
    * **Types:** Fixed size (array) vs. Dynamic; Heterogeneous vs. Homogeneous; Ordered vs. Unordered.
* **Wrapper Class:** Wraps primitive data types into objects.
    * **Autoboxing:** Automatic conversion of primitive $\rightarrow$ object (e.g., `int` $\rightarrow$ `Integer`).
    * **Unboxing:** Automatic conversion of object $\rightarrow$ primitive (e.g., `Integer` $\rightarrow$ `int`).

---

## OOP Principles

### Encapsulation
Hiding "sensitive" data from users.
* **How:** Declare attributes `private`; provide `public` get/set methods.

### Inheritance
Inheriting attributes/methods from one class to another.
* **Subclass (Child):** Inherits from another.
* **Superclass (Parent):** The class being inherited from.
* **Keyword:** `extends`.

### Polymorphism
"Many forms." Occurs when related classes use inherited methods to perform a single action in different ways.

---

## Collections

### `List<E>` (Interface)
* **Type:** Ordered collection (sequence).
* **Features:** Precise control over insertion index; allows duplicates and nulls.

### `ArrayList<E>`
* **Implementation:** Resizable-array implementation of `List`.
* **Performance:**
    * $O(1)$ (Constant): `size`, `isEmpty`, `get`, `set`, `iterator`.
    * Amortized $O(1)$: `add` (adding $n$ elements takes $O(n)$).
    * Linear: Most other operations.
* **Capacity:** Internal array size; grows automatically.

### `LinkedList<E>`
* **Implementation:** Elements stored in linked "containers" (nodes).
* **Structure:** Each container links to the next.

---

## ArrayList vs. LinkedList

| Feature | ArrayList | LinkedList |
| :--- | :--- | :--- |
| **Mechanism** | Internal array. Resizes by creating a new, larger array. | Linked containers. |
| **Best For** | **Storing & Accessing** (fast retrieval). | **Manipulating** (efficient insertion/deletion). |
| **Commonality**| Both implement `List` interface (add, change, remove, clear). | |