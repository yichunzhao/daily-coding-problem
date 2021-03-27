package com.ynz.CodeCharllenge.binarytree;

/**
 * one root node
 * each node has one or two leaves
 * left node < node
 * right node > node
 */
public class BinarySearchTree {

    private TreeNode root;

    public void insert(Integer target) {
        //if root is null, target is the root, else insert this target.
        if (root == null) root = new TreeNode(target);
        else {
            root.insert(target);
        }
    }

    public TreeNode find(Integer target) {
        if (root == null) return null;
        return root.find(target);
    }

    public void delete(TreeNode node) {

    }

    public TreeNode getRoot() {
        return root;
    }

}
