package Day8;

public class ArrayCopy {
public static void main(String[] args) {
	int a[]={2,3,4,5};
	int b[]={7,8,9,11};
	System.arraycopy(a, 0, b,0,a.length);
	for(int i=0;i<a.length;i++){
		System.out.println(b[i]);
	}
}
}
