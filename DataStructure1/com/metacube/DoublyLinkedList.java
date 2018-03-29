package DataStructureOne;

import java.util.Arrays;
/**
 * 
 * @author Vinod Patel
 *
 * @param <T>
 */
public class DoublyLinkedList<T> {

	private Node<T> start;
	private Node<T> end;
	
	/**
	 * Constructor
	 */
	public DoublyLinkedList(){
		this.start = null;
		this.end = null;
	}
	
	/**
	 * 
	 * @param item
	 */
	public void add(T item){
		Node<T> newNode = new Node<>(item);
		if(this.start == null ){
			this.start = newNode;
			this.end = this.start;
		} else {
			newNode.setPreviousLink(this.end);
			this.end.setNextLink(newNode);
			this.end = newNode;
		}
	}
	
	/**
	 * 
	 * @param position
	 * @param item
	 */
	public void add(int position, T item){
		int i = 0 ;
		boolean isAdded = false;
		Node<T> currentNode = this.start;
		
		if(position == 0){
			Node<T> newNode = new Node<>(item);
			newNode.setNextLink(currentNode);
			
			if(currentNode != null){
				currentNode.setPreviousLink(newNode);
			}
			this.start = newNode;
			isAdded = true;
		} else if(position > 0 ){
			while (currentNode != null ){
				if(position == i+1){
					Node<T> newNode = new Node<>(item);
					newNode.setNextLink(currentNode.getNextLink());
					newNode.setPreviousLink(currentNode);			
					
					if(currentNode.getNextLink() != null) {
						currentNode.getNextLink().setPreviousLink(newNode);
						
					} else{
						this.end = newNode;
					}
					currentNode.setNextLink(newNode);
					isAdded = true;
					break;	
				}
				i++;
				currentNode = currentNode.getNextLink();
			}
		}
		if(!isAdded){
			throw new IndexOutOfBoundsException();
		}
	}
	
	/**
	 * 
	 * @param item
	 * @return
	 */
	public boolean remove (T item) {
		 Node<T> currentNode = this.start;
		 boolean isRemoved = false;
		 int index = -1;
		 
		 while (currentNode != null) {
			 index++;
			 
			 if (item == currentNode.getData()){
				 remove (index);
				 isRemoved = true;
				 break;
			 }
			 currentNode = currentNode.getNextLink();
		 }
		 return isRemoved;
	}
	
	/**
	 * 
	 * @param position
	 * @return
	 */
	public T remove (int position) {
		int i = 0;
		boolean isRemoved = false;
		T removedElement = null;
		Node<T> currentNode = this.start;
		
		if(!isEmpty()) {
			
			if(position == 0) {
				removedElement = this.start.getData();
				this.start = this.start.getNextLink();
				this.start.setPreviousLink(null);
				isRemoved = true;
				
			} else if(position > 0) {
				
				while(currentNode.getNextLink() != null) {
					
					if(position == i + 1) {
						Node<T> removedNode = currentNode.getNextLink();
						removedElement = removedNode.getData();
						currentNode.setNextLink( removedNode.getNextLink() );
						removedNode.getNextLink().setPreviousLink(currentNode);
						isRemoved = true; 
						break;
					}
					i++;
					currentNode = currentNode.getNextLink();
				}
			}
		}
		
		if(!isRemoved) {
			throw new IndexOutOfBoundsException();
		}
		
		return removedElement;
	}
	
	
	/**
	 * 
	 * @param position
	 * @return
	 */
	public T getElement(int position) {
		T element = null;
		int i = 0;
		Node<T> currentNode = this.start;
		
		if(position < 0 || position >= size()) {
			throw new IndexOutOfBoundsException();
			
		} else {
			
			while(currentNode != null) {
						
				if(position == i) {
					element = currentNode.getData();
					break;
				}
				i++;
				currentNode = currentNode.getNextLink();
			}
		}
		return element;
	}
	
	
	/**
	 * to reverse the linked list
	 */
	public void reverse() {
		Node<T> currentNodeFromStart = this.start;
		Node<T> currentNodeFromEnd = this.end;
		
		if( !isEmpty() ){
			
			while(currentNodeFromStart.getNextLink() != currentNodeFromEnd && currentNodeFromEnd != currentNodeFromStart) {
				T temporaryElement = currentNodeFromStart.getData();
				currentNodeFromStart.setData(currentNodeFromEnd.getData());
				currentNodeFromEnd.setData(temporaryElement);
				
				currentNodeFromStart = currentNodeFromStart.getNextLink();
				currentNodeFromEnd = currentNodeFromEnd.getPreviousLink();
			}
		}
	}
	
	/**
	 * sort linked list
	 */
	public void sort (){
		T[] arr = toArray();
		Arrays.sort(arr);
		
		Node<T> ptr = this.start;
		int i = 0;
		while (ptr != null) {
			ptr.setData(arr[i++]);
			ptr = ptr.getNextLink();
		}
	}
	
	/**
	 * 
	 * @return array
	 */
	@SuppressWarnings("unchecked")
	public T[] toArray() {
		T[] array = (T[]) new Object[ this.size() ];
		Node<T> currentNode = this.start;
		int i = 0;
		
		while(currentNode != null) {
			array[i++] = currentNode.getData();
			currentNode = currentNode.getNextLink();
		}
		return array;
	}
	
	/**
	 * 
	 * @return boolean isEmply or not
	 */
	private boolean isEmpty() {
		return this.start == null;
	}
	
	/**
	 * 
	 * @return size of list
	 */
	private int size(){
		int size = 0;
		Node<T> currentNode = this.start;
		
		while(currentNode != null) {
			size++;
			currentNode = currentNode.getNextLink();
		}
		return size;
	}
	
}
