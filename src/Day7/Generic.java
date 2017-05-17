package Day7;
//using class generic
public class Generic<P,G,R> {
public Generic(){
	
}
public R getId(P p,G g){
	System.out.println(p+" "+g);
	return null;
}
public static void main(String[] args) {
	Generic<Double,Double,Integer>ge=new Generic<Double,Double,Integer>();
	ge.getId(10.3,20.3);

}
}

