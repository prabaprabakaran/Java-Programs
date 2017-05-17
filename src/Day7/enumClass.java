package Day7;

public class enumClass {
public enum name{
	PRABA(1),
	KUMAR(2),
	BALA(3);
	public final int code;
	private name(int code){
		this.code=code;
	}
	public int getCode(){
		return code;
		
	}
}
public static void main(String[] args) {
	name na=name.PRABA;
	System.out.println(na.code);
	System.out.println(na.getCode());
	name nas[]=name.values();
	for(int i=0;i<nas.length;i++){
		//System.out.println(nas);
	}
	for(name nas1:name.values()){
		//System.out.println(nas1.ordinal());
	}
	//System.out.println(na.name());
	//System.out.println(na.ordinal());
	
}
}
