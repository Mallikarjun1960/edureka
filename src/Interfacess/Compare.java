package Interfacess;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compare implements Comparator<T> {
	int rollno;  
	String name;  
	int age;  
	Compare(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;
	}
	public void hello() {
		
		
		
	
	ArrayList<Compare> al=new ArrayList<Compare>();  
	al.add(new Compare(101,"Vijay",23));  
	al.add(new Compare(106,"Ajay",27));  
	al.add(new Compare(105,"Jai",21)); 
	Collections.sort(al);  
	}
	public int compareq(Compare s1,Compare s2){  
		if(s1.age==s2.age)  
		return 0;  
		else if(s1.age>s2.age)  
		return 1;  
		else  
		return -1;  
		}  
}
