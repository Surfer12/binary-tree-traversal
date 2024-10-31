# Binary Tree Traversal

## Overview
This project implements a binary tree and provides methods for pre-order and in-order traversal using recursive functions.

## Understanding Binary Trees in Java
A **binary tree** is a hierarchical data structure in which each node has at most two children, referred to as the left child and the right child. Binary trees are essential for various applications like searching, sorting, and representing hierarchical data.

### Node Structure
The `Node` class represents each element in the tree, containing:
- **Data**: The value stored in the node.
- **Left Child**: The reference to the left subordinate node.
- **Right Child**: The reference to the right subordinate node.

## Recursive Functions in Tree Traversal
Recursion is a fundamental concept in Java where a method calls itself to solve smaller instances of the same problem. It is particularly useful in tree traversal due to the tree's recursive nature.

### Pre-order Traversal
The pre-order traversal visits nodes in the order:
1. **Root**
2. **Left Subtree**
3. **Right Subtree**

**Algorithm:**
- Process the current node.
- Recursively perform pre-order traversal on the left subtree.
- Recursively perform pre-order traversal on the right subtree.

**Key Insights:**
- Useful for copying the tree or prefix expression evaluations.
- Demonstrates how recursive calls build up and unwind in the call stack.

### In-order Traversal
The in-order traversal visits nodes in the order:
1. **Left Subtree**
2. **Root**
3. **Right Subtree**

**Algorithm:**
- Recursively perform in-order traversal on the left subtree.
- Process the current node.
- Recursively perform in-order traversal on the right subtree.

**Key Insights:**
- In binary search trees (BST), in-order traversal retrieves data in ascending order.
- Highlights the depth-first traversal approach.

## Applicability in Java
- **Recursion:** Simplifies code for complex data structures like trees.
- **Call Stack Understanding:** Visualizing recursive calls helps in grasping how the call stack operates.
- **Tree Structures:** Fundamental for advanced topics like balancing trees, tree-based algorithms, and memory management.

## Visualizing Recursion and Stack Frames
Understanding the flow of recursive calls:
- Each recursive call adds a new frame to the call stack.
- The call stack maintains the order of operations and local variables.
- Visualization aids in debugging and optimizing recursive methods.

## Stack Frame Analysis

### Pre-order Traversal Stack Frames

## Usage
To run the project, compile the Java files and execute the `Main` class:
```
Then execute the `Main` class to see the traversal methods in action.

/* binary-tree-traversal
├── src
│   ├── main
│   │   └── java
│   │       ├── BinaryTree.java
│   │       ├── Node.java
│   │       └── Main.java
│   └── test
│       └── java
│           └── BinaryTreeTest.java
├── docs
│   └── README.md
├── pom.xml
└── README.md */