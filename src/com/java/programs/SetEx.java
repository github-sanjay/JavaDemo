package com.java.programs;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("Apple");
		hs.add("ball");
		hs.add("Dog");
		hs.add("cat");
		hs.add("dog");
		hs.add(null);
		hs.add("cat");

		Iterator<String> itr1 = hs.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());

		}

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();

		lhs.add("Apple");
		lhs.add("ball");
		lhs.add("Dog");
		lhs.add("cat");
		lhs.add("dog");
		lhs.add(null);
		lhs.add("cat");

		Iterator<String> itr2 = lhs.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());

		}

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Apple");
		ts.add("ball");
		ts.add("Dog");
		ts.add("Cat");
		ts.add("dog");
		// ts.add(null);
		ts.add("cat");
		
		Iterator<String> itr3 = ts.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());

		}
		
		System.out.println("After reverse Sort: ");
		ArrayList<String> al = new ArrayList<String>();
		
		
		
		al.addAll(ts);
		Collections.reverse(al);
		for(String al1: al) {
			
			System.out.println(al1);
			
		}
		
		List<String> al2 = new ArrayList<String>();
		al2.addAll(al);

		
		Compare comp = new Compare();
		/*comp.compare(al2, b)
		Collections.sort(al2, comp);*/
	
		
		Collections.sort(ts, comp);
		
		
		
		
		
		
		//Arrays.sort(al, comp);
		
		//Collections.sort(ts);
		
	
		
		
		

	}

}


class Element  {
	String setElement;

	public Element(String setElement) {
		super();
		this.setElement = setElement;
	}

	@Override
	public String toString() {
		return "Element [setElement=" + setElement + "]";
	}
	
	
}

class Compare implements Comparator<Element>{
	
	public int compare(Element a, Element b) {
		return a.setElement.compareToIgnoreCase(b.setElement);
				
			
	}
	
	
	
}
