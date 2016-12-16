package array;

import java.util.Scanner;

public class FindNumberWithLeastSteps {

	public static void main(String[] args) {
		int s=0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the minimum value for range");
		int minrange = sc.nextInt();
		System.out.println("eneter the maximum value for the range");
		int maxrange = sc.nextInt();
		System.out.println("Thking the value");
		while (s!=3){
		int value = findnextrange(minrange,maxrange);
		System.out.println("is it the value:"+value);
		System.out.println("press 1:too low, 2:too high 3:correct");
		s= sc.nextInt();
		if(maxrange-minrange == 1){
			if(s == 1){
				minrange = maxrange;
			}else if(s == 2){
				maxrange = minrange;
			}
		}else if(minrange == maxrange){
			System.out.println("your are tinking some other number which is out of range");
			s =3;
			break;
		}else if(s==1){
			minrange=value;
		}else if(s==2){
			maxrange = value;
		}
		}
	}

	private static int findnextrange(int minrange, int maxrange) {
		// TODO Auto-generated method stub	
		return (int) Math.floor((minrange+maxrange)/2);
	}

}
