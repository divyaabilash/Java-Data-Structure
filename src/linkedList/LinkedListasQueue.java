package linkedList;

class linked{
	int data;
	public linked next;
	public linked(int a){
		data = a;
	}
	public void display(){
		System.out.println(data);
	}
}

class Queue{
	linked first;
	int maxSize = 20,filledSize;
public Queue(){
	first = null;
	filledSize =0;
}
public void enqueue(int a){
	if(filledSize < maxSize){
	linked l1= new linked(a);
	l1.next=first;
	first = l1;
	filledSize++;
	}else{
		System.out.println("Queue overflow");
	}
}
public int dequeue(){
	linked out;
	out = first;
	first = first.next;
	return out.data;
}

public void display(){
	linked current=first;
	while(current !=null){
		current.display();
		current = current.next;
	}
}

public boolean isEmpty(){
	if(first == null){
		return true;
	}
	return false;
}

}

public class LinkedListasQueue {
public static void main(String[] args){
	Queue q1 = new Queue();
	q1.enqueue(10);
	q1.enqueue(19);
	q1.display();
	System.out.println("The dequeued is "+q1.dequeue());
	System.out.println(q1.isEmpty());
}
}
