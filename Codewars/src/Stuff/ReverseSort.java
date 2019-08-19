package Stuff;

import java.util.ArrayList;

public class ReverseSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static long longInput(long n) {
		// TODO Auto-generated method stub
		String nString = Long.toString(n);
		ArrayList<Integer> nArray = new ArrayList<>();
		
		for(int i = 0; i < nString.length(); i++) {
			nArray.add(Character.getNumericValue(nString.charAt(i)));
		}
		
		ArrayList<Integer> sorted = new ArrayList<>();
		for(int i = 0; i < nArray.size(); i++) {
			int biggest = nArray.get(0);
			int index = 0;
			
			for(int j = 0; j < nArray.size(); j++) {
				if(nArray.get(j) > biggest) {
					biggest = nArray.get(j);
					index = j;
				}
				
			}
			sorted.add(biggest);
			nArray.remove(index);
			nArray.add(index, 0);
		}
		
		System.out.println(sorted);
		
		String answer = "";
		for(int i = 0; i < sorted.size(); i++) {
			answer = answer + sorted.get(i);
		}
		n = Long.parseLong(answer);
		return n;
	}

	public static long[] longArrayInput(long[] longArray) {
		// TODO Auto-generated method stub
		long[] lArray = new long[longArray.length];		
		
		for(int i = 0; i < longArray.length; i ++) {
			long biggest = 0;
			int index = 0;
			for(int j = 0; j < longArray.length; j++) {
				if(longArray[j] > biggest) {
					biggest = longArray[j];
					index = j;
				}
			}
			lArray[i] = biggest;
			longArray[index] = 0;
		}
		
		
		return lArray;
	}

}
