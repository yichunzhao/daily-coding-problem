package com.ynz.CodeCharllenge.binarytree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class BinarySearchTreeTest {

    private BinarySearchTree tree = new BinarySearchTree();

    @BeforeEach
    void setUp() {
        tree.insert(10);
        tree.insert(12);
        tree.insert(8);
    }

    @Test
    void testBiTreeInsert() {
        TreeNode root = tree.getRoot();

        assertAll(
                () -> assertNotNull(root),
                () -> assertThat(root.getValue(), is(10)),
                () -> assertNotNull(root.getLeftChild()),
                () -> assertNotNull(root.getRightChild()),
                () -> assertThat(root.getRightChild().getValue(), is(12)),
                () -> assertThat(root.getLeftChild().getValue(), is(8))
        );
    }

    @Test
    void testFindValueInBiTree() {
        TreeNode found = tree.find(12);
        assertNotNull(found);
    }

    @Test
    void whenBiTreeHasNoValue_ItReturnNullValue() {
        TreeNode found = tree.find(14);
        assertNull(found);
    }

    @Test
    void testFindValueOnRoot() {
        TreeNode found = tree.find(10);
        assertNotNull(found);
    }

    @Test
    void whenTargetIsLeftLeaf_ItReturnNotNull() {
        TreeNode found = tree.find(8);
        assertNotNull(found);
    }

}