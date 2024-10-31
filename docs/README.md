# Binary Tree Traversal

## Overview
This project implements a binary tree and provides methods for pre-order and in-order traversal using recursive functions. 

## Recursive Functions
### Pre-order Traversal
The pre-order traversal visits the nodes in the following order:
1. Root
2. Left Subtree
3. Right Subtree

**Time Complexity:** O(n)  
**Space Complexity:** O(h), where h is the height of the tree.

### In-order Traversal
The in-order traversal visits the nodes in the following order:
1. Left Subtree
2. Root
3. Right Subtree

**Time Complexity:** O(n)  
**Space Complexity:** O(h), where h is the height of the tree.

## Stack Frames Diagram
A diagram illustrating the stack frames during the recursive calls can be found in the project documentation folder.

## Usage
To run the project, use the following command:
```
mvn clean install
```
Then execute the `Main` class to see the traversal methods in action.