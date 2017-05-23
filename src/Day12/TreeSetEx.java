package Day12;
import java.util.NavigableSet;
import java.util.TreeSet;
public class TreeSetEx {
public static void main(String[] args) {
	TreeSet<String>tr=new TreeSet<>();
	tr.add("bne");
	tr.add("tao");
	tr.add("three");
	tr.add("add");
	NavigableSet<String>nav=tr.headSet("bne",true);
	NavigableSet<String>nav1=tr.tailSet("add",true);
	System.out.println(nav);
	System.out.println(nav1);
}
}
