package org.test;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
         li.add(10);
         li.add(20);
         li.add(30);
        List<Integer> si=new ArrayList<>();
        si.add(30);
        si.add(40);
        si.add(50);
    // li.removeAll(si);
    // System.out.println(li);
     si.removeAll(li);
     System.out.println(si);
	}

}
