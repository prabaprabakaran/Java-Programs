import org.omg.Messaging.SyncScopeHelper;

class aggre{
	String name;
	int id;
	public aggre(String name,int id){
		this.name=name;
		this.id=id;
	}
	
}
class aggres{
	String add;
	aggre as;
public aggres(String add,aggre as){
	this.add=add;
	this.as=as;
}
	
}
public class example {
public static void main(String[] args) {
	aggre s1=new aggre("name",12);
aggres sw=new aggres("ass",s1);
System.out.println(sw.as.id);
System.out.println(sw.as.name);
System.out.println(sw.add);
}
}
