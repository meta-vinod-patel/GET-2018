package first_project;

public class Assignment6{
	
	//Debugging
	/*	public static void main(String[] arg){
		int[] x = new int[]{2,4,5,7,8};
		int[] y = new int[]{1,3,6,9,10};
		int[] z = new int[10];

		z = join(x,5,y,5,z);
		
		for(int i=0;i<10;i++)
			System.out.println(z[i]);
	}*/
	
	int[] join(int a[], int asize, int b[], int bsize, int c[]){
		
		
		int i = 0, j = 0, k = 0;
	     
        // Traverse both array
        while (i<asize && j <bsize)
        {
            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise do same with second array
            if (a[i] < b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }
     
        // Store remaining elements of first array
        while (i < asize)
            c[k++] = a[i++];
     
        // Store remaining elements of second array
        while (j < bsize)
            c[k++] = b[j++];
        
        return c;
		
	}
}