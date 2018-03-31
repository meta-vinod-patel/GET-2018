package DataStructureThree;
/**
 * 
 * @author Vinod Patel
 *
 * @param <T>
 */
public class BinaryTree<T> {
	private T data;
	private BinaryTree<T> left = null ;
	private BinaryTree<T> right = null ;
	
	public BinaryTree(T data){
		this.data = data;
	}	
	public BinaryTree(){
	}
	
	public T getData(){
		return this.data;
	}
	
	public void setData(T data){
		this.data = data ;
	}
	
	public void setRight(BinaryTree<T> data){
		this.right = data;
	}
	
	public BinaryTree<T> getRight(){
		return this.right;
	}
	
	public void setLeft(BinaryTree<T> data){
		this.left = data;
	}
	
	public BinaryTree<T> getLeft(){
		return this.left;
	}
	
	/**
	 * initialize and create a binary tree from passed array
	 * @param arr
	 * @return
	 */
	public BinaryTree<T> createBinaryTree(T arr[]){
		if(arr.length  == 0){
			throw new ArithmeticException("Empty array Passed");
		}
		return createBinaryTree(arr,0);
	}
	
	/**
	 * create binaryTree from the passed array and index recursively.
	 * @param arr
	 * @param index
	 * @return
	 */
	public BinaryTree<T> createBinaryTree(T[] arr, int index){
		BinaryTree<T> node = new BinaryTree<>(arr[index]);
		if(arr.length > (index * 2) + 1) {
			node.setLeft( createBinaryTree(arr, (index * 2) + 1) );
		}
		
		if(arr.length > (index * 2) + 2) {
			node.setRight( createBinaryTree(arr, (index * 2) + 2) );
		}
		return node;
	}
}
