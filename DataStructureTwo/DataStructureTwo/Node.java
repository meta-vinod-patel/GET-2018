package DataStructureTwo;
/**
 * 
 * @author Vinod Patel
 *
 * @param <T>
 */
public class Node<T> {

	protected T data;
	protected Node<T> link = null;
	
	/**
	 * 
	 * @param data
	 */
	public Node(T data){
		this.data = data;
	}
	
	/**
	 * 
	 * @param data
	 * @param link
	 */
	public Node(T data, Node link){
		this.data = data;
		this.link = link;
	}
	
	/**
	 * 
	 * @return link 
	 */
	public Node getLink(){
		return this.link;
	}
	
	/**
	 * 
	 * @param link
	 */
	public void setLink(Node link){
		this.link = link;
	}
	
	/**
	 * 
	 * @return data
	 */
	public T getData(){
		return this.data;
	}
	
	/**
	 * 
	 * @param data
	 */
	public void setData(T data){
		this.data = data;
	}
}
