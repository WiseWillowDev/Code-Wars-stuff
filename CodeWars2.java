package Pkg;

import java.util.ArrayList;
import java.util.List;

public class CodeWars2 {

	public static void main(String[] args) {
		String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
		int n = 3;

		String holder = WhoIsNext(names, n);
		System.out.println("");
		System.out.println(holder);
	}

	public static String WhoIsNext(String[] names, int n) {
		int x = 1;
		int total = names.length;
		ArrayList<Integer> numbs = new ArrayList<>();
		numbs.add(total);
		for (int i = 1; total < n; i++) {
			x = x * 2;
			total = total + (x * 5);
			numbs.add(total);
		}
		for (int i = 0; i < numbs.size(); i++) {
			System.out.println(numbs.get(i));
		}
		int holder = 0;
		if (n > 5) {

			int bigger = numbs.get(numbs.size() - 1);
			int smaller = numbs.get(numbs.size() - 2);
			int differece = bigger - smaller;
			int number = differece / 5;
			int fin = smaller;
			holder = 0;
			for (int i = 0; fin < n; i++) {
				fin = fin + number;
				holder = i;
			}
		} else {
			holder = n - 1;
		}

		System.out.println(holder);
		return names[holder];
	}

	public static int expo(int baseNumb, int powerOf) {
		int total = 1;
		for (int i = 0; i < powerOf; i++) {
			total = total * baseNumb;
		}
		return total;
	}

//	public static String WhoIsNext(String[] names, int n)
//    {
//       // Your code is here...
//		ArrayList<String> lines = new ArrayList<>();
//		for(int i = 0; i < names.length; i++) {
//			lines.add(names[i]);
//		}
//		if(n == 1) {
//			return lines.get(0);
//		}
//		for(int i = 0; i < n; i ++) {
//			
//			String holder = lines.get(0);
////			System.out.println(holder);
//			lines.remove(0);
//			lines.add(holder);
//			lines.add(holder);
//			if(i%100 == 0) {
//				System.out.println(lines.size());
//			}
//			
//		}
//		
//		
//		
//		return lines.get(0);
//     }

//	  @Test
//	    public void test1() {
//	      String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
//	      int n = 1;  
//	      assertEquals("Sheldon", new Line().WhoIsNext(names, n));
//	    }
//	   @Test
//	    public void test2() {
//	      String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
//	      int n = 6;  
//	      assertEquals("Sheldon", new Line().WhoIsNext(names, n));
//	    }

	public static int countSmileys(List<String> arr) {
		// Just Smile :)
		int smileCounter = 0;
		for (int i = 0; i < arr.size(); i++) {
			boolean eyes = false;
			boolean mouth = false;
			for (int y = 0; y < arr.get(i).length(); y++) {

				if (arr.get(i).charAt(y) == ':' || arr.get(i).charAt(y) == ';') {
					eyes = true;
				}
				if (y == 1 || y == 2) {
					if (arr.get(i).charAt(y) == 'D' || arr.get(i).charAt(y) == ')' && (arr.get(i).charAt(y - 1) == ':'
							|| arr.get(i).charAt(y - 1) == ';' || arr.get(i).charAt(y - 1) == '-')
							&& (y == arr.get(i).length() - 1)) {
						mouth = true;
					}
				}
				if (mouth && eyes) {
					smileCounter++;
				}
			}

		}
		return smileCounter;
	}

	static String toCamelCase(String s) {
		String result = "";
		boolean newWord = false;

		for (int i = 0; i < s.length(); i++) {

			if (!(s.charAt(i) == '-') && !(s.charAt(i) == '_')) {
				if (newWord) {
					result = result + Character.toUpperCase(s.charAt(i));
					newWord = false;
//				    	System.out.println("UpperCase");
				} else if (i == 0) {

					result = result + s.charAt(i);

				} else {
					result = result + Character.toLowerCase(s.charAt(i));
				}
			} else {
				newWord = true;
			}

		}

		return result;
	}

}
