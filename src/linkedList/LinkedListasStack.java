package linkedList;

class Linker {
	int data;
	public Linker next;

	public Linker(int a) {
		data = a;
	}

	public void display() {
		System.out.println(data);
	}
}

class Stack {
	Linker first;
	int size = 20, insertedsize;

	public Stack() {
		first = null;
		insertedsize = 0;
	}

	public void push(int a) {
		if (insertedsize < size) {
			Linker l1 = new Linker(a);
			l1.next = first;
			first = l1;
			insertedsize++;
		} else {
			System.out.println("The Stack is overflowing");
		}
	}

	public int pop() {
		if (insertedsize > 0) {
			Linker l1,current = first,pervious = first;
			while(current.next !=null){
				pervious = current;
				current = current.next;
				
			}
			l1 = current;
			pervious.next = null;
			return l1.data;
		} else {
			return 0;
		}
	}

	public boolean isEmpty() {
		if (first == null) {
			return true;
		}
		return false;
	}

	public void display() {
		Linker current = first;
		while (current != null) {
			current.display();
			current = current.next;
		}
	}
}

public class LinkedListasStack {
	public static void main(String[] args) {
		Stack s = new Stack();
		for (int j = 0; j < 22; j++) {
			s.push(j);
		}
		s.display();
		
//		s.display();
		System.out.println("poped data"+s.pop());
		System.out.println("poped data"+s.pop());
		if (s.isEmpty()) {
			System.out.println("The stack is empty");
		} else {
			System.out.println("The stack is not empty");
		}

	}
}
