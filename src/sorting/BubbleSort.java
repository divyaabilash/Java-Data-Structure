package sorting;

public class BubbleSort {
	
	public void Approch1(){
		int [] to_Sort ={53,50,51,58,65,63,35};
		for(int i=0;i<to_Sort.length;i++){
			for(int j=0;j<to_Sort.length-1;j++){
				if(to_Sort[j]>to_Sort[j+1]){
					int temp = to_Sort[j];
					to_Sort[j]=to_Sort[j+1];
					to_Sort[j+1]=temp;
				}
				System.out.println();
				System.out.println("j "+j);
				for(int k=0;k<to_Sort.length;k++){
				System.out.print(" "+to_Sort[k]);
				}
			}
			System.out.println();
			System.out.println("i "+i);
			for(int k=0;k<to_Sort.length;k++){
				System.out.print(" "+to_Sort[k]);
				}
		}
		System.out.println("Final sorted values");
		System.out.println();
		for(int k=0;k<to_Sort.length;k++){
			System.out.print(" "+to_Sort[k]);
			}
	}
	
	
	public void Approach2(){
		int [] to_Sort ={53,50,51,58,65,63,35};
//		bubbled the largest element to last and then do bubble sort for the rest of elements except for the last one.
		
		for(int i=to_Sort.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(to_Sort[j]>to_Sort[j+1]){
					int temp = to_Sort[j];
					to_Sort[j]=to_Sort[j+1];
					to_Sort[j+1]=temp;
				}
				System.out.println();
				System.out.println("j "+j);
				for(int k=0;k<to_Sort.length;k++){
				System.out.print(" "+to_Sort[k]);
				}
			}
			System.out.println();
			System.out.println("i "+i);
			for(int k=0;k<to_Sort.length;k++){
				System.out.print(" "+to_Sort[k]);
				}
		}
		System.out.println("Final sorted values");
		System.out.println();
		for(int k=0;k<to_Sort.length;k++){
			System.out.print(" "+to_Sort[k]);
			}
	}
	
public static void main(String[] args){
	BubbleSort b = new BubbleSort();
//	b.Approch1();
	b.Approach2();
}
}
