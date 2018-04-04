package DataStructureOne;

import java.util.Arrays;

public class SinglyLinkedList<T> {

	private Node<T> start;
	
	public SinglyLinkedList() {
		this.start = null;
	}
	
	/**
	 * add any item
	 * @param item
	 */
	public void add(T item){
		Node<T> nptr = new Node<>(item);
		if( this.start == null ) {
			this.start = nptr;
		}else{
			Node<T> end = lastNode();
			end.setNextLink(nptr);
		}
	}
	
	/**
	 * add at any position in the linked list
	 * @param position
	 * @param item
	 */
	public void add(int position, T item) {
		int i = 0;
		boolean isAdded = false;
		Node<T> currentNode = this.start;
		 
		if(position == 0) {
			Node<T> ptr = new Node<>(item);
			ptr.setNextLink( currentNode );
			this.start = ptr;
			isAdded = true;
			
		} else if(position > 0) {
			
			while(currentNode != null) {
				
				if(position == i + 1) {
					Node<T> ptr =new Node<>(item);
					ptr.setNextLink( currentNode.getNextLink() );
					currentNode.setNextLink(ptr);
					isAdded = true;
					break;
				}
				i++;
				currentNode = currentNode.getNextLink();
			}
		}
		
		if(!isAdded) {
			throw new IndexOutOfBoundsException();
		}
	}
	
	/**
	 * 
	 * @param position
	 * @return
	 */
	public T remove(int position ){
		int i = 0 ;
		boolean isRemoved = false ;
		T removedElement = null ;
		Node<T> currentNode = this.start;
		
		if(!isEmpty()){
			if(position == 0 ){
				removedElement = this.start.getData();
				this.start = this.start.getNextLink();
				isRemoved = true;
			}else if(position > 0 ){
				while ( currentNode.getNextLink() != null ){
					if(position == i+1 ){
						removedElement = currentNode.getNextLink().getData();
						currentNode.setNextLink(currentNode.getNextLink().getNextLink());
						isRemoved = true ;
						break ;
					}
					i++;
					currentNode = currentNode.getNextLink();
				}
			}
		}
		
		if(!isRemoved){
			throw new IndexOutOfBoundsException();
		}
		return removedElement;
	}
	
	/**
	 * 
	 * @param item
	 * @return
	 */
	public boolean remove(T item ){
		boolean removed = false;
		Node<T> currentNode = this.start;
		
		int index = -1 ;
		
		while (currentNode != null ){
			index++;
			
			if(item == currentNode.getData()){
				remove(index);
				removed = true;
				break;
			}
			
			currentNode = currentNode.getNextLink();
		}
		
		return removed ;
	}
	
	/**
	 * 
	 * @param position
	 * @return
	 */
	public T getElement(int position){
		T element = null;
		int i = 0;
		Node<T> currentNode = this.start;
		
		if(position < 0 || position >= size()){
			throw new IndexOutOfBoundsException();
		} else {
			while(currentNode != null ){
				if(position == i ){
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
	 * reverse the elements 
	 */
	public void reverse(){
		Node<T> currentNode	= this.start;
		if(!isEmpty()){
			
			while(currentNode.getNextLink() != null ){
				Node<T> tempNode = currentNode.getNextLink();
				currentNode.setNextLink(tempNode.getNextLink());
				tempNode.setNextLink(this.start);
				this.start = tempNode;
			}
			
		}
	}
	
	/**
	 * sort
	 */
	public void sort(){
		T[] arr = toArray();
		Arrays.sort(arr);
		
		Node<T> currentNode = this.start;
		int i = 0 ;
		
		while(currentNode != null){
			currentNode.setData( arr[i++] );
			currentNode = currentNode.getNextLink();
		}
	}
	
	/**
	 * 
	 * @return
	 */
	private Node<T> lastNode() {
		Node<T> currentNode = this.start;
		
		while(currentNode.getNextLink() != null) {
			currentNode = currentNode.getNextLink();
		}
		
		return currentNode;
	}
	
	
	public int size() {
		int size = 0;
		Node<T> currentNode = this.start;
		
		while(currentNode != null) {
			size++;
			currentNode = currentNode.getNextLink();
		}
		return size;
	}
	
	public boolean isEmpty(){
		return ( this.start == null );
	}
	
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
	
	
}
