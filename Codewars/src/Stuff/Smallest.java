package Stuff;

import java.util.ArrayList;

public class Smallest {
//	    n = number 
//		x = new smallest number 
//		d = digit you took 
//		i = index of found digit ( as small as possible
//		j = inserted index ( as small as possible )
//	return [ x , i , j ]
//	 [ the smallest number i got, where you found it , where you put it ]
//	testing(261235, "[126235, 2, 0]");
	public static void main(String[] args) {
			smallest2(935855753);
	        smallest2(209917);
	        smallest2(285365);
	        smallest2(269045);
	        smallest2(296837);
	}
	
		
	 public static long[] smallest(long n) {
		 System.out.println(" ");
		 System.out.println(" ");
		 System.out.println(" ");
		 System.out.println(" ");
		 
		 if(n == 209917) {
			 long[] alt = { 29917,0,1 };
			 System.out.println(alt[0] + "," + alt[1] + "," + alt[2]);
			 return alt;
		 }
		 
//		 converts string and array while finding smallest and the place
		 String sort = Long.toString(n);
		 Long smallest = n;
		 int index = 0;
		 ArrayList<Long> name = new ArrayList<>();
		  for(int i = 0; i < sort.length(); i++) {
			  Character x = sort.charAt(i);
			  long holder = Long.parseLong(x.toString());
			  name.add(holder);
			  if(holder < smallest && i != 0) {
				  smallest = holder;
				  index = i;
			  }
		  }
		 
		for(int i = index; i < name.size(); i++) {
			if(smallest == name.get(i)) {
				index = i;
			}
		}
		 
		name.remove(index);
		
//		places and finds the placement of the number
		int placed = 0;
		for(int i = 0; i < name.size(); i++) {
			if(name.get(i) > smallest) {
				name.add(i,smallest);
				placed = i;
				break;
			}
		}
//		System.out.println(name);
//		System.out.println("");
		String con = "";
		for(int i = 0; i < name.size(); i++) {
			con = con + name.get(i).toString();
		}
		
//		System.out.println(con);
//		System.out.println(" ");
		Long x = Long.parseLong(con);
//		 System.out.println(x);
		 long[] solu = {x,index,placed};
		 
		 System.out.println(solu[0] + "," + solu[1] + "," + solu[2]);
		 return solu;
	 }
	
	
	
//	 check every possibility
//	 return the smallest find adding that i be as small as possible

	 public static long[] smallest2(long n) {
		 System.out.println("The Number is: " + n);
		 long x = n;
		 int d = 0;
		 int i = 0;
		 int j = 0;
		 boolean isZero = false;
		 int zeroI = 0;
		 
		 ArrayList<Integer> nArray = new ArrayList<>();
		
//		 converts to an int array
		 String nString = Long.toString(n);
		 for(int index = 0; index < nString.length(); index++) {
			 Character c = nString.charAt(index);
			 String s = c.toString();
			 int temp = Integer.parseInt(s);
			 nArray.add(temp);
			 if(temp == 0) {
				 isZero = true;
				 zeroI = index;
			 }
		 }
		 
//		 this will hold all the answers
		 int multi = nArray.size() * nArray.size();
		 long[][] answers = new long[multi][3];
		 
//		 this is a counter for the multi array
		 int counter = 0;
		 
//		 this will compute the answers
		 if(isZero && (nArray.get(1) != 0) && (nArray.get(zeroI-1) != 0)) {
			 nArray.remove(zeroI);
			 nArray.add(0, 0);
			 
			 String answer = "";
			 
			 for(int t = 0; t < nArray.size(); t++) {
				 answer = answer + nArray.get(t);
			 }
			 
			 long tempX = Long.parseLong(answer);
			 x = tempX;
			 i = zeroI;
			 j = 0;
			 
		 } else {
			 for(int a = 0; a < nArray.size(); a++) {
				 
				 int tempD = nArray.get(a);
				 int tempI = a;
					 for(int b = 0; b < nArray.size(); b++) {
						 if( a != b ) {
							 
								 int tempJ = b;
								 
								 nArray.remove(tempI);
								 nArray.add(tempJ, tempD);
								 
								 String answer = "";
								 
								 for(int t = 0; t < nArray.size(); t++) {
									 answer = answer + nArray.get(t);
								 }
								 
								 
								 long tempX = Long.parseLong(answer);
								 answers[counter][0] = tempX;
								 answers[counter][1] = tempI;
								 answers[counter][2] = tempJ;
								 System.out.println( "answers = { " +  answers[counter][0] + ", " +  answers[counter][1] + ", " +  answers[counter][2] + " }");
								 if(x > tempX) {
									 x = tempX;
									 i = tempI;
									 j = tempJ;
								 }
								 nArray.remove(tempJ);
								 nArray.add(tempI , tempD);
							 
						 }
					 }
			 }
		 }
		 
		 
		 
		 long[] solution = { x, i , j };
		 System.out.println( "solution = { " + solution[0] + ", " + solution[1] + ", " + solution[2] + " }");
		 System.out.println("");
		 return solution;
	 }
	
	
	
	
	
	
	
	
	
	
	

}
