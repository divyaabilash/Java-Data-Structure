package linkedList;

class links{
	int data;
	public links left;
	public links right;
	public links(int a ){
		data = a;
	}
	public void display(){
		System.out.println(data);
	}
	
}

class DoublyLinkedList{
	links first;
	links last;
	
//	initialing constructor
	public DoublyLinkedList(){
		first = null;
	}
	
	public void insertfirst(int a){
		links l1 = new links(a);
		links current;
		if(first == null){
			first = l1;
		}else{
		current = first;
		l1.right = first;
		current.left = l1;
		first = l1;
		first.left = null;
		}
	}
	
	public void insertback(int a){
		links l1 = new links(a);
		links current= first,previous = null;
		while(current != null){
			previous = current;
			current = current.right;
		}
		previous.right = l1;
		l1.left=previous;
		last = l1;
	}
	
	public void displayforward(){
		links current = first;
		while(current != null){
			current.display();
			current= current.right;
		}
	}
	
	public void displaybackwards(){
		links current= last;
		while(current != null){
			current.display();
			current = current.left;		
		}
	}
	public void deletefirst(){
		first=first.right;
		first.left= null;
		
	}
	
	public void deleteLast(){
		last = last.left;
		last.right= null;
	}
	public void insertAfter(int a, int b){
		links current = first; 
		boolean found = false;
		while(current != null && !found){
			if(current.data == a){
				links l1 = new links(b);
				l1.right = current.right;
				current.right= l1;
				l1.left=current;
				found = true;
			}
			current = current.right;
		}
		if(found == false){
			System.out.println("Sorry the data to insert before is not found!");
		}
	}
	
	
	public void insertBefore(int a , int b){
		links current = first,previous = first;
		boolean found = false;
		while(current != null && !found){
			if(current.data == a){
				links l1 = new links(b);
				previous.right = l1;
				l1.left = previous;
				l1.right=current;
				current.left=l1;
				found = true;
			}
			previous = current;
			current = current.right;
		}
	
	
	}
	
}

public class DoublyLinked {
public static void main(String[] args){
	DoublyLinkedList d1 = new DoublyLinkedList();
	d1.insertfirst(10);
	d1.insertfirst(15);
//	d1.displayforward();
	d1.insertback(20);
//	d1.displayforward();
//	d1.displaybackwards();
//	d1.deletefirst();
	d1.deleteLast();
//	d1.displayforward();
	d1.insertAfter(10,12);
	d1.insertBefore(10, 9);
	d1.displayforward();
	
}
}
