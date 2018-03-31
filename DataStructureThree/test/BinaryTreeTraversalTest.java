package DataStructureThree;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import org.junit.Test;

public class BinaryTreeTraversalTest {
	
	private BinaryTree<String> node;
	private String[] array = new String[] {"2", "4", "6", "3"};
	private BinaryTreeTraversal<String> traverse;
	
	@Before
	public void inititate() {
		node = new BinaryTree<>();
		node = node.createBinaryTree(array);
		traverse = new BinaryTreeTraversal<>();
	}
	
	@Test
	public void testPreOrder() {
		String expected = "2436";
		assertEquals(expected, traverse.preOrder(node));
	}
	
	@Test
	public void testPostOrder() {
		String expected = "3462";
		assertEquals(expected, traverse.postOrder(node));
	}
	
	@Test
	public void testInOrder() {
		String expected = "3426";
		assertEquals(expected, traverse.inOrder(node));
	}
	
	@Test
	public void testIsBinaryTreeMirrorEqual() {
		BinaryTree<String> root = new BinaryTree<>("2");
		BinaryTree<String> left = new BinaryTree<>("6");
		BinaryTree<String> right = new BinaryTree<>("4");
		BinaryTree<String> rightRight = new BinaryTree<>("3");
		root.setLeft(left);
		root.setRight(right);
		right.setRight(rightRight);
		assertTrue(traverse.isBinaryTreeMirrorEqual(node, root));
		
	}

	/**
	 * method to test createBinaryTree method for getting exception
	 */
	@Test(expected = ArithmeticException.class)
	public void testCreateBinaryTree() {
		String[] arr = new String[] {};
		BinaryTree<String> b = node.createBinaryTree(arr);
	}

}
