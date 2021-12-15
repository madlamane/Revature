package codingChallenge2;

public class AlmostPalindrome {
	
	public static boolean almostPalindrome(String s) {
		
		int length= s.length();
		int count = 0;
		
		for (int i=0; i<length/2; i++) {
			if (s.charAt(i) != s.charAt((length-1) - i)) {
				count++;
				if(count>1)
					return false;
				
			}
		}
		return count ==1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(almostPalindrome("abcdcbg") + "\n");
        System.out.println(almostPalindrome("abccia")+ "\n");
        System.out.println(almostPalindrome("abcdaaa"));

	}

}
