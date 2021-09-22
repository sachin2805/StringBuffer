package StringBuffer;

public class Replace {

	public static void main(String[] args) {
		 StringBuffer sb= new StringBuffer("I Like You");
		
		 System.out.println("Before replace() : "+sb);
		 System.out.println("After replace() : "+sb.replace(2,6, "Love"));//(startIndex , endIndex,Replacestring)

	}

}
/*OUTPUT
Before replace() : I Like You
After replace() : I Love You
*/