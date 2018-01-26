/*
*
*
*	@author Vinod Patel
*
*/
public class Assignment4{
	
	//To Debug the funtion
	/*	public static void main(String[] arg){
			int[] Arrival_time = new int[]{1,5,9,25};
			int[] Job_size     = new int[]{12,7,2,5};
			int[][] resultArray2 = new int[Arrival_time.length][Job_size.length];
			resultArray2 = FCFS(Arrival_time,Job_size);
	
			for(int i = 0 ;i < 4 ; i++){
				for(int j = 0 ;j < 4 ; j++){
					System.out.println(resultArray2[i][j]);
				}
			}
			
		}*/
	
	int[][] FCFS( int arrival_time[], int job_size[] ){
		
		
		//this is test return
		int resultArray[][] = new int[arrival_time.length][4];
		for(int i=0;i<arrival_time.length;i++){
			if(i==0){
				//initializing the resultarray;
				resultArray[0][0] = 1;
				resultArray[0][1] = 0;	
				resultArray[0][2] = 1;
				resultArray[0][3] = job_size[0];
			}else{
				//finding arrival time 
				resultArray[i][0] = arrival_time[i];

				//finding waiting time
				if(resultArray[i-1][3]>resultArray[i][0]){
					resultArray[i][1] = resultArray[i-1][3] - resultArray[i][0] + 1; 
				}else{
					resultArray[i][1] = 0 ;
				}
				
				//finding job start
				if(resultArray[i-1][3]>resultArray[i][0]){
					resultArray[i][2] = resultArray[i-1][3] + 1;
				}else{
					resultArray[i][2] = resultArray[i][0]; 
				}
				
				//finding ending time
				resultArray[i][3] = resultArray[i][2] + job_size[i] - 1; 
			}
		}
		
		return resultArray;
	}
}
