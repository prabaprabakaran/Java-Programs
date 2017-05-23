package Day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpMain {


public static void main(String[] args) {
	Employes emp1=new Employes(1,"amazon",5342.2);
	Employes emp2=new Employes(2,"ebay",4321.3);	
	Employes emp3=new Employes(3,"olx",2234.5);	
	Employes emp4=new Employes(4,"flipkart",3322.6);
	Employes[] empl={emp1, emp2, emp3,emp4};
	List<Employes> li=new ArrayList<Employes>(Arrays.asList(empl));
	System.out.println(li);
	Comparator<Employes>com=new Comparator<Employes>() {

		@Override
		public int compare(Employes o1, Employes o2) {
		
			return Double.compare(o2.getSalary(),o1.getSalary());
		}
	};
	
	Collections.sort(li,com);
	System.out.println(li);

}

}
