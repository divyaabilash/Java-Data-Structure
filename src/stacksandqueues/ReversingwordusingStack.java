package stacksandqueues;

class WordStack{
	int top=-1;
	String data;
	char[] word;
	
//	constructor
	public WordStack(String words){
		data=words;
		word=new char[words.length()];
	}
	
//	function to reverse the string 
	public String reverse(){
		splitWord(data);
		data="";
		while(!isEmpty()){
			data=data+wordpop();
		}
		return data;
	}
	
//	push function of stack
	public void WordPush(char data){
		word[++top]=data;
	}
	
//	pop function of the stack
	public char wordpop(){
		return word[top--];
	}
	
//	function to check is stack is empty
	public boolean isEmpty(){
		if(top<0){
			return true;
		}
		return false;
	}
	
//	function to split the word into character
	public void splitWord(String data){
		for(int i=0;i<data.length();i++){
			char letter= data.charAt(i);
			WordPush(letter);
		}		
	}
	
}


public class ReversingwordusingStack {

	public static void main(String[] args){
//		string to reverse -- static data
		String data="Hello1234!";
//		new object of class WordStack
		WordStack s=new WordStack(data);
//		function to reverse the data.
		data=s.reverse();
		
		System.out.println(data);
		
	}
	
	
}
