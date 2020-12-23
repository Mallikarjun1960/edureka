package algorithum;

public class SubString {

	public static void main(String[] args) {
		
		StringBuffer as=new StringBuffer("hello");
		System.out.println(as.hashCode());
		as.append("hi");
		System.out.println(as.hashCode());
		String a="hi]";
		System.out.println(a.hashCode());
		a=a+"hellodd";
		System.out.println(a.hashCode());
		
		
	

	}

}
