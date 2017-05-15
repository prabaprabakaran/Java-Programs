package exercise;
class aggre{
	double s=1.2;
	public int oper(int i){
		return i*i;
		
	}
}
class Aggrecation{
	aggre ag=new aggre();;
	double pi=3.14;
	double area(int radius){

		int se=ag.oper(radius);
		return pi*se;
		
	}


public static void main(String[] args) {
	Aggrecation n=new Aggrecation();
	double result=n.area(5);
	System.out.println(result);
}
}
