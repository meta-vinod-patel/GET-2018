package DataStructureTwo;

/**
 * 
 * @author Vinod Patel
 *
 * @param <T>
 */


public class LinkedList<T> {

	private Node<T> start;
	private Node<T> end;
	public int size;
	
	
	public LinkedList(){
		this.start = null;
		this.end = null;
		this.size = 0;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty(){
		return (this.start == null);
	}
	
	/**
	 * 
	 * @return
	 */
	public int getSize(){
		return size();
	}
	
	/**
	 * 
	 * @param item
	 */
	public void add(T item){
		Node<T> newNode = new Node<>(item);
		if(this.start == null ){
			this.start = newNode;
			this.end = newNode;
		}else{
			end.setLink(newNode);
			end = newNode;
		}
		
	} 
	
	
	
	public T getStart(){
		return start.getData();
	}	
	
	public T getEnd(){
		return end.getData();
	}
	
	public Node getEndNode(){
		return end;
	}
	
	/**
	 * 
	 * @param value
	 * @param position
	 */
	public void insertAtPosition(T value, int position){
		Node<T> newNode = new Node<>(value);
		position = position - 1 ;
		int i = 1;
		boolean isAdded = false;
		Node tempNode = start;
		
		if(start == null){
			start = newNode;
			end   = newNode;
			isAdded = true;
		}else if(position == 0 ){
			newNode.setLink(start);
			start = newNode;
			isAdded = true;
		}else{
			
			while(tempNode != null ){
				if(i == position){
					newNode.setLink(tempNode.getLink());
					if( tempNode.getLink() == null ){
						end = newNode;
					}
					tempNode.setLink(newNode);
					isAdded = true;
					
					break;
				}
				
				i++;
				tempNode = tempNode.getLink();
			}
			
			
		}
		
		if(!isAdded){
			throw new IndexOutOfBoundsException();
		}
		
	}
	
	/**
	 * 
	 * @param position
	 * @return
	 */
	public boolean deleteItemAtPosition(int position){
		position = position - 1;
		boolean isDeleted = false;
		int i = 1;
		
		if( !isEmpty() ){
			Node tempNode = start;
			Node nextTempNode = start.getLink();
			
			if(position == 0){	
				start = tempNode.getLink();
				tempNode.setLink(null);
			}else{
				
				while(nextTempNode != null){
					if( i == position ){
						tempNode.setLink(nextTempNode.getLink());
						nextTempNode.setLink(null);
						
						if( nextTempNode.getLink() == null ){
							end = tempNode;
						}
						
						isDeleted = true;
						break;
					}
					i++;
					tempNode = tempNode.getLink();
					nextTempNode = nextTempNode.getLink();
				}
				
			}
		}
		
		if(!isDeleted){
			throw new IndexOutOfBoundsException();
		}
		
		return isDeleted;
		
	}
	
	/**
	 * 
	 * @param item
	 * @return
	 */
	public boolean deleteByItem(T item){
		int position = 1 ;
		boolean isDeleted = false;
		if(!isEmpty()){
			Node tempNode = start;
			while(tempNode != null){
				if(tempNode.getData() == item){
					isDeleted = deleteItemAtPosition(position);
				}
				position++;
				tempNode = tempNode.getLink();
			}
		}
		
		return isDeleted;
	}
	
	/**
	 * 
	 * @param position
	 * @return
	 */
	public T getElement(int position){
		int i = 1 ;
		Node<T> tempNode = start;
		
		if( position < 0 || position > size()){
			throw new IndexOutOfBoundsException();
		}else{
			while(i != position ){
				tempNode = tempNode.getLink();
				i++;
			}
		}
		
		return tempNode.getData();
	}
	
	/**
	 * 
	 * @return
	 */
	public int size() {
		int size = 0;
		Node<T> currentNode = this.start;
		
		while(currentNode != null) {
			size++;
			currentNode = currentNode.getLink();
		}
		return size;
	}
	
	
	@SuppressWarnings("unchecked")
	public T[] toArray() {
		T[] array = (T[]) new Object[ this.size() ];
		Node<T> currentNode = this.start;
		int i = 0;
		
		while(currentNode != null) {
			array[i++] = currentNode.getData();
			currentNode = currentNode.getLink();
		}
		return array;
	}
	
}
