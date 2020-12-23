import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class CollectionExample {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>(); list.add("hello");
		
		list.add("hello4");
		list.add("hello3");
		list.add("hello2");
		list.add("hello5");
		
		System.out.println(list);
		 Iterator<String>itr=list.iterator(); while(itr.hasNext())
		{
			String a = itr.next();
			/* System.out.println(a) */; } 
		 ListIterator<String>lit=list.listIterator();
		 while(lit.hasNext()) {
			// aa=lit.previous();
			// System.out.println(aa);
			/*
			 * String b= lit.previous(); System.out.println(b);
			 */
			 if(1==1) {
				 break;
			 }
			 break;
		 }
	
		 linkedList(list);
		 setExample();
		

	}
	public static void linkedList(List<String> ll) {
		LinkedList<String>ll1=new LinkedList<String>();
		for(int i=0;i<=ll.size()-1;i++) {
			
		
		ll1.add(ll.get(i));
		
		}
		System.out.println(ll1);
	}
	
	public static void setExample() {
		Set<String>set=new HashSet<String>();
		set.add("hello");
		set.add("hello");
		
		System.out.println(set);
	}

}
