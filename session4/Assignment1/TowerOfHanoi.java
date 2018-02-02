import java.util.ArrayList;
import java.util.List;

class TowerOfHanoi
{	
	List<String> list = new ArrayList<String>();	//creating Array list of string
    
	    public static void main(String args[])
	    {
	        int n = 3;
	        Assignment1 assign = new Assignment1();//creating the object of class assignment
			List<String> list = assign.towerOfHanoi(n,'A', 'C', 'B');//initializing the function with 'no of disk' and 'from' 'to' and 'aux' rod
	        
			//printing the items available in the list array
			for(int counter=0; counter < list.size(); counter++){
				System.out.println(list.get(counter));
			}
	    }
		
	
	List<String> towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod)
    {
        if (n == 1)//case when we reach the last disk in recursion 
        {
        	list.add("Move disk 1 from rod " + from_rod + " to rod " + to_rod);//print the message with the variable containing the latest value.
            return list;
        }
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);//passing aux rod to 'to(destination)' rod and 'to(destination)' to aux rod 
        list.add("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
        return list;
    }
     
}
