package linkedList;

class SortList{
	linked first;
	public SortList(){
		first = null;
	}
	
	public void insert(int a){
		linked current = first, previous= null;
		linked l1 = new linked(a);
		while(current != null && a > current.data){
			previous = current;
			current = current.next;
		}
		if(previous == null){
			first = l1;
		}else{
			previous.next = l1;
		}
		l1.next=current;
		
	}
	
	public void display(){
		linked current = first;
		while(current != null){
			current.display();
			current  = current.next;
		}
	}
	
	public void delete(int a){
		linked current =first, previous = null;
		boolean found = false;
		while(current!= null && !found){
			if(a == current.data){
				found = true;
				break;
			}
			previous = current;
			current = current.next; 
		}
		if(previous != null && !found){
			System.out.println("The data is not found");
		}else{
		previous.next = current.next;
		}
	}
	
	
}

public class SortedList {
public static void main(String[] args){
	SortList s = new SortList();
	s.insert(10);
	s.insert(20);
	s.insert(1);
	s.insert(12);
	s.delete(10);
	s.delete(8);
	s.display();
}
}
