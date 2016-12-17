package stacksandqueues;
import java.util.*;

public class QueuesusingJavaInBuilt {
public static void main(String[] args){
	Queue q=new LinkedList();
	q.add("hello");
	q.add(1);
	while(!q.isEmpty()){
	System.out.println(q.remove());
	}
}
}
