package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
	
	public static void main (String[] args) {
		List<?> myObjs = new ArrayList<Object>();
		List<Integer> myNumber = new ArrayList<Integer>();
		myObjs = myNumber;
		
		Object obj;
		Integer x = 10;
	}

}
