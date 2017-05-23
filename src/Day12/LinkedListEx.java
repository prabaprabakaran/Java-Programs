package Day12;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
public static void main(String[] args) {
	LinkedList<String>li=new LinkedList<>();
	li.add("one");
	li.add("two");
	li.add("three");
	li.peekFirst();
	li.peekLast();
	Iterator<String>it=li.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	
}
}
