package com.metacube;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

/**
 * @author Vinod Patel
 *
 */
public class ArrayList<T> {
	
	private T[] objectList ;
	private int index;
	private int currentSize = 10;
	
	//initialize ArrayList with simple Object 
	public ArrayList(){
		objectList =(T[]) new Object[currentSize];
		index = 0;
	}
	
	
	//get element from the given index
	public T get(int index){
		if(index < this.index){
			return objectList[index];
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	
	//add a element to list
	public void add(int givenIndex, T newObject){
		
		if(givenIndex < 0 || this.size() <= givenIndex ){
			throw new ArrayIndexOutOfBoundsException();
		}
		
		if(givenIndex == index){
			increaseListSize();
		}
		
		for(int i = this.index ; i > givenIndex ; i--  ){
			objectList[i] = objectList[i-1];
		}
		objectList[givenIndex] = newObject;
		this.index++;
		
	}
	
	//add item to list
	public void add(T newObject){
		if(objectList.length == this.index){
			increaseListSize();
		}
		objectList[this.index++] = newObject;	
	}
	
	
	//add array list
	public ArrayList<T> add(ArrayList<T> list){
		for(int index = 0;index < list.size(); index++ ){
			add(list.get(index));
		}
		return this;
	}

	//increase the size of arrayList when it gets full
	private void increaseListSize() {
		currentSize = (int)currentSize*(3/2)+1;
		objectList = Arrays.copyOf(objectList, currentSize);
	}

	
	//remove object from given location
	public void remove(int index){
		
		if(index >=0 && index< this.index){
			objectList[index] = null;
			int temp = index;
			while(temp < this.index){
				objectList[temp] = objectList[temp+1];
				temp++;
			}
			objectList[temp] = null;
			this.index--;
			
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}
		
	}
	
	//remove object from list
	public void remove(T obj){
		int index = indexOf(obj);
		if(index >= 0){
			remove(index);
		}else{
			throw new NoSuchElementException("No such Element exists in list");
		}
	}
	
	//find index of object
	public int indexOf(T obj){
		int index;
		for(index=0; index < this.index;index++){
			if(obj.equals(objectList[index])){
				break;
			}
		}
		if(index == this.index){
			return -1;
		}
		return index;
	}
	
	
	public void clear(){
		int size = size();
		for(int index = 0 ; index < size() ; index++ ){
			objectList[index] = null;
		}
	}
	//return size of ArrayList
	private int size() {
		return index;
	}
	
	//reverse ArrayList
	public ArrayList<T> reverse(){
		ArrayList<T> newArray = new ArrayList<T>();
		int size = this.size();
		
		for(int index = 0;index < size; index++){
			newArray.add(this.get(size-index-1));
		}
		return newArray; 
	}
	
	//sort arrayList
	public void sort(){
		Arrays.sort(objectList, new Comparator<T>() {
		      public int compare(T o1, T o2) {
		    	  return String.valueOf(o1).compareTo(String.valueOf(o2));
		      }
		});
	}
	
	@Override
	public String toString() {
		String str = "[" +objectList[0] ;
		for (int i =1; i< objectList.length; i++) {
			str += ", " + objectList[i];
		}
		str += "]";
		return str;
	}
}
