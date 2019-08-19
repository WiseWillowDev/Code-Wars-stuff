package Pkg;

import static org.hamcrest.CoreMatchers.containsString;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;

public class CodeWars {

//	590,788,780 - > 147,697,191
	public static void main(String[] args) {
	System.out.println(zeros(590788780));
	System.out.println(zeros(1000));
	double x = 590788780/147697191;
	System.out.println(x);
	System.out.println(1000/4);
	System.out.println(10000000/4);
	}
	
		 public static int zeros(int n) {
			  
		      int x = 0;
		      if(n >= 1000) {
		    	 x = n/4;
		    	 x=x-1;
		    	 
		      } else { 
		    	  x = n/5;
		       if(n >= 25){
		       x = x + (n/25);
		       }
		       }
		       
		      if(n >= 10000000) {
		    	  
		    	 x=x-1;
		      } 
		      if(n >= 1000000) {
		    	  x = n/4;
			    	 x=x-4;
		    	}
		      
		      
		       
//		       if( n >= 1000){
//		       x = x + ((n/1000)*9);
//		      
//		      x = x + ((n/1000) -1);
//		      
//		       }
//		       
//		       if( x > 240000000){
//		       x = x + -1 ;
//		       }
		       
//		       if(x > 10000000){
//		       x = x -2 ;
//		       }
		      return x;
		  }
//		BigInteger total = new BigInteger("1");
//		 for(int i = 1; i < n+1; i++ ) {
//			
//			total =  total.multiply(new BigInteger(String.valueOf(i))); 
//		
//			 System.out.println(total + " AT " + i + " with " + total.toString().length())   ;
//			
//		 }
		
//		 int y = 25;
//		 int x = 5;
//		 System.out.println(y/x);
//		 
//		 int a = 178756621;
//	    int b = 143005301;
//			 System.out.println(a - b);
	    
	
	
	
	
	
//		  @Test
//		  public void testZeros() throws Exception {
//		    assertThat(Solution.zeros(0), is(0)); 
//		    assertThat(Solution.zeros(6), is(1)); 
//		    assertThat(Solution.zeros(14), is(2));    
//		  }
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static long[] productFib(long prod) {
	    // your code
		ArrayList<Long> fib = new ArrayList<>();
		long [] result = {0,0,0};
		fib.add((long) 0);
		fib.add((long) 1);
		fib.add((long) 1);
		fib.add((long) 2);
		
		for(int i = 0; i < fib.size(); i++) {
			long answer = fib.get(i) * fib.get(i+1);
			if(answer == prod) {
				result[0] = fib.get(i);
				result[1] = fib.get(i+1);
				result[2] = 1;
				return result;
			} 
			if(answer > prod) {
				result[0] = fib.get(i);
				result[1] = fib.get(i+1);
				result[2] = 0;
				return result;
			}
			fib.add(fib.get(fib.size()-1)+fib.get(fib.size()-2));
		}
		
			return result;
	   }
	
	
	
	
//	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...
	
//	
//	productFib(714) # should return {21, 34, 1}, 
//            # since F(8) = 21, F(9) = 34 and 714 = 21 * 34
//
//productFib(800) # should return {34, 55, 0}, 
//            # since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 < 800 < 34 * 55

//	@Test
//	public void test1() {
//		long[] r = new long[] {55, 89, 1};
//		assertArrayEquals(r, ProdFib.productFib(4895));
//	}
//	@Test
//	public void test2() {
//		long[] r = new long[] {89, 144, 0};
//		assertArrayEquals(r, ProdFib.productFib(5895));
//	}
	
	
	
	
	
	
	public static String playPass(String s, int n) {
		// your code
		ArrayList<String> S = new ArrayList<>();
		String[] Upper = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String[] numbs = {"0","1","2","3","4","5","6","7","8","9"};		
		ArrayList<String> upper = new ArrayList<>();
		ArrayList<String> Result = new ArrayList<>();
		for(int i = 0; i < Upper.length; i++) {
			upper.add(Upper[i]);
		}
		for(int i = 0; i < s.length(); i++) {
			S.add(String.valueOf(s.charAt(i)));
		}
		
		for(int i = 0; i < S.size(); i++) {
			int counter = 0;
			for(int y = 0; y < upper.size(); y++) {
				if(S.get(i).equalsIgnoreCase(upper.get(y)) && counter == 0) {
					counter++;
					while(!S.get(i).equalsIgnoreCase(upper.get(0))) {
						upper.add(upper.get(0));
						upper.remove(0);
					}
					if(i%2 == 1) {
						S.set(i, upper.get(n).toLowerCase());
					} else {
					S.set(i, upper.get(n));
					}
				}
				
			}
		
			
			for(int y = 0; y < numbs.length; y++) {

				
				if(S.get(i).equals(numbs[y]) && counter == 0) {
			
					int holder = Integer.parseInt(S.get(i));
					int difference = 9-holder;
					S.set(i , Integer.toString(difference));
					counter++;
				}
			}
			
		}
		String result = "";
		for(int i = 0; i < S.size(); i++) {
			Result.add(S.get(S.size()-1-i));
		}
		for(int i = 0; i < Result.size(); i ++) {
			result = result + Result.get(i);
		}
		
		return result;
	}
	
//	shift each letter by a given number but the transformed letter must be a letter (circular shift),
//	replace each digit by its complement to 9,
//	keep such as non alphabetic and non digit characters,
//	downcase each letter in odd position, upcase each letter in even position (the first character is in position 0),
//	reverse the whole result.
//	#Example:
//
//	your text: "BORN IN 2015!", shift 1
//
//	1 + 2 + 3 -> "CPSO JO 7984!"
//
//	4 "CpSo jO 7984!"
//
//	5 "!4897 Oj oSpC"
	
//	public class PlayPassTest {
//
//		@Test
//		public void test1() {
//			assertEquals("!!!vPz fWpM J", PlayPass.playPass("I LOVE YOU!!!", 1));
//		}
//		
//		@Test
//		public void test4() {
//			assertEquals("4897 NkTrC Hq fT67 GjV Pq aP OqTh gOcE CoPcTi aO", 
//					PlayPass.playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2));
//		}
	
	
	
	
	
