package DataStructureThree;
/**
 * 
 * @author Vinod Patel
 *
 * @param <T>
 */
public class BinaryTreeTraversal<T> {

	/**
	 * preOrder
	 * @param node
	 * @return
	 */
	public String preOrder(BinaryTree<T> node){
		String preOrder = "";
		if(node != null){
			preOrder+=node.getData().toString();
			preOrder += preOrder(node.getLeft());
			preOrder += preOrder(node.getRight());
		}
		return preOrder;
	}
	
	/**
	 * PostOrder
	 * @param node
	 * @return
	 */
	public String postOrder(BinaryTree<T> node) {
		String postOrder = "";
		
		if(node != null) {
			postOrder += postOrder(node.getLeft());
			postOrder += postOrder(node.getRight());
			postOrder += node.getData().toString();
		}
		return postOrder;
	}
	
	
	/**
	 * inorder
	 * @param node
	 * @return
	 */
	public String inOrder(BinaryTree<T> node) {
		String inOrder = "";
		
		if(node != null) {
			inOrder += inOrder(node.getLeft());
			inOrder += node.getData().toString();
			inOrder += inOrder(node.getRight());
		}
		return inOrder;
	}
	
	
	/**
	 * is Equal
	 * @param firstTreeNode
	 * @param secondTreeNode
	 * @return
	 */
	public boolean isBinaryTreeMirrorEqual(BinaryTree<T> firstTreeNode, BinaryTree<T> secondTreeNode) {
		boolean isEqual = false;
		
		if(firstTreeNode != null && secondTreeNode != null) {
			if( isBinaryTreeMirrorEqual(firstTreeNode.getLeft(), secondTreeNode.getRight())) {
				if(isBinaryTreeMirrorEqual(firstTreeNode.getRight(), secondTreeNode.getLeft())) {
					isEqual = firstTreeNode.getData() == secondTreeNode.getData();
				}
			}
		} 
		return (firstTreeNode == null && secondTreeNode == null) || isEqual;
	}
	
}
