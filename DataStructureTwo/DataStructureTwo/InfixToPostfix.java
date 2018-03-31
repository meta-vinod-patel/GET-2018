package DataStructureTwo;
/**
 * 
 * @author Vinod Patel
 *
 */
public class InfixToPostfix {
	
	private String infixExp = "";
	private String postfixExp = "";
	private Stack<String> stack = new Stack<>();
	boolean firstItem = false;

	public InfixToPostfix(String infixExp){
		this.infixExp = infixExp;
	}
	/**
	 * convert Infix Expression to postfix
	 */
	public void infixtopostfix(){
		for(int i = 0 ; i < this.infixExp.length();i++){
			char curChar = infixExp.charAt(i);
			if(!isOperator(curChar)){
				postfixExp = postfixExp + curChar;
				if( infixExp.length()-1 == i ){
					while(!(stack.isEmpty())){
						postfixExp += stack.pop();
					}
				}
			}else{
				if(firstItem){
					if(pMin(curChar) && pMin( stack.peek().charAt(0) )){
						postfixExp += stack.pop();
						stack.push(curChar+"");
                        if(i == (infixExp.length()-1)){
                                while(!stack.isEmpty()){
                                	postfixExp += stack.pop();
                                }
                        }
                }else if(mDiv(curChar) && mDiv( stack.peek().charAt(0) )){
                	postfixExp += stack.pop();
                        stack.push(curChar+"");
                        if(i == (infixExp.length()-1)){
                                while(!stack.isEmpty()){
                                	postfixExp += stack.pop();
                                }
                        }
                }else if(pMin(curChar) && mDiv( stack.peek().charAt(0) )){
                	postfixExp += stack.pop();
                	stack.push(curChar+"");
                        if(i == (infixExp.length()-1)){
                                while(!stack.isEmpty()){
                                	postfixExp += stack.pop();
                                }
                        }
                }else if(mDiv(curChar) && pMin( stack.peek().charAt(0) )){
                	stack.push(curChar+"");
                        if(i == (infixExp.length()-1)){
                                while(!stack.isEmpty()){
                                	postfixExp += stack.pop();
                                }
                        }
                }else{
                	postfixExp += Character.toString(curChar);
                        if(i == (infixExp.length()-1)){
                                while(!stack.isEmpty()){
                                	postfixExp += stack.pop();
                                }
                        }
                }
				}else{
					stack.push(curChar+"");
                    firstItem = true;
				}
			}
		}
	}
	/**
	 * 
	 * @param ch
	 * @return
	 */
	public boolean isOperator(char ch){
		if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param ch
	 * @return
	 */
	public boolean pMin(char ch){
	    switch(ch){
	            case '+':
	                    return true;
	            case '-':
	                        return true;
	                default:
	                        return false;
	        }
	}
	
	/**
	 * 
	 * @param ch
	 * @return
	 */
	public boolean mDiv(char ch){
	        switch(ch){
	                case '*':
	                    return true;
	            case '/':
	                        return true;
	                default:
	                        return false;
	        }
	}
	
	/**
	 * 
	 * @return
	 */
	public String getString(){
		return postfixExp;
	}
}