	public void ticketsStarter() {
		int[] numbers = {25,50,100};
		Random rand = new Random();
		
		int[] input = {numbers[rand.nextInt(3)],numbers[rand.nextInt(3)],numbers[rand.nextInt(3)],numbers[rand.nextInt(3)],numbers[rand.nextInt(3)],numbers[rand.nextInt(3)],numbers[rand.nextInt(3)],numbers[rand.nextInt(3)],numbers[rand.nextInt(3)],numbers[rand.nextInt(3)],numbers[rand.nextInt(3)],numbers[rand.nextInt(3)],numbers[rand.nextInt(3)],numbers[rand.nextInt(3)],numbers[rand.nextInt(3)]};
		
		for(int i = 0; i < input.length; i++) {
		System.out.println(input[i]);
		}
		
		
		
		
		System.out.println(Tickets(input));
		
	}

	public static String Tickets(int[] peopleInLine)  {
		System.out.println("");
		int Counter25 = 0;
		int counter50 = 0;
		int counter100 = 0;
		for(int i = 0; i < peopleInLine.length; i++) {
			if(peopleInLine[i] == 25) {
				Counter25++;
			}
			if(peopleInLine[i] == 50) {
				if(Counter25 < 1) {
					return "NO";
				}
				Counter25--;
				counter50++;
			}
			if(peopleInLine[i] == 100) {
				if(Counter25 < 1) {
					return "NO";
				}
				
				if(counter50 > 0) {
					Counter25--;
					counter50--;
					counter100++;
				} else if(Counter25 > 2) {
					Counter25 = Counter25 - 3;
					counter100--;
				} else {
					return "NO";
				}
			}
			
		}
		return "YES";
	}
		
		
		
		
		
		
//		int total = 0;
//		for(int i = 0; i < peopleInLine.length; i++) {
//			if(peopleInLine[i] == 25) {
//				total = total + peopleInLine[i];
//			} else {
//				int manage = peopleInLine[i] - 25;
//				if(total > manage) {
//					total = total+25;
//				} else {
//					return "NO";
//				}
//			}
//		}
//		
//		return "YES";
		
		
		
		
		
	
//		int Counter25 = 0;
//		int counter50 = 0;
//		int realCounter50 = 0;
//		int counter100 = 0;
//		for(int i = 0; i < peopleInLine.length; i++) {
//			if(peopleInLine[i] == 25) {
//				Counter25++;
//			}
//			if(peopleInLine[i] == 50) {
//				counter50++;
//			}
//			if(peopleInLine[i] == 100) {
//				counter100++;
//			}
//		}
//		System.out.println(Counter25);
//		System.out.println(counter50);
//		System.out.println(realCounter50);
//		System.out.println(counter100);
//		while(counter50 > 0) {
//			if(Counter25 < 1) {
//				return "NO";
//			}
//			Counter25--;
//			counter50--;
//			realCounter50++;
//			
//			
//		}
//		while(counter100 > 0) {
//			if(Counter25 < 1) {
//				return "NO";
//			}
//			
//			if(realCounter50 > 0) {
//				Counter25--;
//				realCounter50--;
//				counter100--;
//			} else if(Counter25 > 2) {
//				Counter25 = Counter25 - 3;
//				counter100--;
//			} else {
//				return "NO";
//			}
//			
//		}
//		System.out.println(Counter25);
//		System.out.println(counter50);
//		System.out.println(realCounter50);
//		System.out.println(counter100);
//		
//		return "YES";
		
	  
	
	
	
	
//	public class LineTests {
//	    @Test
//	    public void test1() {
//	      assertEquals("YES", Line.Tickets(new int[] {25, 25, 50}));
//	    }
//	   @Test
//	   public void test2() {
//	      assertEquals("NO", Line.Tickets(new int []{25, 100}));
//	    }
//	}
//	
	
	
	
	
	
	
	
	
	
