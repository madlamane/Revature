package codingChallenge2;

public class WayToClimb {
	
	  public static int waysToClimb(int a){
		  if (a == 1 || a == 0)
	            return 1;
	        else
	        {
	            return waysToClimb(a-1) + waysToClimb(a-2); 
	        }       
		  
	  }
	  
	  public static int waysToClimb2(int b) {
		  if (b == 0 || b == 1)
	            return 1;
		  
		  int num1 = 1;
	      int num2 = 1;
	      
	      for (int i = 2; i <= b; i++)
	        {
	            num2 += num1;
	            num1 = num2 - num1;
	        }
	      return num2;
		  
	  }

	public static void main(String[] args) {
		 System.out.println(waysToClimb(1) + "\n");
	        System.out.println(waysToClimb(2)+ "\n");
	        System.out.println(waysToClimb(5));

	        System.out.println(waysToClimb2(1) + "\n");
	        System.out.println(waysToClimb2(2)+ "\n");
	        System.out.println(waysToClimb2(5));
		// TODO Auto-generated method stub

	}

}
