package array;

public class HighArrayApp {

	public static void main(String[] args) {
		int i,size = 16;
		HighArray h;
		h=new HighArray(size);
		for(i=0;i<10;i++){
			h.insert(i);
		}
		h.insert(20);
		h.insert(10);
		h.insert(20);
		h.insert(10);
		h.insert(20);
		h.insert(10);
		for(int j=0;j<size;j++){
			System.out.println(h.Find_Value(j));	
		}
		System.out.println(h.search(20));
		System.out.println("first length is "+h.FindLength());
		h.noduplicate();
		System.out.println(h.FindLength());
		
//	System.out.println("max is "+h.getMax());
//	System.out.println("max is "+h.getMaxdelete());
//	System.out.println("finallength is "+h.FindLength());
//	System.out.println("max after delete "+h.getMax());
	
	}

}
