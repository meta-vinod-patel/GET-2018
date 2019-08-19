import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class FindPermutation {

    static List<String> resultString = new ArrayList<String>();
    public static void main(String[] args)
    {
        String str = "abc";
        resultString = permuteHelper(str,"");
        
 
        
        //to print the result
        for(int i = 0 ; i < resultString.size(); i++){
        	System.out.println(resultString.get(i));
        }
    }
 
  
    public static List<String> permuteHelper(String str, String choosen) {
    	//base condition to print the final chosen string
    	if(str.equals("")){//this shows there is nothing in our main string
    		resultString.add(choosen);
    	}else{

    		for(int i = 0 ; i<str.length() ; i++ ){
    			//choosing the char at the i position so we can begin our permuted string
    			char c = str.charAt(i);
    			//adding that chosen char in the chosen string, the chosen string is empty at first function calling 
    			choosen+=c;
    			//now we are removing the chosen char from our main char so we can create the combination of rest char
    			//and merge them together
    			str = removeCharAt(str,i);
    			//this function will help us to find the permuted string
    			permuteHelper(str,choosen);
    			
    			//here is main thing
    			//StringBuiler has a built in function/method to insert a char at any position
    			//so here we create a object of SatringBuilder and passes the str to it's constructor
    			StringBuilder testString = new StringBuilder(str);
    			//and we insert the char at i^th index 
    			testString.insert(i,c);
    			//and now we have updated the str from testString.
    			str = testString.toString();
    			//remove the last char from the chosen
    			choosen = removeCharAt(choosen, choosen.length()-1);
    		}
    	}
    	
    	//to remove duplicate values from the ArrayList when we have word like wood/containing more than one same char
        resultString = new ArrayList<String>(new LinkedHashSet<String>(resultString));
    	return resultString;
    }
    
    //function to remove the char at a position
    private static String removeCharAt(String str, int i) {
    	return str.substring(0, i) + str.substring(i + 1);
	}
    
}
