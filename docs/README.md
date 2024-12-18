# Binary Tree Traversal

## Table of Contents

1. [Overview](#overview)
2. [Understanding Binary Trees in Java](#understanding-binary-trees-in-java)
3. [Types of Trees in Java](#types-of-trees-in-java)
4. [Additional Examples](#additional-examples)
5. [Stack Frame Diagrams](#stack-frame-diagrams)
6. [Recursive Functions in Tree Traversal](#recursive-functions-in-tree-traversal)
7. [Applicability in Java](#applicability-in-java)
8. [Usage](#usage)

## Understanding Binary Trees in Java

A **binary tree** is a hierarchical data structure in which each node has at most two children, referred to as the left child and the right child. Binary trees are essential for various applications like searching, sorting, and representing hierarchical data.

### Node Structure

The `Node` class represents each element in the tree, containing:

- **Data**: The value stored in the node.
- **Left Child**: The reference to the left subordinate node.
- **Right Child**: The reference to the right subordinate node.

## Types of Trees in Java

Here are the main types of trees in Java, with their key characteristics:

1. **Binary Trees**

    ```java
    class BinaryNode {
        int data;
        BinaryNode left;
        BinaryNode right;
    }
    ```

    - Each node has at most 2 children

2. **Binary Search Trees (BST)**

    ```java
    class BST {
        int data;
        BST left;  // All values less than data
        BST right; // All values greater than data
    }
    ```

    - Ordered binary tree
    - Left subtree values < node value
    - Right subtree values > node value

3. **AVL Trees**

    ```java
    class AVLNode {
        int data;
        int height;
        AVLNode left;
        AVLNode right;
    }
    ```

    - Self-balancing BST
    - Height difference between subtrees ≤ 1
    - O(log n) operations

4. **Red-Black Trees**

    ```java
    class RBNode {
        int data;
        boolean isRed;
        RBNode left;
        RBNode right;
        RBNode parent;
    }
    ```

    - Self-balancing BST
    - Nodes are red or black
    - Root and leaves (NIL) are black
    - Red nodes have black children

5. **B-Trees**

    ```java
    class BTreeNode {
        int[] keys;
        BTreeNode[] children;
        int numKeys;
        boolean isLeaf;
    }
    ```

    - Multiple keys per node
    - Used in databases and file systems
    - Balanced height

6. **Trie (Prefix Tree)**

    ```java
    class TrieNode {
        TrieNode[] children = new TrieNode[26]; // for alphabet
        boolean isEndOfWord;
    }
    ```

    - Used for string operations
    - Each node represents a character
    - Path from root forms string

7. **Heap**

    ```java
    class BinaryHeap {
        int[] heapArray;
        int size;

        void heapifyUp(int index) {...}
        void heapifyDown(int index) {...}
    }
    ```

    - Complete binary tree
    - Max-heap or min-heap property
    - Implemented using arrays

Each type has specific use cases:

- **BST**: Searching and sorting
- **AVL/Red-Black**: Balanced operations
- **B-Tree**: Databases
- **Trie**: String operations
- **Heap**: Priority queues

## Additional Examples

### Binary Tree Example - File System

## Stack Frame Diagrams

1. **Binary Search Tree Stack Frame**
```
     BST Stack Frame (for tree:     5    )
                                  /   \   
                                3     7   
                               / \   / \  
                              1   4 6   8 

Call Stack (grows downward):
+--------------------------+
| insert(5)                | → root node
+--------------------------+
    | insert(3)            | → less than 5, go left
    +--------------------+
        | insert(1)      | → less than 3, go left
        +--------------+
    | insert(4)          | → greater than 3, go right
    +------------------+
| insert(7)              | → greater than 5, go right
+-----------------------+
    | insert(6)          | → less than 7, go left
    +------------------+
    | insert(8)          | → greater than 7, go right
    +------------------+
```

2. **AVL Tree Rotation Stack Frame**
```
     AVL Stack Frame (for unbalanced tree:  3   )
                                         /   \   
                                        2     4  
                                       /         
                                      1          

Call Stack (rotation):
+---------------------------+
| insert(1)                 | → triggers rebalance
+---------------------------+
    | calculateBalance(2)   | → height diff > 1
    +---------------------+
        | rotateRight(3)  | → perform rotation
        +----------------+
| updateHeight()           | → recalculate heights
+-------------------------+

Result after rotation:      2
                         /   \
                        1     3
                              \
                               4
```

3. **Red-Black Tree Recolor Stack Frame**
```
     RB Stack Frame (for tree:      5B     )
                                  /    \    
                                3R     7R   
                               / \    / \   
                             1B  4B  6B  8B 

Call Stack (recolor after insert):
+---------------------------+
| insert(6)                 | → new red node
+---------------------------+
    | checkColor(7)         | → parent is red
    +---------------------+
        | recolor(5)      | → recolor root
        +----------------+
    | rotate(7)           | → if needed
    +-----------------+

B = Black node
R = Red node
```

4. **B-Tree Insert Stack Frame**
```
     B-Tree Stack Frame (order 3):     [10,20]
                                     /    |    \
                                   [5]  [15]  [25]

Call Stack (insert 12):
+--------------------------------+
| searchNode(12)                 | → find insertion point
+--------------------------------+
    | splitIfFull([15])         | → check node capacity
    +------------------------+
        | redistribute()     | → balance if needed
        +-----------------+
| updateParent()              | → update parent keys
+----------------------------+
```

These diagrams illustrate:
- The hierarchical nature of tree operations
- Stack growth during recursive calls
- State changes during balancing operations
- The order of operations during insertions and rotations

The key formatting elements are:
- Tree structure visualization
- Call stack progression
- Operation annotations
- Clear node relationships


5. **Trie Stack Frame**
```
     Trie Stack Frame (for words: "CAT", "CAR")
                                root
                                 |
                                 C
                                 |
                                 A
                               /   \
                              T     R

Call Stack (insert "CAT"):
+--------------------------------+
| insert("CAT")                  | → start at root
+--------------------------------+
    | createNode('C')            | → first letter
    +------------------------+
        | createNode('A')    | → second letter
        +------------------+
            | createNode('T')| → mark as word end
            +--------------+

Call Stack (search "CAR"):
+--------------------------------+
| search("CAR")                  | → traverse from root
+--------------------------------+
    | traverse('C')              | → found
    +------------------------+
        | traverse('A')      | → found
        +------------------+
            | traverse('R') | → found, is word
            +--------------+
```

6. **Heap Stack Frame**
```
     Heap Stack Frame (max heap):    100
                                   /    \
                                 70      90
                                /  \    /  \
                               40  35  60   80

Call Stack (insert 95):
+--------------------------------+
| insert(95)                     | → add at bottom right
+--------------------------------+
    | heapifyUp(95)              | → compare with parent
    +------------------------+
        | swap(90, 95)      | → bubble up
        +------------------+
    | updateParent()        | → maintain heap property
    +--------------------+

Result:           100
                /    \
              95      90
             /  \    /  \
            40  35  60   80
```

7. **Segment Tree Stack Frame**
```
     Segment Tree Stack Frame (sum query):
                       [0-7]:36
                      /        \
              [0-3]:10        [4-7]:26
              /     \         /      \
        [0-1]:3  [2-3]:7  [4-5]:11  [6-7]:15

Call Stack (query sum[2,5]):
+--------------------------------+
| query(2,5)                     | → range intersection
+--------------------------------+
    | checkRange([2-3])         | → partial overlap
    +------------------------+
        | sumRange(7)        | → accumulate
        +------------------+
    | checkRange([4-5])     | → complete overlap
    +--------------------+
        | return(11)      | → add to result
        +---------------+
```

Each diagram shows:
- Tree structure
- Call stack progression
- Operation flow
- State changes during operations

## Recursive Functions in Tree Traversal

### Pre-order Traversal

In pre-order traversal, the nodes are recursively visited in this order:

1. Visit the root node.
2. Traverse the left subtree.
3. Traverse the right subtree.

```java
void preOrderTraversal(Node node) {
    if (node == null) {
        return;
    }
    System.out.print(node.data + " ");
    preOrderTraversal(node.left);
    preOrderTraversal(node.right);
}
```

### In-order Traversal

In in-order traversal, the nodes are recursively visited in this order:

1. Traverse the left subtree.
2. Visit the root node.
3. Traverse the right subtree.

```java
void inOrderTraversal(Node node) {
    if (node == null) {
        return;
    }
    inOrderTraversal(node.left);
    System.out.print(node.data + " ");
    inOrderTraversal(node.right);
}
```

## Applicability in Java

Binary tree traversal is widely used in various applications, including:

- **Expression Trees**: Evaluating arithmetic expressions.
- **Syntax Trees**: Parsing expressions in compilers.
- **Decision Trees**: Making decisions in machine learning models.
- **Hierarchical Data**: Representing organizational structures.

## Usage

To use the binary tree traversal methods, create an instance of the `BinaryTree` class and call the traversal methods:

```java
public class BinaryTree {
    Node root;

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Pre-order traversal:");
        tree.preOrderTraversal(tree.root);

        System.out.println("\nIn-order traversal:");
        tree.inOrderTraversal(tree.root);
    }

    void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }
}

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}