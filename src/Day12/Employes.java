package Day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employes {
    private int number;
     private String work;
	 private double salary; 
public Employes(int number,String work,double salary ){
	this.number=number;
	this.work=work;
	this.salary=salary;
}

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public String getWork() {
	return work;
}

public void setWork(String work) {
	this.work = work;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}
public String toString(){
	return String.format(number+" "+" "+salary+" "+work);
}
}
