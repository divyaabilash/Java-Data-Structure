package stacksandqueues;

class queue{
	int Size;
	int front;
	int rear;
	long[] Q;
	
	public queue(int size){
		Size=size-1;
		Q=new long[size];
		front=-1;
		rear=-1;
	}
	
	public void insert(long data){
		if(rear <Size){
		Q[++rear]=data;
		}else{
			System.out.println("The Queue is Full");
		}
		if(front==-1){
			front =0;
		}
	}
	
	public long remove(){
		if(front <= Size){
			return Q[front++];
			}else{
			System.out.println("The Queue is Empty");
			}
			return 0;
	}
	
	public boolean isEmpty(){
		if(rear<0 || front<0){
			return true;
		}
		return false;
	}

	
	public long getFirst(){
		if(front <= Size){
			return Q[front++];
			}else{
			System.out.println("The Queue is Empty");
			}
			return 0;
	}
	
	public long getLast(){
		if(rear>-1 && rear>=front ){
		return Q[rear--];
		}else{
			System.out.println("The Queue is Empty");
		}
		return 0;
	}
}



public class QueueApp {
	
public static void main(String[] args){
	queue Q=new queue(4);
	Q.insert(1);
	Q.insert(12);
	Q.insert(10);
	Q.insert(10);
	Q.insert(10);
	System.out.println(Q.getFirst());
	
	System.out.println(Q.remove());
	System.out.println(Q.remove());
	System.out.println(Q.getLast());
	System.out.println(Q.getLast());
}
}
