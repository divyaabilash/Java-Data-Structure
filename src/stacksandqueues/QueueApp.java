package stacksandqueues;

class queue{
	int Size;
	int front;
	int rear;
	long[] Q;
//	construcutor
	public queue(int size){
		Size=size-1;
		Q=new long[size];
		front=-1;
		rear=-1;
	}

//	insertion of the data to the rear
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
	
//	removing from the front
	public long remove(){
		if(front <= Size){
			return Q[front++];
			}else{
			System.out.println("The Queue is Empty");
			}
			return 0;
	}
	
//	check is Queue empty
	public boolean isEmpty(){
		if(rear<0 || front<0){
			return true;
		}
		return false;
	}

//	removing first element of the 
	public long getFirst(){
		if(front <= Size && front<=rear){
			return Q[front++];
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
	System.out.println(Q.getFirst());
	System.out.println(Q.getFirst());
}
}
