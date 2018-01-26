/*
*
*
*	@author Vinod Patel
*
*/
public class Assignment5{
	
	/*	//For Debugging 
		public static void main(String[] arg){
		
		int[] test_array = new int[]{23,21,22};
		int result;
		
		result = check_sorted(test_array);
		
		System.out.println(result);
		}*/
	
	 int check_sorted(int input_array[]){//To check for ascending or descending  
		
		
		int token = 0 ;
		
			if(input_array[0] <= input_array[1]){
				for(int counter=0 ; counter<input_array.length-1 ; counter++){
					if(input_array[counter] > input_array[counter + 1]){
						token = 1;
					}
				}
				
				//if token is 1 the input_array is not sorted
				if(token==1){
					return 0;
				} else {
					
					return 1;
				}
				
			}else if(input_array[0] >= input_array[1]){
				for(int counter=0 ; counter<input_array.length-1 ; counter++){
					if(input_array[counter] < input_array[counter + 1]){
						token = 1;
					}
				}
				
				//if token is 1 the input_array is not sorted
				if(token==1){
					return 0;
				} else {
					return 2;
				}
			}
			
			return 3;
		
	}
}
