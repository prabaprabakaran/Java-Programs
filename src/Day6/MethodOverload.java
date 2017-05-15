package Day6;

public class MethodOverload {
public void add(int i,int j){
	System.out.println(i*j);

}
//Retutn type must not be overload
public  void add(long d,long c){
	System.out.println(d+" "+c);
	
}
public static void main(String[] args) {
	MethodOverload me=new MethodOverload();
	me.add(10, 20);

}
//can overload main method?
//yes,jvm calls main() which receives string array as arguments only
//public static void main(String[] args){System.out.println("main with String[]");} correct// 
public static void main(String args){
	System.out.println("main with String");
}  
public static void main(){
	System.out.println("main without args");
}  
} 
