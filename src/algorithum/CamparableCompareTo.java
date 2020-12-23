package algorithum;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CamparableCompareTo implements Comparable<CamparableCompareTo>{
	
	int age;
	String name;
	
	public CamparableCompareTo(int aa,String bb){
		
	}
	public static void main(String[] args) {
		CamparableCompareTo x=new CamparableCompareTo(21, "Sangu");
		CamparableCompareTo y=new CamparableCompareTo(31,"khana");
		ArrayList< CamparableCompareTo>al=new ArrayList<>();
		al.add(x);
		al.add(y);
		Collections.sort(al);	
		System.out.println(al);
		}
	@Override
	public int compareTo(CamparableCompareTo o) {
		
		if(this.age>o.age) {
			return 1;
		} else if(this.age<o.age) {
			return -1;
		}else
		return 0;
	}

}
