package array;
import java.*;
public class HighArray {
	int[] array_To_Create;
	int array_size,insertedpos =0;
public HighArray(int size){
	array_To_Create = new int[size];
	array_size=size;
}

public int FindLength(){
	return array_size;
}

public void insert(int value){
	array_To_Create[insertedpos]=value;
	insertedpos++;
}

public int Find_Value(int index){
	return array_To_Create[index];
}

public boolean search(int value){
	for(int i=0;i<array_To_Create.length;i++){
		if(array_To_Create[i]== value){
			return true;
		}
	}
	return false;
}
// find the largest number and return it.
public long getMax(){
	int greater=0;
	if(array_To_Create.length ==0){
		return -1;
	}
	for(int i=0; i<array_To_Create.length;i++){
		if(greater < array_To_Create[i]){
			greater = array_To_Create[i];
		}
	}
	return greater;
}
// find the largest number and return the value and delete it from array
public long getMaxdelete(){
	int greater=0;
	int index=0;
	if(array_To_Create.length ==0){
		return -1;
	}
	for(int i=0; i<array_To_Create.length;i++){
		if(greater < array_To_Create[i]){
			greater = array_To_Create[i];
			index=i;
		}
	}
	
for(int i=index;i<array_To_Create.length-1;i++){
	array_To_Create[i]=array_To_Create[i+1];
	array_size--;
	}
	
	return greater;
}


public void noduplicate(){
	for(int i=0;i<array_To_Create.length;i++){
		for(int j=0;j<i;j++){
			if(array_To_Create[i]== array_To_Create[j]){
				for(int k=j;k<array_To_Create.length-1;k++){
					array_To_Create[k]= array_To_Create[k+1];
				}
				array_size--;
			}
		}
	}
}

}
	