	public static int sortDesc(final int num) {
	   
		String numb = Integer.toString(num);
		ArrayList<Integer> numbs = new ArrayList<>();
		int result = 0;
		for(int i = 0; i < numb.length(); i++) {
			int x = Integer.parseInt(String.valueOf(numb.charAt(i)));
			numbs.add(x);
		}
		for(int i = 0; i < numbs.size(); i++) {
			for(int y = 0; y < numbs.size()-1; y++) {
				if(numbs.get(y) < numbs.get(y+1)) {
					int holder = numbs.get(y+1);
					numbs.set(y+1 , numbs.get(y));
					numbs.set(y,holder);
				}
			}
		}
		String SResult = "";
		for(int i= 0; i < numbs.size(); i++) {
			
			SResult = SResult + Integer.toString(numbs.get(i));
			
		}
		result = Integer.parseInt(SResult);
		
		return result;
	  }
	
	
//	Input: 21445 Output: 54421
//
//	Input: 145263 Output: 654321
//
//	Input: 1254859723 Output: 9875543221
	
//	public class DescendingOrderTest {
//
//	    @Test
//	    public void test_01() {
//	        assertEquals(0, DescendingOrder.sortDesc(0));
//	    }    
//
//	    @Test
//	    public void test_02() {
//	        assertEquals(51, DescendingOrder.sortDesc(15));
//	    }
//	    
//
//	    @Test
//	    public void test_03() {
//	        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
//	    }
//	
	
	
	
	
	
	
	
	public static boolean isValid(String braces) {
		String holder = "";
		for (int i = 0; i < braces.length(); i++) {

			char x = braces.charAt(i);
			if (x == '{' || x == '(' || x == '[') {
				holder = holder + x;
//				System.out.println("found opening");
			}
			if(!holder.equals("")) {
			if (x == '}') {
//				System.out.println("Found closing");

				if (holder.charAt(holder.length() - 1) == '{') {
//					System.out.println("removed");
					holder = holder.substring(0, holder.length() - 1);
				} else {
					return false;
				}
			}

			if (x == ')') {
//				System.out.println("Found closing");

				if (holder.charAt(holder.length() - 1) == '(') {
//					System.out.println("removed");
					holder = holder.substring(0, holder.length() - 1);
				} else {
					return false;
				}
			}

			if (x == ']') {
//				System.out.println("Found closing");

				if (holder.charAt(holder.length() - 1) == '[') {
//					System.out.println("removed");
					holder = holder.substring(0, holder.length() - 1);
				} else {
					return false;
				}
			}

		} else if (x == '}' || x == ')' || x == ']') {
			return false;
		}
		}

//		System.out.println(holder);
		if (holder.equals("")) {
			return true;
		} else {
			return false;
		}
		
		//"(){}[]"   =>  True
		//"([{}])"   =>  True
		//"(}"       =>  False
		//"[(])"     =>  False
		//"[({})](]" =>  False

		//public class BraceCheckerTests {
		//
//			  private BraceChecker checker = new BraceChecker();
		//
//				@Test
//				public void testValid() {
//			    assertEquals(true, checker.isValid("()"));
//				}
//			  
//			  @Test
//				public void testInvalid() {
//			    assertEquals(false, checker.isValid("[(])"));
//				}
		//
//			}
	}
}


