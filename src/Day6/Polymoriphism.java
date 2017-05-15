package Day6;
class bulz{
	public void type(){
		System.out.println("bulz class");
	}
	
}
class cbr extends bulz{
	public void type(){
		System.out.println("cbr class");
	}
}
class fz extends bulz{

	public void type() {
		System.out.println("fz class");
	}
}
public class Polymoriphism {
public static void main(String[] args) {
	Polymoriphism poly=new Polymoriphism();
	bulz bul=new bulz();
	cbr cb=new cbr();
	fz f=new fz();
	poly.type(cb);
	poly.type(bul);
	poly.type(f);
	bulz bu[]={new cbr(),new fz()};
	for(int i=0;i<bu.length;i++){
		bu[i].type();
	}
}
public void type(bulz b){
	System.out.println(b instanceof cbr);
	b.type();
}
}
