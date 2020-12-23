
public class EqualsMethode {
	public final String af="jfk"; 

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		
		//String f2=af;//we cant assighn even reference to other string
		//System.out.println(f2);
		String a="abc";
		String b=new String("abc");
		
		String c="abc";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		if(a==b) {
			System.out.println("yse");
		}
		if(a.equals(b)) {
			System.out.println("yeseeee");
		}

	}

}
