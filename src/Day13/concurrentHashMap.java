package Day13;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class concurrentHashMap {
public static void main(String[] args) {
	ConcurrentHashMap<String,Integer>map=new ConcurrentHashMap<String,Integer>();
	map.put("one",1);
	map.put("two",2);
	map.put("three",3);
	System.out.println(map);
	Iterator<String>itr=map.keySet().iterator();
	Collection<Integer>col=map.values();
	Iterator<Integer>in=col.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next()+" "+in.next());
		
		in.remove();
}
	System.out.println(map);
}
}
