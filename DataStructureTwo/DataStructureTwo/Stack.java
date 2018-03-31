package DataStructureTwo;
/**
 * 
 * @author Vinod Patel
 *
 * @param <T>
 */
public class Stack<T> {
	
	private Node<T> top;
	
	public Stack(){
		this.top = null;
	}
	
	/**
	 * 
	 * @param add item to stack
	 */
	public void push(T item){
		Node<T> newNode = new Node<>(item);
		newNode.setLink(top);
		top = newNode;
	}
	
	/**
	 * 
	 * @return removed item
	 */
	public T pop(){
		T item;
		if( isEmpty() ){
			throw new IndexOutOfBoundsException("Stack Underflow");
		}else{
			item = top.getData();
			top = top.getLink();
		}
		return item;
	}
	
	/**
	 * 
	 * @return peek
	 */
	public T peek(){
		if( top == null ){
			throw new IndexOutOfBoundsException("Stack Underflow");
		}else{
			return top.getData();
		}
	}
	
	/**
	 * 
	 * @return size
	 */
	public int size(){
		int size = 0;
		if( top != null ){
			Node temp = top;
			while(temp != null ){
				size++;
				temp = temp.getLink();
			}
		}
		return size;
	}
	
	@SuppressWarnings("unchecked")
	public T[] toArray() {
		T[] array = (T[]) new Object[ this.size() ];
		Node<T> currentNode = this.top;
		int i = 0;
		
		while(currentNode != null) {
			array[i++] = currentNode.getData();
			currentNode = currentNode.getLink();
		}
		return array;
	}
	
	/**
	 * method to check whether stack is empty or not
	 * @return true or false
	 */
	public boolean isEmpty() {
		return (this.top == null);
	}

	
}
