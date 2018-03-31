package DataStructureTwo;

import java.util.Arrays;

/**
 * 
 * @author Vinod Patel
 *
 */
public class Queue<T> {
	private T[] array;
	private int size = 0;
	
	public Queue(){
		this.array = createArray(10);
	}
	
	/**
	 * adding item to queue
	 * @param item
	 */
	public void enqueue(T item){
		if( size < this.array.length ){
			this.array[size] = item;
			size++;
		}else if(size<0){
			size = 0;
			this.array[size] = item;
			size++;
		}else{
			this.array = Arrays.copyOf(array, this.array.length + 10);
			this.array[size] = item;
			size++;
		}
	}
	
	/**
	 * removing item first item from queue and returning removed item
	 * @return removed item
	 */
	public T dequeue(){
		if(size > 0){
			T removedObject = this.array[0];
			this.array = Arrays.copyOfRange(this.array, 1, this.array.length);
			size--;
			return removedObject;
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	/**
	 * making queue empty my deleting all items
	 */
	public void makeEmpty(){
		this.array = createArray(10);
		size = 0;
	}
	
	/**
	 * getting front item from queue
	 * @return
	 */
	
	public T getFront(){
		return this.array[0];
	}
	/**
	 * create object of specific size;
	 * @param arrSize
	 * @return
	 */
    private T[] createArray(int arrSize) {
    	return (T[]) new Object[arrSize];
    }
    
    
    /**
     * passing a empty array and coping this array in new array in case to apply sorting.
     * @param arr
     * @return arr
     */
    public T[] toArray(T[] arr) {
        
        for(int i = 0; i < this.size; i++) {
            arr[i] = this.array[i];
        }
        return arr;
    }
    
    /**
     * get size of the queue
     * @return
     */
    public int getSize(){
    	return this.size;
    }
    
    @Override
    public String toString() {
        String s = "[";
        
        if(getSize() != 0) {
            s += this.array[0];
            
            for(int i = 1; i < this.array.length; i++) {
                s += ", " + this.array[i];
            }
        }
        return s+ "]";
    }
}
