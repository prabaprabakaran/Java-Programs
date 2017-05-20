package Day8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RefMain {
public static void main(String[] args) {
	try {
		Class cls=Class.forName("Day8.ReflextionApi");
		Constructor con[]=cls.getDeclaredConstructors();
		for (int i = 0; i < con.length; i++) {
			System.out.println(con[i]);
		}
		ReflextionApi rp=(ReflextionApi) con[1].newInstance("praba",12);
		System.out.println(rp.hashCode());
		Field fs[]=cls.getDeclaredFields();
		for (int i = 0; i < fs.length; i++) {
			System.out.println(fs[i]);
		}
		Method me[]=cls.getDeclaredMethods();
		for (int i = 0; i < me.length; i++) {
			if(me[i].getName().indexOf("getId")!=-1){
				me[i].setAccessible(true);
				me[i].invoke(rp);
			}
		}
		System.out.println("gowtham="+me[1].invoke(rp));
	} catch (Exception e) {
		e.printStackTrace();
	}
 }
}
