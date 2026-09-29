package demo;
import java.util.*;

public class HashMapMethods {
public static void main(String[] args) {
	HashMap hs=new HashMap();
	hs.put(101,"apple");
	hs.put(222,"ball");
	hs.put(55,"cat");
	hs.put(33,"dog");
	hs.put(1,"egg");
	hs.put(456,"fish");
	System.out.println("HashMap values are : "+hs);
	System.out.println("222 key is present : "+hs.containsKey(222));
	System.out.println("Cat value is present : "+hs.containsValue("cat"));
	System.out.println("HashMap is Empty : "+hs.isEmpty());
	System.out.println("Size of HashMap : "+hs.size());
	hs.putIfAbsent(54,"goat");
	System.out.println("HashMap values are : "+hs);
	hs.remove(1);
	System.out.println("After removing 1 key from HashMap : "+hs);
	hs.remove(55,"cat");
	System.out.println(hs);
	hs.replace(222,"bat");
	System.out.println("After replacing ball with bat : "+hs);
	hs.replace(101,"apple","ant");
	System.out.println("After replacing apple with ant : "+hs);
	hs.clear();
	System.out.println("After clear() the HashMap :"+hs);
}
}
/*Expected Output: 
HashMap values are : {33=dog, 1=egg, 101=apple, 55=cat, 456=fish, 222=ball}
222 key is present : true
Cat value is present : true
HashMap is Empty : false
Size of HashMap : 6
HashMap values are : {33=dog, 1=egg, 101=apple, 54=goat, 55=cat, 456=fish, 222=ball}
After removing 1 key from HashMap : {33=dog, 101=apple, 54=goat, 55=cat, 456=fish, 222=ball}
{33=dog, 101=apple, 54=goat, 456=fish, 222=ball}
After replacing ball with bat : {33=dog, 101=apple, 54=goat, 456=fish, 222=bat}
After replacing apple with ant : {33=dog, 101=ant, 54=goat, 456=fish, 222=bat}
After clear() the HashMap :{}
*/
