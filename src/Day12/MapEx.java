package Day12;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx {
public static void main(String[] args) {
	Map<String, Integer>ma=new HashMap<>();
	ma.put("one",12);
	ma.put("two",121);
	ma.put("three",122);
	ma.put("one",12);
	System.out.println(ma);
	Set<String>se=ma.keySet();
	Collection<Integer>col=ma.values();
	System.out.println(col);
	Integer val=ma.get("two");
	System.out.println(val);
}
}
