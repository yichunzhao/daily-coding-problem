package com.ynz.CodeCharllenge.binarytree;

public class TreeNode {
    private Integer value;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(Integer value) {
        this.value = value;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public Integer getValue() {
        return value;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public TreeNode find(Integer target) {
        //if target is current root, then return it.
        //condition to quit from the recursion.
        if (target == value) return this;

        //otherwise, if its value less than root value, find the left sub-tree
        TreeNode leftChild = this.getLeftChild();
        if (target < this.getValue() && leftChild != null) {
            return leftChild.find(target);
        }

        //otherwise, if its value greater than root value, find the right sub-tree
        TreeNode rightChild = this.getRightChild();
        if (target > this.getValue() && rightChild != null) {
            return rightChild.find(target);
        }

        //if doesn't have sub-trees, then it is not found
        return null;
    }

    public void insert(Integer target) {
        if (target >= this.getValue() && this.getRightChild() == null) {
            this.setRightChild(new TreeNode(target));
        } else {
            this.setLeftChild(new TreeNode(target));
        }
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
    
}
