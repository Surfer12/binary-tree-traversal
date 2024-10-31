# Binary Tree Traversal

## Overview
This project implements a binary tree and provides methods for pre-order and in-order traversal using recursive functions. 

## Recursive Functions
### Pre-order Traversal
The pre-order traversal visits the nodes in the following order:
1. Visit the root node.
2. Traverse the left subtree.
3. Traverse the right subtree.

**Time Complexity:** O(n)  
**Space Complexity:** O(h) where h is the height of the tree.

### In-order Traversal
The in-order traversal visits the nodes in the following order:
1. Traverse the left subtree.
2. Visit the root node.
3. Traverse the right subtree.

**Time Complexity:** O(n)  
**Space Complexity:** O(h) where h is the height of the tree.

## Stack Frames Diagram
A diagram illustrating the stack frames during the execution of the recursive functions can be found in the project documentation.

## Usage
To run the project, use the following command:
```
mvn clean install
```
Then execute the `Main` class to see the traversal in action.