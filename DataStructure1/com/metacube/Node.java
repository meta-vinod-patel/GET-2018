package DataStructureOne;
/**
 * 
 * @author Vinod Patel
 *
 * @param <T> generic parameter
 */
public class Node<T> {

	private Node<T> nextLink = null ; 
	private Node<T> previousLink = null;
	private T data;
	
	/**
	 * 
	 * @param data
	 */
	public Node(T data){
		this.data = data;
	}
	
	/**
	 * 
	 * @return nextLink Node<T>
	 */
	public Node<T> getNextLink(){
		return this.nextLink;
	}
	
	
	/**
	 * 
	 * @param link
	 */
	
	public void setNextLink(Node<T> link){
		this.nextLink = link;
	}
	
	/**
	 * 
	 * @return previousLink
	 */
	
	public Node<T> getPreviousLink(){
		return this.previousLink;
	}
	
	
	/**
	 * 
	 * @param link
	 */
	public void setPreviousLink(Node<T> link){
		this.previousLink = link;
	}
	
	
	/**
	 * 
	 * @return data
	 */
	public T getData(){
		return this.data;
	}
	
	
	/**[
	 * 
	 * @param data
	 */
	public void setData(T data){
		this.data = data;	
	}
	
	
}
