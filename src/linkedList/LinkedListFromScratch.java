package linkedList;

class Link{
	private int data;
//	making default for next to be null
	public Link next;
//	constructor
	public Link(int a){
		data = a;
	}
//	method to display data 
	public void displayLink(){
		System.out.println(data);
	}
	
//	method to return the stored data
	public int returndata(){
		return data;
	}
}

class LinkedList{
	public Link first;
//	constructor
	public LinkedList(){
		first = null;
	}
//	method to insert data at the end of the linked list
//	first time if the first element is null, it inserts first element
//	else it iterates till the end and inserts the data
	public void insert(int a){
		Link l2 = new Link(a);
		
		if(first == null){
		l2.next = first;
		first = l2;
		}else{
			Link current=first;
			while(current.next!= null){
				current=current.next;
			}
			current.next = l2;
		}
	}
	
//	method to display the elements of the linked list
	public void display(){
		Link current= first;
//		Iterates till the end of all elements. at the end, it points to the null and iteration of loop stops
		while(current != null){
			current.displayLink();
			current = current.next;
		}
	}
	
	
//	method to find a particular key
	public Link find(int a){
		Link current= first;
//		iterates till the end of the linkedlist. if the value is equal it returns the current value.
//		else it moves to the next element of the link. if its not found in the list, it returns null
		while(current!= null){
			if(current.returndata() == a){
				return current;
			}
			current = current.next;
		}	
		return null;
	}
	
//	method to delete the element in the linked list
	public void delete(int a){
//		Link temp;
		Link pervious=first;
		Link current=first;
		while(current != null){
			if(first.returndata() ==a){
				first = first.next;
			}else if(current.returndata() == a){
//				point the previous data to current next pointer. so the data reference deleted from the list. 
				pervious.next = current.next;
				
			}
			pervious = current;
			current = current.next;
		}
	}
	
	
//	insertfirst allows us to insert the element at the begin of the list (used in double ended linked list where insertion can be 
//	done on the both the ends of the list)
	public void insertfirst(int a){
		Link l3 = new Link(a);
		l3.next = first;
		first = l3;
	}
}


public class LinkedListFromScratch {

	public static void main(String[] args){
		LinkedList l1 = new LinkedList();
		l1.insert(5);
		l1.insert(15);
		l1.insert(35);
		l1.display();
		Link f1 = l1.find(10);
//		checks its null or it contains the data
		if(f1 == null){
			System.out.println("The element is not found!");
		}else{
			System.out.println("The element is found hurray"+f1.returndata());
		}
		
		Link f2 = l1.find(15);
//		checks its null or it contains the data
		if(f2 == null){
			System.out.println("The element is not found!");
		}else{
			System.out.println("The element is found hurray "+f2.returndata());
		}
		l1.delete(5);
		l1.display();
		l1.delete(10);
		l1.insert(10);
		l1.insertfirst(20);
		l1.display();
	}
	
}
