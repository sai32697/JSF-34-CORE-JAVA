package com.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample7 {
	public static void main(String[] args) {
		List<Integer> list=List.of(11,0,12,05,142,420,69,99,100);
			ArrayList<Integer>a1=new ArrayList<Integer>(list);
			System.out.println(a1);
			Collections.sort(a1);
			System.out.println(a1);
			
			
	}

}
