package Day7;

public class javaLangObject {
	int i;
	int j;
public javaLangObject(){
	
}
public javaLangObject(int i,int j){
	this.i=i;
	this.j=j;
}
@Override
	public String toString() {
		
		return i+""+j;
	}
public static void main(String[] args) {
	javaLangObject je=new javaLangObject();
	javaLangObject je1=new javaLangObject(12,32);
	je.toString();
	Class cls=je.getClass();
	Class cls1=javaLangObject.class;
	//System.out.println(cls);
	//System.out.println(cls1);
	System.out.println(je1);
}
}
