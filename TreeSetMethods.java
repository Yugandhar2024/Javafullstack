package treeSet;
import java.util.*;
public class TreeSetMethods {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		System.out.print("Using iterator: ");
		Iterator<Integer> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		System.out.println(ts);
		System.out.println("FirstElement :"+ts.first());
		System.out.println("LastElement : "+ts.last());
		System.out.println("Ceiling(30) : "+ts.ceiling(30));
		System.out.println("Tailset(20) : "+ts.tailSet(20));
		System.out.println("Subset(20,40) : "+ts.subSet(20,40));
		System.out.println("Descending Set : "+ts.descendingSet());
		ts.remove(20);
		System.out.println("After removing 20: " + ts);
		System.out.println("PollFirst() : " + ts.pollFirst());
		System.out.println("After pollFirst: " + ts);
		System.out.println("PollLast() : " + ts.pollLast());
		System.out.println("After pollLast: " + ts);
		System.out.println("Treeset is empty : "+ts.isEmpty());	
		ts.clear();
		System.out.println("After clear(): " + ts);
	}
}
/*Expected Output:
Using iterator: 10 20 30 40 50 
[10, 20, 30, 40, 50]
FirstElement :10
LastElement : 50
Ceiling(30) : 30
Tailset(20) : [20, 30, 40, 50]
Subset(20,40) : [20, 30]
Descending Set : [50, 40, 30, 20, 10]
After removing 20: [10, 30, 40, 50]
PollFirst() : 10
After pollFirst: [30, 40, 50]
PollLast() : 50
After pollLast: [30, 40]
Treeset is empty : false
After clear(): []
*/
