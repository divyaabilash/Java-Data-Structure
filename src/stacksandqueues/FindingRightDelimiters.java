/*delimiter-matching program works by reading characters from the string one at
a time and placing opening delimiters when it finds them, on a stack. When it reads
a closing delimiter from the input, it pops the opening delimiter from the top of the
stack and attempts to match it with the closing delimiter. If they’re not the same
type (there’s an opening brace but a closing parenthesis, for example), an error
occurs. Also, if there is no opening delimiter on the stack to match a closing one, or
if a delimiter has not been matched, an error occurs. */

package stacksandqueues;
import java.util.*;

public class FindingRightDelimiters {

	public static void main(String[] args){
		String s="{a[b(c)D]e}";
		boolean notfound= false;
		int pos=0;
		Stack s1= new Stack();
		for(int i=0;i<s.length();i++){
			
			char c = s.charAt(i);
			switch(c){
			case '{':
			case '[':
			case '(':
			s1.push(c);
			break;
			case '}':
			case ']':
			case ')':
			if(!s1.isEmpty()){
			char r = (char) s1.pop();
//			System.out.println(r);
			if(!notfound){
			if(((c=='}' && r =='{')||
					(c==']' && r =='[')||
					(c==')' && r =='('))){
//				System.out.println("Match found");
			}else{
				pos=i;
				notfound = true;
				
			}
			}
			}else{
				notfound=true;
				pos=i;
			}
			break;
			default:
				break;
			}	
			}
		if(!s1.isEmpty()){
			System.out.println("Error:Missing right delimiters");
		}else if(notfound==true){
			System.out.println("There is delimiter missmatch at position:"+pos);
		}else{
			System.out.println("All delimiters are matching! hooray");
		}
	}
}
