package pt.upacademy.desafios.desafio4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio {

	public static int[] ints(String string) {

		String[] newString = string.split(" ");

		System.out.println(Arrays.toString(newString));

		List<String> finalArray = new ArrayList<String>();

		if (string.equals("")) {
			int[] emptyArr= {};
			return emptyArr;
			
		}
		
		else {
		for (int i = 0; i < newString.length; i++) {

			if (newString[i].matches("^[0-9]*$")) {
				finalArray.add(newString[i]);
			}
		}

		
		int [] arr= finalArray.stream().mapToInt(Integer::parseInt).toArray();
		System.out.println(finalArray);
//		Integer.parseInt(finalArray);
//
//		return finalArray;
		return arr;
		}
	}

}
