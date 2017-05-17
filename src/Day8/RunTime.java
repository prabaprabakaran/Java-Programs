package Day8;

public class RunTime {
public static void main(String[] args) {
	Runtime run=Runtime.getRuntime();
    int processor=run.availableProcessors();
    System.out.println(processor);
	try {
		
	    run.exec("Google Chrome");
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
}
