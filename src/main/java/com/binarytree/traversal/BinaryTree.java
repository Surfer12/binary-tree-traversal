package com.binarytree.traversal;

import com.binarytree.model.Node;
import com.binarytree.exception.TreeException;
import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    private Node root;
    private List<Integer> traversalResult;

    public BinaryTree() {
        this.root = null;
        this.traversalResult = new ArrayList<>();
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.getValue()) {
            node.setLeft(insertRec(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(insertRec(node.getRight(), value));
        }

        return node;
    }

    public List<Integer> preOrderTraversal() {
        traversalResult.clear();
        preOrderTraversal(root);
        return new ArrayList<>(traversalResult);
    }

    private void preOrderTraversal(Node node) {
        if (node != null) {
            traversalResult.add(node.getValue());
            preOrderTraversal(node.getLeft());
            preOrderTraversal(node.getRight());
        }
    }

    public List<Integer> inOrderTraversal() {
        traversalResult.clear();
        inOrderTraversal(root);
        return new ArrayList<>(traversalResult);
    }

    private void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.getLeft());
            traversalResult.add(node.getValue());
            inOrderTraversal(node.getRight());
        }
    }
} 