package stacksandqueues;

class stack{
	int[] stack;
	int top,size;
	public stack(int s){
		stack=new int[s];
		size=s;
		top=-1;
	}
	
	public void push(int data){
		
		int index=++top;
		if(index<size){
		stack[index]=data;
		}else{
			System.out.println("The Stack is full");
		}
	}
	
	public int pop(){
		return stack[top--];
	}
	
	public int stackTop(){
		return stack[top];
	}
	
	public int getSize(){
		return stack.length;
	}
	
}



public class StacksApp {
	
	public static void main(String[] args){
stack s=new stack(10);
//System.out.println(s.getSize());
s.push(10);
s.push(23);
s.push(45);
System.out.println(s.getSize());
System.out.println(s.pop());
System.out.println(s.pop());
System.out.println(s.pop());
	}
}
