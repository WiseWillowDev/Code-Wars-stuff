package Stuff;

public class interviewquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(onlyLetters("h32352e253ll235o"));
	}
	
	public static String onlyLetters(String s) {
		String answer = "";
		for(int i = 0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i)) == false) {
				answer = answer + s.charAt(i);
			}
		}
		return answer;
	}

}
