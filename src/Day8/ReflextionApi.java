package Day8;

public class ReflextionApi {
	int id;
	String name;
	public ReflextionApi(){
		System.out.println("empty arg");
	}
	public ReflextionApi (String name,int i) {
		this.name=name;
		this.id=id;
		
	}
private int getId() {
	System.out.println("hi");
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

