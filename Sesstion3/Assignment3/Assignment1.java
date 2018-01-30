/**
 * 
 * @author Vinod Patel
 *
 */
public class Assignment1 {

	//this function will partition the array in two parts where pivot element is sorted and all elements left to pivot are small
	int partition(int arr[], int low, int high) {
		
		int pivot = arr[high];//picking the pivot as last element in the array of sub-array in case of recursion 
		int i = low-1;//finding the beginning of the sub-array
		
		//running the loop from starting to end to sort the pivot and putting all small elements to left and larger to right
		for(int j=low; j<high; j++){
			if(arr[j]<=pivot) {	//if element in the array is smaller then pivot we are swapping 
				i++;//increment before swapping.
				arr[j] = arr[i]+arr[j]-(arr[i]=arr[j]);	//swapping
			}
		}
		
		arr[i+1] = arr[i+1]+arr[high]-(arr[high]=arr[i+1]);	//this statement is putting pivot at its right position or sorting the pivot.
		
		return i+1;
	}
	
	//this is quicksort function
	public int[] quickSort(int arr[], int low, int high) {
		
		if(low<high) {
			
			int partition = partition(arr, low, high);//partition line or pivot position
			
			quickSort(arr, low, partition-1);//sub-array where all elements are smaller then pivot
			quickSort(arr, partition+1, high);//sub-array where all elements are greater then pivot
		}
		
		return arr;
	}
}