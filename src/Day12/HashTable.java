package Day12;

import java.util.Hashtable;

public class HashTable {
public static void main(String[] args) {
	Hashtable<String,Integer>hash=new Hashtable<String,Integer>();
	hash.put("mathi",3);
	hash.put("praba",2);
	hash.put("kumar",3);
	int i=hash.get("mathi");
	System.out.println(i);
}
}
