package Interfacess;

import java.util.Comparator;

public class CompareExample implements Comparator<T> {

	@override
	public int compare(Compare o1, Compare o2) {
		if(o1.age==o2.age) {
			return 0;
		}
		else if(o1.age>o2.age) {
			return 1;
		}
		else
			return -1;
	}


	}


