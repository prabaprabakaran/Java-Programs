package Day13;

import java.util.ArrayList;
import java.util.List;


class fruit{
	@Override
	public String toString() {
		return "i am a fruit";
	}
}
class apple extends fruit{
	@Override
	public String toString() {
	
		return "I am apple";
	}
}
class orange extends apple{
	@Override
	public String toString() {
		return "i ama orange";
	}
}
public class coverience {
public static void main(String[] args) {
	List<fruit>app=new ArrayList<fruit>();
//app.add(new apple());

List<? super apple>bas=app;
bas.add(new apple());
bas.add(new orange());

for(Object fu:bas){
	System.out.println(fu);
}
}
}
